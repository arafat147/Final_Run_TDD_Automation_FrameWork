package homepage;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

    //TO START REVISING, START WITH EBAY::
    // FOR drag and drop, look into Jquery module::
    // FOR alert handling, look into Guru99 module::
    // FOR SCROLL DOWN, MOUSE HOVERING, NAVIGATION FOLLOW AMAZON::
    // FOR CUSTOM XPATH AND CSS SELECTOR FOLLOW FREECRM::


    //find by annotation: second approach:
    @FindBy(css = searchBoxFieldElement) public WebElement searchbox;
    @FindBy(xpath = searchButtonElement) public WebElement searchButton;
    @FindBy(xpath = searchLaptopText) public WebElement searchLaptop;
    @FindBy(css = accountListWebElement) public WebElement accountList;


    public void searchField() throws InterruptedException {
        searchbox.sendKeys("Mac Laptop");
        Thread.sleep(4000);
        searchButton.click();
        Thread.sleep(4000);
        String actualResult= searchLaptop.getText();
        Thread.sleep(4000);
        Assert.assertEquals(actualResult,"\"Mac Laptop\"","Keyword did not match");
    }

    public void validateMouseHovering() throws InterruptedException {

        Actions action = new Actions(driver);
        action.moveToElement(accountList).build().perform();
        Thread.sleep(4000);

    }

    public void navigatingToBackForwardRefresh() throws InterruptedException {
        System.out.println( "Page Title is: " +driver.getTitle());
        driver.navigate().to("https://www.ebay.com/");
        Thread.sleep(5000);
        System.out.println( "Page Title is: " +driver.getTitle());
        driver.navigate().back();
        Thread.sleep(5000);
        System.out.println( "Page Title is: " +driver.getTitle());
        driver.navigate().forward();
        Thread.sleep(5000);
        System.out.println( "Page Title is: " +driver.getTitle() );
        driver.navigate().back();
        Thread.sleep(5000);
        System.out.println( "Page Title is: " +driver.getTitle() );
        driver.navigate().refresh();
        Thread.sleep(5000);
    }


    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000)");
    }

}
