public class Sunroof extends CarOptions {
    private double cost = 250.00;

    public Sunroof(Car orderedCar) {
        this.orderedCar = orderedCar;
    }

    @Override
    public double cost() {
        return this.cost + this.orderedCar.cost();
    }

    @Override
    public String getDescription() {
        return orderedCar.getDescription() + ", Sports Wheels";
    }
}
