public class Main {
    public static void main(String[] args) {
        int bigEndian = 0x80000000;
        System.out.println(Integer.toBinaryString(bigEndian));
        
        for(int i = 0; i < 31; i++) {
            bigEndian >>= 1;
            System.out.println(Integer.toBinaryString(bigEndian));
        }
    }
}
