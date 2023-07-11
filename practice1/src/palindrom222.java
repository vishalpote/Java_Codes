import java.util.Scanner;

public class palindrom222 {
    public static void main(String[] args) {
        String s,x;
        int i;
        System.out.print("Enter the String:");
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        s.replaceAll("\\+s","").toLowerCase();
        for (i=(s.length())-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }

    }
}
