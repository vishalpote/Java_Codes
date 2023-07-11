public class thiskeyword4 {
    thiskeyword4()
    {
        this(20);
    }
    thiskeyword4(int a)
    {
        System.out.println("this is the parameterized constructor:"+a);
    }

    public static void main(String[] args) {
        thiskeyword4 x=new thiskeyword4();
    }
}
