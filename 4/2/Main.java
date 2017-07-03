import java.util.Random;
public class Main {
 public static void main(String[] args) {
    for(int i = 0; i < 26 ; i++) {
        Random rd = new Random();
        
        int x = rd.nextInt(100);
        int y = rd.nextInt(100);
        System.out.println(x + " " + y);
        if(x == y)
            System.out.println("равно");
        else if(x > y)
            System.out.println("больше");
        else if(x < y)
            System.out.println("меньше");
    }
 }
}
