import java.util.Scanner;

public class letterspacedigitinstring {
    public static void main(String[] args) {
        String s;
        int alpha=0,digit=0,space=0,other=0;
        System.out.println("Enter the string:");
        Scanner x=new Scanner(System.in);
        s=x.nextLine();
        char a[]=s.toCharArray();
        for (int i=0;i<s.length();i++)
        {
            if(Character.isAlphabetic(a[i])) {
                alpha++;
            }
            else if (Character.isDigit(a[i])) {
                digit++;
            } else if (Character.isSpaceChar(a[i])) {
                space++;
            }
            else
            {
                other++;
            }
        }
        System.out.println("letter:"+alpha);
        System.out.println("Digit:"+digit);
        System.out.println("Space:"+space);
        System.out.println("Other:"+other);
    }
}
