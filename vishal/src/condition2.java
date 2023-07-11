import java.util.Scanner;

public class condition2 {
    public static void main(String[] args) {
        Double mark;
        System.out.println("Enter the marks:");
        Scanner s=new Scanner(System.in);
        mark=s.nextDouble();
        if(mark>90)
        {
            System.out.println("excellent..");
        } else if (mark>70) {
            System.out.println("good marks");
        } else if (mark>40) {
            System.out.println("avrage marks");
        }
        else
        {
            System.out.println("failed in exam..");
        }
    }
}
