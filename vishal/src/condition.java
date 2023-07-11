import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter the number:");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        if(a>10)
        {
            System.out.println("the number is greater than the 10");
        }
        else
        {
            System.out.println("the number is less than 10");
        }
    }
}
