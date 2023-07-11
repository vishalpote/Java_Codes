import java.util.Scanner;

public class fabonacciseries {
    public static void main(String[] args) {
        int n,i,a=0,b=1,c=0,sum=0;
        System.out.println("Enter the Number:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        System.out.println(a);
        System.out.println(b);
        for (i=2;i<=n;i++)
        {
           c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
        System.out.println("sum of even fibonacci number:");
        System.out.println(c);
//        for (int j=1;j<=i;j++)
//        {
//            if(j%2==0)
//            {
//                System.out.println(j);
//            }
//        }
//        System.out.println("Sun of Even Number:"+sum);
    }
}
