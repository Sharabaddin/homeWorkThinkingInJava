public class Main {
    public static void main(String[] args) {
        int bigEndian = 0xffffffff;
        System.out.println(Integer.toBinaryString(bigEndian));
        
        bigEndian <<= 1;
        System.out.println(Integer.toBinaryString(bigEndian));
        
        bigEndian >>>= 1;
        System.out.println(Integer.toBinaryString(bigEndian));
    }
}
