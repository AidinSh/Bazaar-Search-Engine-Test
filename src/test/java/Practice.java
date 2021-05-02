import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Practice {

    @DataProvider
    public static Object[][] zipCodes(){
        return new Object[][]{
                {"us", "90210", "Beverly Hills"},
                {"ca", "B2R", "Waverley"}
        };
    }

    @Test(dataProvider = "zipCodes")
    void getInfo(String country, String code, String state){
        given().
                pathParam("countryCode", country).pathParam("code", code).
        when().
                get("http://api.zippopotam.us/{countryCode}/{code}").
        then().
                assertThat().
                body("places[0].'place name'", equalTo(state));
    }

    @Test
    void SearchTest(){
        //SearchRequest searchRequest = new SearchRequest("test");
        RequestProperties requestProperties = new RequestProperties();
        given().
                contentType(ContentType.JSON).
                body(requestProperties).
                log().body().
        when().
                post("https://api.cafebazaar.ir/rest-v1/process/SearchV2Request").
        then().
                log().all();
    }
}
