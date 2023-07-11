import java.util.Scanner;

public class vowelorconsonent {
    public static void main(String[] args) {
        char c;
        System.out.println("Enter the charcter:");
        Scanner s=new Scanner(System.in);
        c=s.next().charAt(0);
        if(c=='a'||c=='i'||c=='o'||c=='u'||c=='e' || c=='A'||c=='I'||c=='O'||c=='U'||c=='E')
        {
            System.out.println("its vowel ");
        }
        else
        {
            System.out.println("its consonant");
        }
    }
}
