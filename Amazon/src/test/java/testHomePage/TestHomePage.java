package testHomePage;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends WebAPI {

    HomePage homePage;
    @BeforeMethod
    public void initSetup(){
        homePage = PageFactory.initElements(driver,HomePage.class);
    }

    @Test(enabled = false)
    public void testSearchBoxField() throws InterruptedException {
        homePage.searchField();
    }

    @Test(enabled = false)
    public void testMouseHovering() throws InterruptedException {
        homePage.validateMouseHovering();
    }

    @Test(enabled = false)
    public void testNavigatingToBackForwardRefresh() throws InterruptedException {
        homePage.navigatingToBackForwardRefresh();
    }
    @Test
    public void validateScrollDown(){
        homePage.scrollDown();
    }

}
