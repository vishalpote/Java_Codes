import java.util.Scanner;

public class constructors {
    int age;
    String name;
    String class1;
    constructors()
    {
        System.out.println("Enter the name:");
        Scanner s=new Scanner(System.in);
        name=s.nextLine();
        System.out.println("enter the age:");
        age=s.nextInt();
        System.out.println("Enter the class:");
        class1=s.nextLine();
    }
    void show()
    {
        System.out.println("Name:"+ "  |  "+"age"+"  |"+"class");
        System.out.println("-------|-------|------");
        System.out.println(name+" |   "+age+"  |"+class1);
    }
}
class B{
    public static void main(String[] args) {
        constructors x=new constructors();
        x.show();
    }
}
