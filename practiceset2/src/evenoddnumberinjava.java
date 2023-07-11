import java.util.Scanner;

public class evenoddnumberinjava {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter number:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        System.out.println((n%2==0)?"1":"0");
    }
}
