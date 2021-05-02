import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class SearchRequest {
    private Object properties;
    private Object singleRequest;

    @JsonPropertyOrder({"properties", "singleRequest"})
    SearchRequest(String query){
        this.properties = new RequestProperties();
        SearchV2Request searchV2Request = new SearchV2Request(query);
        this.singleRequest = new SingleRequest(searchV2Request, "SearchV2Request");
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
