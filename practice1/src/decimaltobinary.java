import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class decimaltobinary {
    public static void main(String[] args) {
        int num, i = 1, y;
        int a[] = new int[100];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        num=s.nextInt();
        y=num;
        while (num!=0)
        {
            a[i++]=num%2;
            num=num/2;
        }
        System.out.println("Binary Number:");
        for (int j=i-1;j>0;j--)
        {
            System.out.print(a[j]);
        }

    }
}
