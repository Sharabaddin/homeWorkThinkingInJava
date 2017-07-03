import java.nio.charset.StandardCharsets;
import java.util.Arrays;


public class Tank {

    public String encryptXorAnsi(int xorKey, String text) {
       String res= new String(text.getBytes("UTF-8"), "windows-1252");
        
        return res;
    
    }
}


//12345678
