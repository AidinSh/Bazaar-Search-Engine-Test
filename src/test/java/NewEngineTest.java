import Requests.SearchV2Request;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static io.restassured.RestAssured.given;

public class NewEngineTest {

    String base_url = "https://api.cafebazaar.ir/rest-v1/process";


    @ParameterizedTest
    @CsvFileSource(files = "src/test/Resources/topk_queries.csv", numLinesToSkip = 1)
    void testCase(int number, String query){
        ArrayList<String> oldValues = new ArrayList<>();
        ArrayList<String> newValues = new ArrayList<>();

        SearchV2Request searchV2Request = new SearchV2Request(query);
        Response oldEngineResponse =
                given().
                        contentType(ContentType.JSON).
                        body(searchV2Request).
                when().
                        post(base_url + "/SearchV2Request").
                then().
                        extract().response();

        for(int i=0; i<24; i++) {

            String packageName = oldEngineResponse.jsonPath().
                    get(String.format("singleReply.searchV2Reply.page.pageBodyInfo.pageBody.rows[%d].simpleAppItem.info.packageName", i));
            if (packageName != null) {
                oldValues.add(packageName);
            }
        }
        Collections.sort(oldValues);

        Response newEngineResponse =
                given().
                        contentType(ContentType.JSON).
                        body(searchV2Request).
                when().
                        post(base_url + "/SearchV2Request").
                then().
                        extract().response();

        for(int i=0; i<24; i++) {

            String packageName = newEngineResponse.jsonPath().
                    get(String.format("singleReply.searchV2Reply.page.pageBodyInfo.pageBody.rows[%d].simpleAppItem.info.packageName", i));
            if(packageName != null) {
                newValues.add(packageName);
            }
        }
        Collections.sort(newValues);

        System.out.println("old values : " + oldValues);
        System.out.println("new values : " + newValues);
        Assertions.assertEquals(newValues, oldValues);
    }
}
