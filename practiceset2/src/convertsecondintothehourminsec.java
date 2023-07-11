import java.util.Scanner;

public class convertsecondintothehourminsec {
    public static void main(String[] args) {
        int sec;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Seconds:");
        sec=s.nextInt();
        int S = sec % 60;
        int H = sec / 60;
        int M = H % 60;
        H = H / 60;
        System.out.print( H + ":" + M + ":" + S);
        System.out.print("\n");

    }
}
