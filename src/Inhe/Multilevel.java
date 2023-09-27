package Inhe;

class Animal {
	void eat()
	{
		System.out.println("Animals are Eating");
	}
}
class Dog extends Animal {
	void bark()
	{
		System.out.println("Dog is bark");
	}
}
class BabyDog extends Dog 
{
	void weep()
	{
		System.out.println("Babydog is Weeping");
	}
}
public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BabyDog d=new BabyDog();
d.weep();
d.bark();
d.eat();
	}

}
