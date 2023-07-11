public class personclass {
    String name="vishal";
    int age=21;
    String class1="MCA";
    void subjects()
    {
        System.out.println("Mern Stack");
        System.out.println("java programing");
        System.out.println("python programing");
    }
    void practicals()
    {
        System.out.println("python practicals");
        System.out.println("java programing");
        System.out.println("Mern programing");
    }
    public static void main(String[] args) {
        personclass p=new personclass();
        System.out.println("my name:"+p.name);
        System.out.println("my age:"+p.age);
        System.out.println("my class:"+p.class1);
        System.out.println("********************subjects*************************");
        p.subjects();
        System.out.println("*********************practicals************************");
        p.practicals();
    }
}
