package airport.uml_v2.model;

public enum Status {
    BOARDING("Boarding"),
    DELAYED("Delayed"),
    ON_TIME("On Time"),
    REGISTRATION("Registration");

    private final String value;

    Status(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
