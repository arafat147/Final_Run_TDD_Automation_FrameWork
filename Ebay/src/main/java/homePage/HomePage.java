package homePage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import reporting.ExtentManager;
import reporting.ExtentTestManager;

import java.util.List;

public class HomePage extends WebAPI {

    @FindBy(css = "input#gh-ac") public WebElement searchBar;
    @FindBy(css = "input#gh-btn") public WebElement searchButton;
    @FindBy(css = "select#gh-cat") public WebElement dropDownButton;
    @FindBy(css = "select#gh-cat>option") public WebElement cssDdropDownButtonList;
    @FindBy(xpath = "//select[@id='gh-cat']/option") public WebElement dropDownList;
    @FindBy(xpath = "(//img[@crossorigin='anonymous'])[1]") public WebElement scrollDownToElement;
    @FindBy(linkText = "Motors") public WebElement motors;
    @FindBy(linkText = "Motorcycles") public WebElement motorcycles;
    @FindBy(xpath = "//span[@id='gh-ug']//a[contains(text(),'Sign in')]") public WebElement signInButton1;
    @FindBy(css = "input#userid") public WebElement userIdField;
    @FindBy(css = "button[id*='signin-con") public WebElement continueButton;
    @FindBy(css = "input#pass") public WebElement passwordField;
    @FindBy(css = "#sgnBt") public WebElement signInButton2;




    public void validateSearchField() throws InterruptedException {
        searchBar.sendKeys("Java Books");
        Thread.sleep(2000);
        searchButton.click();
        ExtentTestManager.log("SearchField had been validated");
    }

    public void searchFieldValidation2(String data) throws InterruptedException {

        searchBar.sendKeys(data);
        Thread.sleep(3000);
        searchButton.click();

    }

    public void validateDropDown() throws InterruptedException {
        dropDownButton.click();
        Thread.sleep(3000);
        String data = dropDownButton.getText();
        System.out.println(data);
        //to get the number of elements inside the dropdown:
        List<WebElement> dropDown = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
        System.out.println(dropDown.size());
        //to select a particular element:
        dropDown.get(10).click();
        Thread.sleep(3000);
        searchButton.click();
        Thread.sleep(4000);
    }
    //another approach by css selector for dropdown list:
    public void validateDropDownCss() throws InterruptedException{

        dropDownButton.click();
        Thread.sleep(3000);
        String data = cssDdropDownButtonList.getText();
        System.out.println(data);
        List<WebElement> dropdownList = driver.findElements(By.cssSelector("select#gh-cat>option"));
        System.out.println(dropdownList.size());
        dropdownList.get(12).click();
        searchButton.click();
        Thread.sleep(4000);


    }

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1500)");
        Thread.sleep(3000);
    }

    public void scrollDownToElement() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("(//img[@crossorigin='anonymous'])[1]"));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true)",element);
        Thread.sleep(3000);
        scrollDownToElement.click();
        Thread.sleep(3000);
    }

    public void mouseHovering() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(motors).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Motorcycles")).click();
        Thread.sleep(3000);
    }

    public void navigateBackToRefresh() throws InterruptedException {
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.navigate().back();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().forward();
    }

    //for drag and drop, look into Jquery module::
    //for alert handling, look into Guru99 module::

    //*****Its very important to validate every test cases: in the following we will practice with register page:
    public void validateTestStepsForRegisterPage(){
        //we did it in FREE CRM WEBSITE.
    }


}
