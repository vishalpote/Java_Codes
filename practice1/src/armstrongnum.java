import java.util.Scanner;

public class armstrongnum {
    public static void main(String[] args) {
        int n,x,sum=0;
        System.out.println("Enter the number:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        x=n;
        while (x!=0)
        {
           int z=x%10;
            sum=sum+(z*z*z);
            x=x/10;

        }
        System.out.println((sum==n)?"Armstrong":"not Armstrong");
    }
}
