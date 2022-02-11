public class SportsWheels extends CarOptions {
    private double cost = 300.00;

    public SportsWheels(Car orderedCar) {
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
