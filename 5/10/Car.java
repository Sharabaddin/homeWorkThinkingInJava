public class Car {
    public void finalize() {
        System.out.println("Free non standart resources");
    }
}
