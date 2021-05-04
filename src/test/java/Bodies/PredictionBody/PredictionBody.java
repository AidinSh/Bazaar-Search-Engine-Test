package Bodies.PredictionBody;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PredictionBody {
    @JsonProperty
    private String text;

    public PredictionBody(){
        this.text = "";
    }
    public PredictionBody(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
