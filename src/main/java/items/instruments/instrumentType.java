package items.instruments;

public enum instrumentType {
    STRING("string instrument"),
    PERCUSSION("percussion instrument"),
    ELECTRONIC("electronic instrument"),
    BRASS("brass instrument");

    private final String value;

    instrumentType(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
