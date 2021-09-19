import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import Bodies.RequestProperties;
import Requests.PredictionRequest;
import Requests.SearchV2Request;
import TestData.DataProviders;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Practice {

    TestScenarios testScenarios = new TestScenarios();
    String base_url = "https://api.cafebazaar.ir/rest-v1/process";
    String query = "بازی";

    String firstResponseBody;
    String secondResponseBody;
    ArrayList<String> testValue = new ArrayList<>();

    @Test(priority = 1, dataProvider = "searchQueries", dataProviderClass = DataProviders.class)
    void searchTest(String query){
        testScenarios.searchQuery(base_url, query);
        testScenarios.openSearchBox(base_url, query);
    }

    @Test
    void test(){
        SearchV2Request searchV2Request = new SearchV2Request("an");
        given().
                contentType(ContentType.JSON).
                body(searchV2Request).
                when().
                post(base_url + "/SearchV2Request").
                then().log().all();

    }

    @Test
    void predictionTest(){
        PredictionRequest predictionRequest = new PredictionRequest();
        testValue =
        given().
                contentType(ContentType.JSON).
                body(predictionRequest).
        when().
                post(base_url + "/PredictionRequest").
        then().
                extract().body().jsonPath().get("properties.statusCode");
        System.out.println(testValue);

    }

    @Test(dataProvider = "searchQueries", dataProviderClass = DataProviders.class)
    void validateResponses(String query){
        SearchV2Request searchV2Request = new SearchV2Request(query);
        firstResponseBody =
                given().
                        contentType(ContentType.JSON).
                        body(searchV2Request).
                when().
                        post(base_url + "/SearchV2Request").
                then().
                        log().all().
                        extract().body().asPrettyString();
        secondResponseBody =
                given().
                        contentType(ContentType.JSON).
                        body(searchV2Request).
                when().
                        post(base_url + "/SearchV2Request").
                then().
                        extract().body().asPrettyString();

        Assert.assertEquals(firstResponseBody, secondResponseBody);
    }

    @Test //(dataProvider = "searchQueries", dataProviderClass = DataProviders.class)
    void createArrayOfResponse(){
        SearchV2Request searchV2Request = new SearchV2Request("an");
        Response response =
                given().
                        contentType(ContentType.JSON).
                        body(searchV2Request).
                when().
                        post(base_url + "/SearchV2Request").
                then().
                        extract().response();

        for(int i=0; i<15; i++) {
            //testValue.add(response.jsonPath().get(String.format("singleReply.searchV2Reply.page.pageBodyInfo.pageBody.rows[%d].simpleAppItem.info.packageName", i)));
            String a = response.jsonPath().get(String.format("singleReply.searchV2Reply.page.pageBodyInfo.pageBody.rows[%d].simpleAppItem.info.packageName", i));
            testValue.add(a);
        }
    }

}
