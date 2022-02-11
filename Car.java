public abstract class Car {
    String description = "not selected";

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}