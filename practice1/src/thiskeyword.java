public class thiskeyword {
    void show()
    {
        System.out.println(this);
    }
    public static void main(String[] args) {
        thiskeyword x=new thiskeyword();
        System.out.println(x);
        x.show();
    }
}
