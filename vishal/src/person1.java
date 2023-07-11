import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class person1 {
   static int age;
    static String name;
    void details()
    {
        System.out.println("*********************details************************");

    }
    public static void main(String[] args) {
        System.out.println("Enter the name:");
        Scanner s=new Scanner(System.in);
        name=s.nextLine();
        System.out.println("Enter the age:");
        age=s.nextInt();
        person1 p=new person1();
        p.details();
        System.out.println("Name:"+p.name);
        System.out.println("Age:"+p.age);

    }
}
