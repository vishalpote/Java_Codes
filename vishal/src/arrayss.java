import java.util.Arrays;
import java.util.Scanner;

public class arrayss {
    public static void main(String[] args) {
//        int a[]={10,20,30,40,50};
        int a[]=new int[5];
        int i;
        System.out.print("enter the array element:");
        Scanner s=new Scanner(System.in);

        for ( i=0;i<5;i++)
        {
            a[i]=s.nextInt();

        }
        Arrays.sort(a);
        System.out.println("sorted Elements are:");
        for (int x:
             a) {
            System.out.println(x);
        }
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[2]);
//        System.out.println(a[3]);
//        System.out.println(a[4]);
//        for (int x:a) {
//            System.out.println("Elements:"+x);
//        }
    }
}
