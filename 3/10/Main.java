public class Main {
    public static void main(String[] args) {
        int bigEndian = 0x55555555;
        int littleEndian = 0xaaaaaaaa;
        System.out.println(Integer.toBinaryString(bigEndian));
        System.out.println(Integer.toBinaryString(littleEndian));
        
        System.out.println(Integer.toBinaryString(bigEndian & littleEndian));
        System.out.println(Integer.toBinaryString(bigEndian | littleEndian));
        System.out.println(Integer.toBinaryString(bigEndian ^ littleEndian));
    }
}
