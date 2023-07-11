import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        int y;
        System.out.println("Enter the Year:");
        Scanner s=new Scanner(System.in);
        y=s.nextInt();
        System.out.println((y%4==0)?"Leap year":"Not Leap Year");
    }
}
