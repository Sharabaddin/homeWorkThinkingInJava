public class C extends A {
    B b = new B();
    
    C() {
        System.out.println("C()");
    }
    
    public static void main(String[] args) {
        C c = new C();
    }
}


//A()
//C()?
//B()
//
