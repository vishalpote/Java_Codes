class methodoverriding {
    void print()
    {
        System.out.println("this is the super class method");
    }
}
class xyz extends methodoverriding
{
    @Override
    void print()
    {
        super.print();
        System.out.println("this is the sub class method..");
    }

}
class result
{
    public static void main(String[] args) {
        methodoverriding x=new xyz();
        x.print();
    }
}
//note if the method are not same in super and subclass it's called the superclass
//if the method are same in both super and subclass the it's called subclass
// if you use super keyword the you can call both the methods