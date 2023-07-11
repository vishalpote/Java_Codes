public class superformethods {
    void show()
    {
        System.out.println("hello");
    }
}
class m extends superformethods
{
    void show()
    {
        super.show();
        System.out.println("vishal");
    }
}
class Test{
    public static void main(String[] args) {
       m x=new m();
       x.show();
    }
}
