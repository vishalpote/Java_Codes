interface implementss {
String name="TVS";
int speed=100;
void start();
void stop();
default void  color(){
    System.out.println("red");
}
static void xyz()
{
    System.out.println("100km/h");
}
}
class customer1 implements implementss{
    @Override
    public void start() {
        System.out.println("Start");
    }
    @Override
    public void stop()
    {
        System.out.println("Stop");
    }

    public static void main(String[] args) {
        customer1 x=new customer1();
        x.start();
        x.stop();
        x.color();
        implementss.xyz();

    }
}
