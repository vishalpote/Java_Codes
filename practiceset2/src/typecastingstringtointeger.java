import java.util.Scanner;

public class typecastingstringtointeger {
    public static void main(String[] args) {
        String s;
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the Integer");
        s=x.next();
        int z=Integer.parseInt(s);
        System.out.println(z);
    }
}
