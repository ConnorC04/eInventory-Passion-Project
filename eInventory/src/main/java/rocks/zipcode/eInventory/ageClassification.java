package rocks.zipcode.eInventory;

public enum ageClassification {

    YOUTH(1),
    JUNIOR(2),
    INTERMEDIATE(3),
    SENIOR(4);

    private final Integer number;

    ageClassification(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }
}
