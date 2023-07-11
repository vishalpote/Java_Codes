import java.util.Scanner;

public class multilevelinheritance {
    int roll,mark;
    String name,class1,subject;
    void input(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name:");
        name=s.next();
        System.out.println("Enter the Roll:");
        roll =s.nextInt();
        System.out.println("Enter the Class:");
        class1=s.next();
        System.out.println("Enter the Subject:");
        subject=s.next();
        System.out.println("Enter the Mark:");
        mark=s.nextInt();
    }
}
class chemistry extends multilevelinheritance
{
    void show()
    {
        System.out.println("Student Name:" +name);
        System.out.println("Student Roll:" +roll);
        System.out.println("Student Class:" +class1);
        System.out.println("Student Subject:" +subject);
        System.out.println("Student Mark:" +mark);
    }
}
class chemistry1 extends chemistry
{
    void show1()
    {
        System.out.println("Student Name:" +name);
        System.out.println("Student Roll:" +roll);
        System.out.println("Student Class:" +class1);
        System.out.println("Student Subject:" +subject);
        System.out.println("Student Mark in Chem1:" +mark);
    }

    public static void main(String[] args) {
        chemistry1 x=new chemistry1();
        x.input();
        System.out.println("*********************chemistry********************************");
        x.show();
        System.out.println("*********************chemistry1********************************");
        x.show1();


    }
}

