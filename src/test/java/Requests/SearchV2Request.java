package Requests;

import Bodies.RequestProperties;
import Bodies.SearchBody.SearchBody;
import Bodies.SearchBody.SearchSingleRequest;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"properties", "singleRequest"})
public class SearchV2Request {
    private Object properties;
    private Object singleRequest;


    public SearchV2Request(String query){
        this.properties = new RequestProperties();
        SearchBody searchBody = new SearchBody(query);
        this.singleRequest = new SearchSingleRequest(searchBody);
    }

    public Object getProperties() {
        return properties;
    }

    public void setProperties(Object properties) {
        this.properties = properties;
    }

    public Object getSingleRequest() {
        return singleRequest;
    }

    public void setSingleRequest(Object singleRequest) {
        this.singleRequest = singleRequest;
    }
}
