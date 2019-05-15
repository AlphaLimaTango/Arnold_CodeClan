package dealership.components;

public class Tyre {

    private TyreType type;

    public Tyre(TyreType type) {
        this.type = type;
    }

    public TyreType getType() {
        return type;
    }

    public void setType(TyreType type) {
        this.type = type;
    }
}
