public class thiskeyword3 {
    thiskeyword3()
    {
        System.out.println("hello vishal");
    }
    thiskeyword3(int a)
    {
        this();
        System.out.println(a);
    }

    public static void main(String[] args) {
        thiskeyword3 x=new thiskeyword3(10);
    }
}
