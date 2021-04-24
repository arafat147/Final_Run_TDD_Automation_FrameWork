package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class HomePage extends WebAPI {

    @FindBy(xpath = "//input[@name='emailid']") public WebElement searchfield;
    @FindBy(xpath = "//input[@name='btnLogin']") public WebElement searchButton;
    @FindBy(xpath = "//form[@name = 'frmLogin']") public WebElement form;

    public void alertHandling() throws InterruptedException {
        form.click();
        Thread.sleep(3000);
        searchfield.sendKeys("asdf");
        Thread.sleep(3000);
        searchButton.click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        //to cancel the box:
        // driver.switchTo().alert().dismiss():
    }


}
