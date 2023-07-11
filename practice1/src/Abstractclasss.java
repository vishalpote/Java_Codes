abstract class Abstractclasss {
    void leg()
    {
        System.out.println("Animal having 4 legs..");
    }
    abstract void sound();
    abstract  void eat();
}
class dog extends Abstractclasss{
    @Override

    void eat() {
        System.out.println("biscuit");
    }

    @Override
    void sound() {
        System.out.println("bho bho");
    }

}
class sample{
    public static void main(String[] args) {
        dog x=new dog();
        x.sound();
        x.eat();
        x.leg();
    }
}
