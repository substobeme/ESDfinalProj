import java.security.Key;
import java.util.Base64;
import javax.crypto.KeyGenerator;

public class key{
    public static void main(String[] args) {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("HmacSHA256");
            keyGen.init(256);
            Key secretKey = keyGen.generateKey();
            String SecretKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
            System.out.println("Generated Secret Key:");
            System.out.println(SecretKey);
        } catch (Exception e) {
            System.err.println("Error generating secret key: " + e.getMessage());
        }
    }
}
