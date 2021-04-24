package testHomePage;

import common.WebAPI;
import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends WebAPI {

    HomePage homePage;

    @BeforeMethod
    public void driverSetup(){
        homePage= PageFactory.initElements(driver,HomePage.class);
    }

    @Test(enabled = false)
    public void validateSignInFunctionality() throws InterruptedException {
        homePage.loginFunctionality();
    }

    @Test(enabled = false)
    public void validateCheckBox() throws InterruptedException{
        homePage.validateCheckBox();
    }

    @Test(enabled = false)
    public void validateTestStepsForRegisterPage() throws InterruptedException {
        homePage.validateTestStepsForRegisterPage();
    }

    @Test(enabled = false)
    public void validateSignUpPageUrl() throws InterruptedException{
        homePage.validateSignUpPageUrl();
    }
    @Test(enabled = false)
    public void validatePageDOMHeading() throws InterruptedException{
        homePage.validatePageDOMHeading();
    }

    @Test
    public void validateRegistrationPageDisplayed() throws InterruptedException {
        homePage.validateRegistrationPageDisplayed();
    }


}
