public class Main {
    public static void main(String[] args) {
        for(int i = 2; i < 100000; i++) {
            int dividers = 0;
            for(int j = 2; j < i/2; j++) {
                if(i % j == 0) {
                    dividers++;
                    break; //оптимизация
                }
            }
            if(dividers == 0)
                System.out.println(i);
        }
    }
}
