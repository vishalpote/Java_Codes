public class parameterizedcons {
    int x,y;
    parameterizedcons(int a, int b)
    {
        x=a;
        y=b;
    }
    void show()
    {
        System.out.println(x+"   "+y);
    }
}
class X{
    public static void main(String[] args) {
        parameterizedcons m=new parameterizedcons(5,2);
        m.show();
    }
}
