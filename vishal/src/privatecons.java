public class privatecons {
    int a; double b;
    private privatecons()
    {
        a=10;
        b=11.88;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        privatecons x=new privatecons();
    }
}
