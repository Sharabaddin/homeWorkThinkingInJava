public class Cat {
    private int prv = 1;
    protected int prt = 2;
    public int pub = 3;
    int localPackage = 4;
    
    private void first() {
        System.out.println("private");
    }
    
    protected void second() {
        System.out.println("protected");
    }
    
    public void third() {
        System.out.println("public");
    }
    
    void fourth() {
        System.out.println("local package");
    }
}
