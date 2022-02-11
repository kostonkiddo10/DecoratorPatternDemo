public class HiFiAudio extends CarOptions {
    private double cost = 150.00;

    public HiFiAudio(Car orderedCar) {
        this.orderedCar = orderedCar;
    }

    @Override
    public double cost() {
        return this.orderedCar.cost() + this.cost;
    }

    @Override
    public String getDescription() {
        return orderedCar.getDescription() + ", Sports Wheels";
    }  
}
