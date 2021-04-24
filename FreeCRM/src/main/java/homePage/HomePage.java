package homePage;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.ExtentTestManager;

import java.io.IOException;
import java.time.Duration;

public class HomePage extends WebAPI {

    //CUSTOM XPATH:: https://www.youtube.com/watch?v=3uktjWgKrtI&t=2s
    //CUSTOM CSS SELECTOR: https://www.youtube.com/watch?v=VYIDZ57mMy4

    /*

     */

    @FindBy(css = "a.btn.btn-primary.btn-xs-2.btn-shadow.btn-rect.btn-icon.btn-icon-left")
    public WebElement loginButton;
    @FindBy(xpath = "//input[@name ='email']")
    public WebElement emailBox;
    @FindBy(xpath = "//input[@name ='password']")
    public WebElement passwordBox;
    @FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
    public WebElement loginButton2;

    @FindBy(xpath = "//div[@class='menu-item-wrapper'][1]") public WebElement homeLogo;
    @FindBy(xpath = "//span[text()='Contacts']") public WebElement contactLogo;
    @FindBy(xpath = "//span[text()='Arafat Patwary Rabby']") public WebElement name;
    @FindBy(xpath = "//a[text()='asdrf asdf asdf']//parent::td//preceding-sibling::td//div") public WebElement checkBox1;
    @FindBy(xpath = "//a[text()='Sign Up']") public WebElement signUpButton;
    @FindBy(xpath = "//h2[text()='Register']") public WebElement registerHeading;
    @FindBy(css = "input[placeholder='Email Address") public WebElement emailAddressText;




    public void loginFunctionality() throws InterruptedException {
        loginButton.click();
        Thread.sleep(4000);
        emailBox.click();
        Thread.sleep(4000);
        emailBox.sendKeys("arafat.rahman93@gmail.com");
        Thread.sleep(4000);
        passwordBox.click();
        Thread.sleep(4000);
        passwordBox.sendKeys("arafat147");
        Thread.sleep(4000);
        loginButton2.click();
        Thread.sleep(4000);
    }

    public void loginFunctionalityWithKeyBoardFeature() throws InterruptedException {
        loginButton.click();
        Thread.sleep(4000);
        emailBox.click();
        Thread.sleep(4000);
        Actions actions = new Actions(driver);
        actions.sendKeys("arafat.rahman93@gmail.com")
                .pause(Duration.ofSeconds(2))
                .sendKeys(Keys.TAB)
                .pause(Duration.ofSeconds(2))
                .sendKeys("arafat147")
                .pause(Duration.ofSeconds(2)).build().perform();
        loginButton2.click();

    }

    public void validateCheckBox() throws InterruptedException {

        // for this we need to copy some actions from the above method because
        // we can do the checkbox functionality once we sign in:

        loginButton.click();
        Thread.sleep(4000);
        emailBox.click();
        Thread.sleep(4000);
        Actions actions = new Actions(driver);
        actions.sendKeys("arafat.rahman93@gmail.com")
                .pause(Duration.ofSeconds(2))
                .sendKeys(Keys.TAB)
                .pause(Duration.ofSeconds(2))
                .sendKeys("arafat147")
                .pause(Duration.ofSeconds(2)).build().perform();
        loginButton2.click();
        // after we sign in::

        actions.moveToElement(homeLogo);
        contactLogo.click();
        Thread.sleep(3000);
        name.click();
        Thread.sleep(3000);
        checkBox1.click();
        Thread.sleep(3000);

    }


    //*****Its very important to validate every test cases: in the following we will practice with register page:
    public void validateTestStepsForRegisterPage() throws InterruptedException {

        loginButton.click();
        Thread.sleep(3000);
        signUpButton.click();
        ExtentTestManager.log("Sign up Page Displayed Properly");
    }
    public void validateSignUpPageUrl() throws InterruptedException {
        loginButton.click();
        Thread.sleep(3000);
        signUpButton.click();
        Thread.sleep(3000);
        String actualResult= driver.getCurrentUrl();
        System.out.println(actualResult);
        String expectedResult= "https://api.cogmento.com/register/";
        Assert.assertEquals(actualResult,expectedResult,"url did not change");
        ExtentTestManager.log("Url had changed");
    }
    public void validatePageDOMHeading() throws InterruptedException {
        loginButton.click();
        Thread.sleep(3000);
        signUpButton.click();
        ExtentTestManager.log("Registration page displayed");
        Thread.sleep(3000);
        boolean flag = registerHeading.isDisplayed();
        Assert.assertEquals(registerHeading.isDisplayed(),flag);
        ExtentTestManager.log("Register Heading Had Been Displayed");

    }

    public void validateRegistrationPageDisplayed() throws InterruptedException {
        loginButton.click();
        Thread.sleep(3000);
        signUpButton.click();
        Assert.assertTrue(emailAddressText.isDisplayed());
        ExtentTestManager.log("email address placeholder is is displayed");
    }








}
