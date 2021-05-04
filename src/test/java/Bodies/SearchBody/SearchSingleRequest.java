package Bodies.SearchBody;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchSingleRequest {
    private Object object;

    public SearchSingleRequest(Object request){
        this.object = request;
    }

    @JsonProperty("searchV2Request")
    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
