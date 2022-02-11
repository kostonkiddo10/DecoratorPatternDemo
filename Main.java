public class Main {
    public static void main(String[] args) {
        Car suv = new SUV();
        suv = new HiFiAudio(new Sunroof(suv));
        
        Car economy = new Economy();

        Car compactSUV = new CompactSUV();
        compactSUV = new SportsWheels(compactSUV);

        System.out.println(suv.getDescription() + " Cost: " + suv.cost());
        System.out.println(economy.getDescription() + "Economy car with no add-ons: " + economy.cost());
        System.out.println(compactSUV.getDescription() + "Compact SUV with Sports Wheels: " + compactSUV.cost());
    }
}
