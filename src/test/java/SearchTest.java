public class SearchTest {

    String host = "https://api.cafebazaar.ir/rest-v1/process/";
    String predictRequestDomain = "PredictionRequest";
    String searchDomain = "SearchV2Request";
    String requestProperties = "{\n" +
            "    \"properties\": {\n" +
            "        \"androidClientInfo\": {\n" +
            "            \"adId\": \"05eabe46-ae32-4d03-88b4-92d00b2ca1bc\",\n" +
            "            \"adOptOut\": false,\n" +
            "            \"androidId\": \"0f1928df4a9cc474\",\n" +
            "            \"city\": \"NA\",\n" +
            "            \"country\": \"NA\",\n" +
            "            \"cpu\": \"arm64-v8a,armeabi-v7a,armeabi\",\n" +
            "            \"device\": \"\",\n" +
            "            \"deviceType\": 0,\n" +
            "            \"dpi\": 420,\n" +
            "            \"hardware\": \"\",\n" +
            "            \"height\": 2342,\n" +
            "            \"locale\": \"fa\",\n" +
            "            \"manufacturer\": \"motorola\",\n" +
            "            \"mcc\": 432,\n" +
            "            \"mnc\": 35,\n" +
            "            \"mobileServiceType\": 1,\n" +
            "            \"model\": \"moto g 5G plus\",\n" +
            "            \"osBuild\": \"\",\n" +
            "            \"product\": \"nairo_retail\",\n" +
            "            \"province\": \"NA\",\n" +
            "            \"sdkVersion\": 29,\n" +
            "            \"width\": 1080\n" +
            "        },\n" +
            "        \"appThemeState\": 0,\n" +
            "        \"clientID\": \"Pt10sNWXTjSyM-ArRcORYQ\",\n" +
            "        \"clientVersion\": \"12.1.0\",\n" +
            "        \"clientVersionCode\": 1200100,\n" +
            "        \"isKidsEnabled\": false,\n" +
            "        \"language\": 2,\n" +
            "        \"lat\": 35.67567567567568,\n" +
            "        \"lon\": 51.325979115079555\n" +
            "    },\n";
    String predictSingleRequest =
            "    \"singleRequest\": {\n" +
                    "        \"predictionRequest\": {\n" +
                    "            \"text\": \"test\"\n" +
                    "        }\n" +
                    "    }\n" +
                    "}";
}

