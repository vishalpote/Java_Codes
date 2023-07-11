import java.util.Scanner;

public class thirdnumberisequaltosumoftwonumber {
    public static void main(String[] args) {
        int x,y,z;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the three number:");
        x=s.nextInt();
        y=s.nextInt();
        z=s.nextInt();

        System.out.println((z==(x+y)?"true":"false"));
    }
}
