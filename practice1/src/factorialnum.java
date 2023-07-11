import java.util.Scanner;

public class factorialnum {
    public static void main(String[] args) {
        int n,f=1,i;
        System.out.println("Enter the number:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("factorial of number is:"+f);
    }
}
