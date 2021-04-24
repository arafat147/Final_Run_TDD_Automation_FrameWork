package signInFunctionalityDataProvider;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInWithDataProvider extends WebAPI  {

    @FindBy(css = "a.btn.btn-primary.btn-xs-2.btn-shadow.btn-rect.btn-icon.btn-icon-left")
    public WebElement loginButton;
    @FindBy(xpath = "//input[@name ='email']")
    public WebElement emailBox;
    @FindBy(xpath = "//input[@name ='password']")
    public WebElement passwordBox;
    @FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
    public WebElement loginButton2;

}
