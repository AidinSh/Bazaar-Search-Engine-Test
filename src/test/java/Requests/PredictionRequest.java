package Requests;

import Bodies.PredictionBody.PredictionBody;
import Bodies.PredictionBody.PredictionSingleRequest;
import Bodies.RequestProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"properties", "singleRequest"})
public class PredictionRequest {
    private Object properties;
    private Object singleRequest;

    public PredictionRequest(){
        this.properties = new RequestProperties();
        PredictionBody predictionBody = new PredictionBody();
        this.singleRequest = new PredictionSingleRequest(predictionBody);
    }

    public PredictionRequest(String text){
        this.properties = new RequestProperties();
        PredictionBody predictionBody = new PredictionBody(text);
        this.singleRequest = new PredictionSingleRequest(predictionBody);
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
