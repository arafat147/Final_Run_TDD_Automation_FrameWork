package dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviders {

//    @DataProvider(name = "SearchData")
//    public Object[] getSearchData(){
//        return new Object[]{"Java Books", "Selenium Books","Core Java Books" };
//    }

    //Steps:-->
    //first: we need to use the data provider parameter and give it a name:
    @DataProvider(name = "SearchData")
    //second: we need to create a method that will return Object of array [] :
    public Object[] getSearchData() {
        //third: we need to write what it will return us for the test case: the following is for search field box
        // that's why we have one array here:
        return new Object[]{"Phones", "electronics", "Laptops"};
    }

    @DataProvider(name = "SearchData2")
    public Object[] getSearchData2(){
        return new Object[]{"Mobile Accessories"};
    }

    @DataProvider(name = "search data")
    public Object[] getSearchData3(){
        return new Object[]{"Mobile"};
    }

    @DataProvider(name = "Credentials")
    public Object[][] getCredentials(){
        return  new  Object[][] {{"arafat.rahman93@gmail.com","arafat@ad1579591"},
                                 {"arafat.rahman93@gmail.com","arafat@ad1579591"}};
    }

}
