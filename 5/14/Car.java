public class Car {
    static String model = "Tesla s";
    static int power;
    
    static {
        power = 12;
    }
    
    static void show() {
        System.out.println(model);
        System.out.println(power);
    }
}
