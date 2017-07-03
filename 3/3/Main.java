import static net.mindview.util.Print.*;

public class Main {
    public static void main(String[] args) {
        Cat vasa = new Cat();
        vasa.legs = 1F;    
        print(vasa.legs);
        f(vasa);
        print(vasa.legs);
        

    }
    
    public static void f(Cat ct) {
        ct.legs = 3F;
    }
}
