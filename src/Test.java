abstract class Animal
{
    abstract void makeNoise();
}

class   Dog extends Animal
{
    void makeNoise()
    {
        System.out.println("Bhow .....");
    }
}

class Cat extends Animal
{
    void makeNoise()
    {
        System.out.println("Meow......");
    }
}
public class Test {
    void giveShot(Animal a)
    {
       // a = new Cat();
        a.makeNoise();
    }
    public static void main(String[] args) {
        Test t = new Test();
        Animal a;
        //t.giveShot(a);
    }
}
