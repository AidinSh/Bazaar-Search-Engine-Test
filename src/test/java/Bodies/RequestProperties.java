package Bodies;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"appThemeState", "clientID", "clientVersion", "clientVersionCode", "isKidsEnabled", "language", "lat", "lon"})
public class RequestProperties {
    private int appThemeState;
    private String clientID;
    private String clientVersion;
    private int clientVersionCode;
    private Boolean isKidsEnabled;
    private int language;
    private double lat;
    private double lon;

    public RequestProperties(){
        this.appThemeState = 0;
        //this.clientID = "Pt10sNWXTjSyM-ArRcORYQ";
        this.clientID = "6";
        this.clientVersion = "12.1.0";
        this.clientVersionCode = 1200100;
        this.isKidsEnabled = false;
        this.language = 2;
        this.lat = 35.67567567567568;
        this.lon = 51.325979115079555;
    }

    public int getAppThemeState() {
        return appThemeState;
    }

    public void setAppThemeState(int appThemeState) {
        this.appThemeState = appThemeState;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getClientVersion() {
        return clientVersion;
    }

    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }

    public int getClientVersionCode() {
        return clientVersionCode;
    }

    public void setClientVersionCode(int clientVersionCode) {
        this.clientVersionCode = clientVersionCode;
    }

    public Boolean getIsKidsEnabled() {
        return isKidsEnabled;
    }

    public void setIsKidsEnabled(Boolean kidsEnabled) {
        isKidsEnabled = kidsEnabled;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}
