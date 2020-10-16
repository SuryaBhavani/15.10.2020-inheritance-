//@Run Time Polymorphism
class Animal{
	void getType() {
		System.out.println("Enter the type of the animal");
	}
	public String toString()
	{
		return "hai";
	}
	
}

public class Dog_RunTimePoly extends Animal {
	void getType() {
		System.out.println("Dog is a pet animal");
	}
	public static void main (String []args) {
		Animal obj=new Dog_RunTimePoly();//upcasting
		obj.getType();
		System.out.println(obj.toString());
		obj=null;
	}
		
	}


