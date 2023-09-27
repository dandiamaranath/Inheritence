package Inhe;
abstract class A 
{
abstract void makeSound();                             // Abstract method
}
                                                        // Abstract subclass inheriting from Animal
abstract class Bird extends Animal{
                                                       // Abstract method in the Bird class
    abstract void fly();
}
class Sparrow extends Bird {
	
    void makeSound() {
    System.out.println("Sparrow is chirps.");
    }
    @Override
    void fly() {
    System.out.println("Sparrow is flying.");
    }
}

public class Abstracts {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();

        sparrow.makeSound();
        sparrow.fly();
    }
}




