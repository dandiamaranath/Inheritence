package Inhe;
     
        class Parent {
		    void displayParent() {
		        System.out.println("This is the Parent class.");
		    }
		}		
		class Child extends Parent {               // Child class inheriting from Parent class
		    void displayChild() {
		        System.out.println("This is the Child class.");
		    }
		} 
		
		public class Single
		{
		public static void main(String[] args) {
		                                          // Create an object of the Child class
		Child c = new Child();		        
		      c.displayParent();                 // Call method from Parent class
		      c.displayChild();                  // Call method from Child class
		    }
		}





