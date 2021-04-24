package testHomePage;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends WebAPI {

    HomePage homePage;

    @BeforeMethod
    public void driverSetup(){
        homePage = PageFactory.initElements(driver,HomePage.class);
    }

    @Test
    public void validateAlertHandling() throws InterruptedException {
        homePage.alertHandling();
    }

}
