import java.util.Scanner;

public class countdigitinnumber {
    public static void main(String[] args) {
        int n,count=0;
        System.out.println("Enter the number:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        while (n!=0)
        {
            int rem=n%10;
            count++;
            n=n/10;
        }
        System.out.println("Digits:"+count);
    }
}
