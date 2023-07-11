import java.util.Scanner;

public class increasingdecresingorder {
    public static void main(String[] args) {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Three Number:");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();

        if(a<b && b<c)
        {
            System.out.println("Increasing order");
        }
        else
        {
            System.out.println("Decreasing order");
        }
    }
}
