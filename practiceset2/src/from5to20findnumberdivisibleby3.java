public class from5to20findnumberdivisibleby3 {
    public static void main(String[] args) {
        int start=5;
        int end=20;
       int num=3;
       int count=0;
        for(int i=start;i<=end;i++)
        {
            if(i%3==0)
            {
               count++;
            }
        }
        System.out.println(count);
    }
}
