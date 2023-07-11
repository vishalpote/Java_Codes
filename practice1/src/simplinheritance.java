import java.util.Scanner;

public class simplinheritance {
    int rollno;
    String name;

    void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the name:");
        name = s.next();
        System.out.println("enter the rollno:");
        rollno = s.nextInt();
    }
}
    class student extends simplinheritance
    {
        void show()
        {
            System.out.println("Student Name:"+name);
            System.out.println("Student Roll No:"+rollno);
        }

        public static void main(String[] args) {
            student x=new student();
            x.input();
            x.show();
        }
    }

