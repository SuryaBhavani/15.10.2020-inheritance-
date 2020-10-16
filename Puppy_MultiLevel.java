//@Multilevel inheritance
class Animals{
	void habitate() {
		System.out.println("May or may not live in forest");
	}
}
class Dogs extends Animals{
	void pet() {
		System.out.println("Can be made as pet");
	}
}
public class Puppy_MultiLevel extends Dogs {
	void bark() {
		System.out.println("bow..bow..");
	}
	public static void main(String[]args) {
		Puppy_MultiLevel obj=new Puppy_MultiLevel();
		obj.habitate();
		obj.pet();
		obj.bark();
	}
	
	

}
