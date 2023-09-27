package Inhe;
abstract class Shape                         //This is Abstract class
{
  abstract double calculateArea();           // Concrete method
  void display() {
     System.out.println("This is a shape.");
 }
}
class Circle extends Shape                   //Concrete subclass
{
 double radius;
 Circle(double radius) {
     this.radius = radius;
 }
  @Override                                  // Implementing the abstract method
 double calculateArea() {
     return Math.PI * radius * radius;
 }}
class Rectangle extends Shape 
{
 double length;
 double width;

 Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }
 @Override                                   // Implementing the abstract method again
 double calculateArea() {
     return length * width;
 }}
public class Abstract {
	 public static void main(String[] args) {
	     Circle circle = new Circle(4);
	     Rectangle rectangle = new Rectangle(4, 5);
	     circle.display();
	     System.out.println("Circle Area: " + circle.calculateArea());
	     rectangle.display();
	     System.out.println("Rectangle Area: " + rectangle.calculateArea());
	    }
}
