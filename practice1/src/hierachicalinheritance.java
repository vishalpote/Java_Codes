import java.util.Scanner;

public class hierachicalinheritance {
    int roll;
    String name, sub, clas;
    char ch;

    void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name:");
        name=s.next();
        System.out.println("Enter the Roll:");
        roll=s.nextInt();
        System.out.println("Enter the Class:");
        clas=s.next();
        System.out.println("Enter the Subject:");
        System.out.println("1.chem");
        System.out.println("1.phys");
        System.out.println("1.math");

    }
}
class chemistri extends hierachicalinheritance
{
    void show1()
    {
        System.out.println("Student name:" +name);
        System.out.println("Student Roll:" +roll);
        System.out.println("Student Class:" +clas);
        System.out.println("Student Subject:" +sub);
    }
}
class physics extends hierachicalinheritance
{
    void show2()
    {
        System.out.println("Student name:" +name);
        System.out.println("Student Roll:" +roll);
        System.out.println("Student Class:" +clas);
        System.out.println("Student Subject:" +sub);
    }
}
class math extends hierachicalinheritance
{
    void show3()
    {
        System.out.println("Student name:" +name);
        System.out.println("Student Roll:" +roll);
        System.out.println("Student Class:" +clas);
        System.out.println("Student Subject:" +sub);
    }
}
class test extends hierachicalinheritance
{
    public static void main(String[] args) {
        test x=new test();
        x.input();
        math m=new math();
        physics p=new physics();
        chemistri c=new chemistri();
        char ch;
        System.out.println("Enter Your Choice:");
        Scanner s1=new Scanner(System.in);
        ch=s1.next().charAt(0);
        if (x.ch==1)
        {
            c.show1();
        } else if (x.ch==2) {
            p.show2();

        } else if (x.ch==3) {
            m.show3();
        }
        else
        {
            System.out.println("invalid input..");
        }
    }
}