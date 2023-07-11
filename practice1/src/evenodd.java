import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        int a;
        System.out.println("enter the number:");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        System.out.println((a%2==0)?"even":"odd");
    }
}
