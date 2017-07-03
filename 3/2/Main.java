import static net.mindview.util.Print.*;

public class Main {
    public static void main(String[] args) {
        Cat vasa = new Cat();
        vasa.legs = 1;
        
        Cat petr = new Cat();
        petr.legs = 2;
        
        print("V= " + vasa.legs + "P= " + petr.legs);

        vasa = petr;
        
        print("V= " + vasa.legs + "P= " + petr.legs); 
    }
}
