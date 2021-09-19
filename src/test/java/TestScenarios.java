import Requests.PredictionRequest;
import Requests.SearchV2Request;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class TestScenarios {
    public void searchQuery(String base_url, String query){
        SearchV2Request searchV2Request = new SearchV2Request(query);
        given().
                contentType(ContentType.JSON).
                body(searchV2Request).
        when().
                post(base_url + "/SearchV2Request").
        then().
                assertThat().statusCode(200);
    }

    public void openSearchBox(String base_url, String expectedHistory){
        PredictionRequest predictionRequest = new PredictionRequest();
        given().
                contentType(ContentType.JSON).
                body(predictionRequest).
        when().
                post(base_url + "/PredictionRequest").
        then().
                assertThat().body("singleReply.predictionReply.items[0].title", is(expectedHistory));
    }
}
