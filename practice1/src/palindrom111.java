import java.util.Scanner;

public class palindrom111 {
    public static void main(String[] args) {
        String s;
        System.out.println("enter the string:");
        Scanner sc=new Scanner(System.in);
        s=sc.next();
       if(s.charAt(0)==s.charAt(s.length()-1))
        {
            System.out.println("palindrome");
        }
       else
       {
           System.out.println("not palindrome");
       }
    }
}
