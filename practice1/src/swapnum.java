import java.util.Scanner;

public class swapnum {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter two number:");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b= s.nextInt();
        System.out.println("before swaping two number:");
        System.out.println(a);
        System.out.println(b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swaping two numbers are");
        System.out.println(a);
        System.out.println(b);
    }
}
