public class Main {
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        
        go(unicycle);
        go(bicycle);
        go(tricycle);
    }
    
    static void go(Cycle cycle) {
        cycle.ride();
    }
}
