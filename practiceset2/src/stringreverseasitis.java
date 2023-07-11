import java.util.Scanner;

public class stringreverseasitis {
    public static void main(String[] args) {
        String x;
        System.out.print("Enter the string:");
        Scanner s=new Scanner(System.in);
        x=s.nextLine();
        for (int i=(x.length()-1);i>=0;i--)
        {
            System.out.print(x.charAt(i));
        }
    }
}
