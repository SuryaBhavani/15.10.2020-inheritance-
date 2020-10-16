//Single level inheritance
class Human{
	void eat() {
		System.out.println("All humans can eat");
	}
}
public class Girl_SingleLevel extends Human {
	void hair() {
		System.out.println("Girls have a long hair");
	}
	public static void main(String args[]) {
		Human obj1=new  Girl_SingleLevel();//can use the below object creation itself
		Girl_SingleLevel obj2=new  Girl_SingleLevel();
		obj1.eat();
		obj2.hair();
	}

}
