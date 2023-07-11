public class thiskeyword2 {
    int a;
    thiskeyword2(int a)
    {
        this.a=a;
    }
    void  show()
    {
        System.out.println(a);
    }

    public static void main(String[] args) {
        thiskeyword2 x=new thiskeyword2(100);
        x.show();
    }
}
