public class Main {
    public static void main(String [] args) {
        Dog spot = new Dog();
        spot.name = "Spot";
        spot.says = "I`am Spot";
        
        Dog sruffy = new Dog();
        sruffy.name = "Sruffy";
        sruffy.says = "I`am Sruffy";
        
        Dog rex = new Dog();
        spot = rex;
        
        System.out.println(spot == rex); //true
        System.out.println(spot.equals(rex)); //true
        
        System.out.println("1-st: " + spot.name + " " + spot.says);
        System.out.println("2-st: " + sruffy.name + " " + sruffy.says);
    }
}
