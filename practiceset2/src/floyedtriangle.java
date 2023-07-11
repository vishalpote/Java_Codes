import java.util.Scanner;

public class floyedtriangle {
    public static void main(String[] args) {
        int n,num=1;
        System.out.println("Enter the Range:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<i;j++)
            {
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
    }
}
