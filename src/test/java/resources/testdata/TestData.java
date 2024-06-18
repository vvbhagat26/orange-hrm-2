package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    //Data provider to UserTest
    @DataProvider(name = "UsersTest")
    public Object[][] getData1(){
        Object[][] data1=new Object[][]{
                {"Admin","Admin","Paul Collings","Enable"},
                {"Cassidy.Hope","ESS","Cassidy Hope","Enable"},
                {"Nina.Patel","ESS","Nina Patel","Enable"},
                {"Odis.Adalwin","Admin","Odis Adalwin","Enable"}
        };
        return data1;
    }


    //Data provider to LoginTest
    @DataProvider(name = "LoginTest")
    public Object[][] getData(){
        Object[][] data=new Object[][]{
                {"","","Required"},
                {"test123@gmail.com","","Required"},
                {"","test123","Required"},
                {"test123@gmail.com","test123","Invalid credentials"}
        };
        return data;
    }

    //Data provider to UserTest
}
