import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder("object")
public class SingleRequest {
    private Object object;

    SingleRequest(Object request, String requestName){
        this.object = request;
    }

    @JsonProperty("SearchV2Request")
    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
