import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random monetka = new Random();
        boolean result = monetka.nextBoolean();
        
        if(result)
            System.out.println("Орёл");
        else
            System.out.println("Решка");
    }
}
