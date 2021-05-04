import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import Bodies.RequestProperties;
import Requests.PredictionRequest;
import Requests.SearchV2Request;
import TestData.DataProviders;
import io.restassured.http.ContentType;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Practice {

    TestScenarios testScenarios = new TestScenarios();
    String base_url = "https://api.cafebazaar.ir/rest-v1/process";
    String query = "بازی";

    @Test(priority = 1, dataProvider = "searchQueries", dataProviderClass = DataProviders.class)
    void searchTest(String query){
        testScenarios.searchQuery(base_url, query);
        testScenarios.openSearchBox(base_url, query);
    }

    @Test(priority = 2)
    void predictionTest(String query){
        PredictionRequest predictionRequest = new PredictionRequest();
        given().
                contentType(ContentType.JSON).
                body(predictionRequest).
        when().
                post(base_url + "/PredictionRequest").
        then().
                assertThat().body("singleReply.predictionReply.items[0].title", is(query)).
                log().all();

    }


}
