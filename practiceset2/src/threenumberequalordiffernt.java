import java.util.Scanner;

public class threenumberequalordiffernt {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter three number:");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a==b && b==c)
        {
            System.out.println("Equal Numbers");
        } else if (a!=b) {
            System.out.println("one Are Different");
        }
        else
        {
            System.out.println("All Are Differnt");
        }
    }
}
