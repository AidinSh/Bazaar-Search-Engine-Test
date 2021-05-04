package TestData;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider
    public static Object[][] searchQueries(){
        return new Object[][]{
                {"بازی"},
                {"برنامه"},
                {"دیوار"},
                {"divar"}
        };
    }
}
