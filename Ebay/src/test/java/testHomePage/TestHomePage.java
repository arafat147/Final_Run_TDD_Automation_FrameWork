package testHomePage;

import common.WebAPI;
import dataProvider.DataProviders;
import homePage.HomePage;
import lombok.Data;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestHomePage extends WebAPI {

    HomePage homePage;
    DataProviders dataProviders;

    @BeforeMethod
    public void driverSetup(){
         homePage = PageFactory.initElements(driver,HomePage.class);
    }

    @Test
    public void testSearchField() throws InterruptedException {
        homePage.validateSearchField();
    }


    //Below test cases are for data provider:
    //sign in functionality is given in FREE CRM Module: for ebay it's not accessing :
    //steps: first we need to parameterize with data provider class and name:
    @Test(dataProviderClass = DataProviders.class,dataProvider = "SearchData",enabled = false)
    //then: we need to parameterize our method according to as many field it will provide the data: for this one we
    //want to provide data to the searchfield only: that's why String(data) is parameterized
    public void searchFieldValidation2(String data){
        //finally: we just need to initialize the variable:
        homePage.searchBar.sendKeys(data);
        homePage.searchButton.click();
    }
    @Test(dataProviderClass = DataProviders.class,dataProvider = "SearchData2",enabled = false)
    public void validateSearchField3(String data){
        homePage.searchBar.sendKeys(data);
        homePage.searchButton.click();
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "search data",enabled = false)
    public void validateSearchField4(String data){
        homePage.searchBar.sendKeys(data);
        homePage.searchButton.click();
    }

    @Test(dataProviderClass = DataProviders.class,dataProvider = "Credentials",enabled = false)
    public void validateSignInCredentials(String userName, String password) throws InterruptedException {
        homePage.signInButton1.click();
        Thread.sleep(3000);
        homePage.userIdField.sendKeys(userName);
        Thread.sleep(3000);
        homePage.continueButton.click();
        homePage.passwordField.sendKeys(password);
        Thread.sleep(3000);
        homePage.signInButton2.click();
        Thread.sleep(3000);
    }




    @Test(enabled = false)
    public void testDropDown() throws InterruptedException {
        homePage.validateDropDown();
    }

    @Test(enabled = false)
    public void validateScrollDown() throws InterruptedException{
        homePage.validateDropDown();
    }

    @Test(enabled = false)
    public void validateScrollDownToElement() throws InterruptedException{
        homePage.scrollDownToElement();
    }

    @Test(enabled = false)
    public void validateMouseHovering() throws InterruptedException{
        homePage.mouseHovering();
    }

    @Test(enabled = false)
    public void navigateBackToRefresh() throws InterruptedException{
        homePage.navigateBackToRefresh();
    }


}
