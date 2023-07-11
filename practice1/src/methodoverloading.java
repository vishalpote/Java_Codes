public class methodoverloading {
    void add()
    {
        int a=20,b=30,c;
        c=a+b;
        System.out.println("Addition:"+c);
    }
    void add(int a,int b)
    {
        int c=a+b;
        System.out.println("Addition:"+ c);
    }
    void add(int a,double b)
    {
        double c=a+b;
        System.out.println("Addition:"+c);
    }

    public static void main(String[] args) {
        methodoverloading x=new methodoverloading();
        x.add();
        x.add(10,40);
        x.add(20,23.45);
    }
}
