import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        int num,rev=0,sum=0;
        System.out.print("Enter the number:");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        while (num<0){
            num=num/10;
            sum=sum+num;
            num=num%10;
        }
        System.out.println("sum:"+sum);


    }
}
