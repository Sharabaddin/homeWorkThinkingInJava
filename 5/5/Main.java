public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.barck(true);
        rex.barck('a');
        rex.barck((byte)23);
        rex.barck((short)23);
        rex.barck(23);
        rex.barck(23L);
        rex.barck(1.2F);
        rex.barck(1.4D);
        
    }
}
