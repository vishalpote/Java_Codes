public class defaultcons {
    int a;
    String b;
    boolean c;
    defaultcons()
    {
//        a=10;
//        b="vishal";
//        c=false;
    }
    void show()
    {
        System.out.println(a+" "+b+" "+c);
    }
}
class x {
    public static void main(String[] args) {


        defaultcons m = new defaultcons();
        m.show();
    }
}