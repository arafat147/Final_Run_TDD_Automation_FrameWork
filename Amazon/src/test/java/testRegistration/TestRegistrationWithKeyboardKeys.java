package testRegistration;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import registration.RegistrationWithKeyboardKeys;

public class TestRegistrationWithKeyboardKeys extends WebAPI {

    RegistrationWithKeyboardKeys registrationWithKeyboardKeys;
    @BeforeMethod
    public void initSetup(){
        registrationWithKeyboardKeys = PageFactory.initElements(driver, RegistrationWithKeyboardKeys.class);
    }

    @Test
    public void testKeyboardFeatures() throws InterruptedException {
        registrationWithKeyboardKeys.keyboardFeatures();
    }

}
