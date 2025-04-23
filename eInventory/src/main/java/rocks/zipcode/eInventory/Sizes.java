package rocks.zipcode.eInventory;

public enum Sizes {

    SMALL(1),
    MEDIUM(2),
    LARGE(3),
    X_LARGE(4)
    ;
    private final Integer number;

    Sizes(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

}
