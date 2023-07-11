import java.util.Scanner;

public class palindromnumber {
    public static void main(String[] args) {
        int num,rev=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        num=s.nextInt();
        int x=num;
        while(num!=0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println((x==rev)?"palindrome":"not ");
    }
}
