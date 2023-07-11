import java.nio.charset.Charset;

public class availablecharset {
    public static void main(String[] args) {
        System.out.println("list of available charset in java:");
        for (String str:Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }
    }
}
