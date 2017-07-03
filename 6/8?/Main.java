import com.sharabaddin.*;

public class Main {
    public static void main(String[] args) {
        Connection ct = ConnectionManager.makeConnection();
        ct.test();
    }
}
