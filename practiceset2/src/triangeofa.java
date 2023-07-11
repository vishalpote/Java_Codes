import java.util.Scanner;

public class triangeofa {
    public static void main(String[] args) {
        int n,i,j;
        System.out.println("Enter the range:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=n;i>0;i--)
        {
            for (int spc = n - i; spc > 0; spc--)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print("@");
            }
            System.out.println();
        }

    }
}
