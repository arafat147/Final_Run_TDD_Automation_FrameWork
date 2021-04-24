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

    @Test(groups = "RegressionTest")
    public void validateSignInFunctionality() throws InterruptedException {
        homePage.loginFunctionality();
    }

    @Test(groups = "SmokeTest")
    public void validateCheckBox() throws InterruptedException{
        homePage.validateCheckBox();
    }

    @Test(groups = "SmokeTest")
    public void validateTestStepsForRegisterPage() throws InterruptedException {
        homePage.validateTestStepsForRegisterPage();
    }

    @Test(groups = "SmokeTest")
    public void validateSignUpPageUrl() throws InterruptedException{
        homePage.validateSignUpPageUrl();
    }
    @Test(groups = "SmokeTest")
    public void validatePageDOMHeading() throws InterruptedException{
        homePage.validatePageDOMHeading();
    }

    @Test(groups = "RegressionTest")
    public void validateRegistrationPageDisplayed() throws InterruptedException {
        homePage.validateRegistrationPageDisplayed();
    }


}
