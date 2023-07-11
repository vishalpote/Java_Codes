import java.util.Scanner;

public class largestamong3 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter the three numbers:");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a>b && a>c)
        {
            System.out.println("greatest number is:"+a);
        } else if (b>c) {
            System.out.println("greatest number is:"+b);
        }
        else
        {
            System.out.println("greatest number is:"+c);
        }
    }
}
