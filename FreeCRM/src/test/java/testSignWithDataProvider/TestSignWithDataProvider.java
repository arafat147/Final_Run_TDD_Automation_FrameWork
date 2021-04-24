package testSignWithDataProvider;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import signInFunctionalityDataProvider.DataProviders;
import signInFunctionalityDataProvider.SignInWithDataProvider;

public class TestSignWithDataProvider extends WebAPI {
    SignInWithDataProvider signInWithDataProvider;

    @BeforeMethod
    public void driverSetup(){
        signInWithDataProvider = PageFactory.initElements(driver,SignInWithDataProvider.class);
    }

    @Test(dataProviderClass = DataProviders.class,dataProvider = "credentials")
    public void validateSignInWithCredentials(String userName, String password) throws InterruptedException {
        signInWithDataProvider.loginButton.click();
        Thread.sleep(3000);
        signInWithDataProvider.emailBox.sendKeys(userName);
        Thread.sleep(3000);
        signInWithDataProvider.passwordBox.sendKeys(password);
        Thread.sleep(3000);
    }

    @AfterMethod
    public void driverQuit(){
        driver.quit();
    }

}
