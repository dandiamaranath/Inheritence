package Inhe;
class Animals {
    void eat() {
        System.out.println("Animal is eating.");
    }
	void makeSound() {
		// TODO Auto-generated method stub
	}
}
class Pig extends Animals        // Child class 1
{
    void bark() {
        System.out.println("Pork is barking.");
    }
}
class Cat extends Animals        // Child class 2
{
    void meow() {
        System.out.println("Cat is meowing.");
    }
}
public class Hiera {
	public static void main(String[] args) {
                                          
        Dog dog = new Dog();
        Cat cat = new Cat();        
        
        dog.eat();                        // Inherited from Animal class
        dog.bark(); 
        
        cat.eat();                    
        cat.meow();                       
    }
}


