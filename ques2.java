import java.util.Scanner;
abstract class Animals
{
    private String breed,colour;
    Animals(String breed,String colour)
    {
        this.breed = breed;
        this.colour = colour;
    }
    public String getBreed()
    {
        return breed;
    }
    public String getColour()
    {
        return colour;
    }
    public abstract void speak();
}
class Dog extends Animals
{
    Dog(String b, String c)
    {
        super(b,c);
    }

    public void speak()
    {
        System.out.println("Dog:: barks"+" "+"breed = "+getBreed()+" "+"colour = "+getColour());
    }
}
class Cat extends Animals
{
    Cat(String b, String c)
    {
            super(b,c);
    }
    public void speak()
    {
        System.out.println("Cat:: meows "+" "+"breed = "+getBreed()+ " "+"colour = "+getColour());
    }
}
 class animal
{
    public static void main(String args[])
    {
        Cat c = new Cat("persian ","brown");
        Dog d = new Dog("german shephard","white brown");
        d.speak();
        c.speak();
    }
}