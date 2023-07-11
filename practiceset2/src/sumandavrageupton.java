import java.util.Scanner;

public class sumandavrageupton {
    public static void main(String[] args) {
        int n,avg=0,sum=0;
        System.out.println("Enter the Range:");
        Scanner s= new Scanner(System.in);
        n=s.nextInt();
        for (int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("total sum is:"+sum);
        System.out.println("avarage"+(sum/n));
    }
}
