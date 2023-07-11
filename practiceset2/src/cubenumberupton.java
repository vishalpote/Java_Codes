import java.util.Scanner;
import java.lang.Math;

public class cubenumberupton {
    public static void main(String[] args) {
        int n,p=3;
        System.out.println("Enter the number:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for (int i=0;i<=n;i++)
        {
            System.out.println("the cub of "+ i +" is ="+Math.pow(i,p));
        }
        System.out.println();
    }
}
