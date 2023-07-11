import java.util.Scanner;

public class bankdetails {
    private double bal=2000;
    private int pass;
    int amt;

    void Deposite(){
        System.out.println("Enter the password:");
        Scanner s=new Scanner(System.in);
        pass=s.nextInt();
        if(pass==9089)
        {
            System.out.println("Enter the Amount you Deposite:");
            amt=s.nextInt();
            bal=bal+amt;
            System.out.println("Ammount Deposite Succesfully....");
            System.out.println("total balance remaining in your account is:"+bal);
        }
        else {
            System.out.println("password is incorrect please try again..");
        }
    }
    void withdraw()
    {
        System.out.println("Enter the password:");
        Scanner s=new Scanner(System.in);
        pass=s.nextInt();
        if(pass==9089)
        {
            System.out.println("Enter the Amount you want to withdraw:");
            amt=s.nextInt();
            if(amt>bal)
            {
                System.out.println("You Don't Have sufficient Balance..");
            }
            else {
                bal = bal - amt;
                System.out.println("Amount Withdraw Succesfully.......");
                System.out.println("total balance remaining in your account is:" + bal);
            }
        }
        else {
            System.out.println("password is incorrect please try again..");
        }
    }
    void checkbalance()
    {
        System.out.println("Enter the password:");
        Scanner s=new Scanner(System.in);
        pass=s.nextInt();
        if(pass==9089) {
            System.out.println("Total Balance in your Account:"+bal);
        }
        else
        {
            System.out.println("Incorrect Password...");
        }
    }
}
class customer{
    public static void main(String[] args) {
        bankdetails x=new bankdetails();
        int c;
        System.out.println("1.Deposite");
        System.out.println("2.Withdraw");
        System.out.println("3.Check balance");
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your choice:-");
        c=s.nextInt();
            switch (c) {
                case 1:
                    x.Deposite();
                    break;

                case 2:
                    x.withdraw();
                    break;


                case 3:
                    x.checkbalance();
                    break;


                default:
                    System.out.println("Incorrect option please try again...");
            }

        }
}
