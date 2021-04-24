package registration;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class RegistrationWithKeyboardKeys extends WebAPI {

    @FindBy(css = "a#createAccountSubmit") public WebElement createAccountButton;
    @FindBy(css = "a#nav-link-accountList") public WebElement accountListAndSignInElement;
    @FindBy(xpath = "//*[@id=\"nav-flyout-ya-newCust\"]/a") public WebElement startHereLinkElement;
    @FindBy(css = "input#ap_customer_name") public WebElement yourNameFieldELement;

    public void keyboardFeatures() throws InterruptedException {

        Actions action = new Actions(driver);
        action.moveToElement(accountListAndSignInElement).build().perform();
        startHereLinkElement.click();
        Thread.sleep(5000);
        yourNameFieldELement.sendKeys("arafat rabby");
        action.sendKeys(Keys.ENTER)
                .pause(Duration.ofSeconds(2))
                .sendKeys(Keys.TAB)
                .pause(Duration.ofSeconds(3))
                .sendKeys("arafat.rahman93@gmail.com")
                .pause(Duration.ofSeconds(3))
                .sendKeys(Keys.SHIFT,Keys.TAB)
                .pause(Duration.ofSeconds(3))
                .sendKeys(Keys.TAB)
                .pause(Duration.ofSeconds(3))
                .sendKeys("arafat@ad1579591").build().perform();

    }

    public void validateKeyboardFeatures() throws InterruptedException{
        accountListAndSignInElement.click();
        Thread.sleep(3000);
        createAccountButton.click();
        Thread.sleep(3000);
        yourNameFieldELement.sendKeys("arafat");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER)
                .pause(Duration.ofSeconds(2))
                .sendKeys(Keys.TAB)
                .pause(Duration.ofSeconds(2))
                .sendKeys("arafat.rahman93@gmail.com")
                .pause(Duration.ofSeconds(2))
                .sendKeys(Keys.SHIFT,Keys.TAB)
                .pause(Duration.ofSeconds(3))
                .sendKeys(Keys.TAB)
                .pause(Duration.ofSeconds(3))
                .sendKeys("arafat@ad1579591").build().perform();

    }


}
