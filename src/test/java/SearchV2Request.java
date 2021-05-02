import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"canReplaceSpellCheckerQuery", "language", "query", "scope", "entities"})
public class SearchV2Request {
    private Boolean canReplaceSpellCheckerQuery;
    private String language;
    private String query;
    private String scope;
    private String entities;

    SearchV2Request(String query){
        this.canReplaceSpellCheckerQuery = false;
        this.language = "fa";
        this.query = query;
        this.scope = "app";
        this.entities = "";
    }

    public Boolean getCanReplaceSpellCheckerQuery() {
        return canReplaceSpellCheckerQuery;
    }

    public void setCanReplaceSpellCheckerQuery(Boolean canReplaceSpellCheckerQuery) {
        this.canReplaceSpellCheckerQuery = canReplaceSpellCheckerQuery;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getEntities() {
        return entities;
    }

    public void setEntities(String entities) {
        this.entities = entities;
    }
}
