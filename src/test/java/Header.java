import com.fasterxml.jackson.annotation.JsonProperty;

public class Header {
    @JsonProperty("Authorization")
    private String authorization;
    @JsonProperty("Device-Id")
    private String deviceId;
    @JsonProperty("Client-Id")
    private String clientId;
    @JsonProperty("Ad-Id")
    private String adId;
    @JsonProperty("Accept-Language")
    private String acLanguage;
    @JsonProperty("User-Agent")
    private String userAgent;
    @JsonProperty("Android-Id")
    private String androidId;
    
    private Header(){
        this.authorization = "Bearer 05zLkDmPoPTz0DtsxcDh0EBf1X3UNJvrhP83I5lhh99whq0/G8m0qF8R/MxvIGWt7UUz9p2faCfonm8hv4xNkUJhdh3YG+SCSvZC1d+RVVTyKsytUmVUfXIOrHPZ776w6/sAo+Wdqq3pJPPo4QH9gOFP51ySEPu8QJRS4zoAEQAB";
        this.clientId = "Pt10sNWXTjSyM-ArRcORYQ";
        this.deviceId = "95ee79038dcb5b7c44008f8cd54115932b193188";
        this.adId = "05eabe46-ae32-4d03-88b4-92d00b2ca1bc";
        this.acLanguage = "fa";
        this.userAgent = "Bazaar/1200100 (Android 29; motorola moto g 5G plus)";
        this.androidId = "0f1928df4a9cc474";
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getAdId() {
        return adId;
    }

    public void setAdId(String adId) {
        this.adId = adId;
    }

    public String getAcLanguage() {
        return acLanguage;
    }

    public void setAcLanguage(String acLanguage) {
        this.acLanguage = acLanguage;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getAndroidId() {
        return androidId;
    }

    public void setAndroidId(String androidId) {
        this.androidId = androidId;
    }
}



/*
headers("Authorization","Bearer 05zLkDmPoPTz0DtsxcDh0EBf1X3UNJvrhP83I5lhh99whq0/G8m0qF8R/MxvIGWt7UUz9p2faCfonm8hv4xNkUJhdh3YG+SCSvZC1d+RVVTyKsytUmVUfXIOrHPZ776w6/sAo+Wdqq3pJPPo4QH9gOFP51ySEPu8QJRS4zoAEQAB").
                header("Device-Id", "95ee79038dcb5b7c44008f8cd54115932b193188").
                header("Content-Type", "application/json").
                header("Client-Id", "Pt10sNWXTjSyM-ArRcORYQ").
                header("Ad-Id", "05eabe46-ae32-4d03-88b4-92d00b2ca1bc").
                header("Accept-Language", "fa").
                header("User-Agent", "Bazaar/1200100 (Android 29; motorola moto g 5G plus)").
                header("Android-Id", "0f1928df4a9cc474").
 */