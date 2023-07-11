import java.util.Scanner;

public class binarytohexadecimal {
    public static void main(String[] args) {
        int num,y;
        String hex="";
        char hexa[]={'1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Decimal Number:");
        num=s.nextInt();
        while (num>0)
        {
            int rem=num%16;
            hex=hexa[rem]+hex;
            num=num/16;
        }
        System.out.println(hex);
    }
}
