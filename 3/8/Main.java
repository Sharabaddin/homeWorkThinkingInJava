public class Main {
    public static void main(String[] args) {
        long hexDecimal = 0xA;
        long octal = 007;
        System.out.println(hexDecimal);
        System.out.println(Long.toBinaryString(hexDecimal));
        System.out.println(octal);
        System.out.println(Long.toBinaryString(octal));
    }
}
