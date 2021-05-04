package Bodies.PredictionBody;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PredictionSingleRequest {
    private Object object;

    public PredictionSingleRequest(Object request){
        this.object = request;
    }
    @JsonProperty("predictionRequest")
    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
