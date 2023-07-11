import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        int n,count=0;
        System.out.println("enter the number: ");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        System.out.println((count==2)?"prime":"not prime");
    }
}
