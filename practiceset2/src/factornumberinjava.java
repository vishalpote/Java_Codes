import java.util.Scanner;

public class factornumberinjava {
    public static void main(String[] args) {
        int num;
        int count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=s.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(num%1==0 && i*i!=num)
            {
                count+=2;
            } else if (i*i==num) {
                count++;
            }
        }
        System.out.println(count);
    }
}
