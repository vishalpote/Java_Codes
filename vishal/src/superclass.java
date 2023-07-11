public class sperclass {
        int a=20;
}
class Z extends  sperclass{
        int a = 30;
        void show()
        {
            System.out.println(a);
            System.out.println(super.a);
        }
}
class test{
    public static void main(String[] args) {
        Z x=new Z();
        x.show();
    }
}
