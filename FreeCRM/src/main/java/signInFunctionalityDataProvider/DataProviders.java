package signInFunctionalityDataProvider;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "credentials")
    public Object[][] getCredentials(){
        return new Object[][]{
                {"arafat.rahman93@gmail.com","arafat147"},
                {"arafat.rahman93@gmail.com","arafat147"}
        };
    }
}
