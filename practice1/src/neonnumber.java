import java.util.Scanner;

public class neonnumber {
    public static void main(String[] args) {
        int n,sqr,add=0;
        System.out.println("Enter the number:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        sqr=n*n;
//        System.out.println(sqr);
        while (sqr!=0)
        {
            int r=sqr%10;
            add=add+(r);
            sqr=sqr/10;
        }
        System.out.println((add==n)?"neon":"not neon");
    }
}
