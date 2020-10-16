//@Hierarchial inheritance
class Language{
	void speak() {
		System.out.println("Language is used for communication");
	}
}
class Hindi extends Language{
	void region() {
		System.out.println("Hindi is widely spoken in north india");
	}
}
class English extends Language{
	void usage() {
		System.out.println("English is the most commonly used language throughout the world and is considered as the window of the world");
	}
}
public class Hierarchial_Inheritance {
	public static void main(String[]args) {
		English obj1=new English();
		Hindi obj2=new Hindi();
		obj1.speak();
		obj1.usage();
		//obj1.region(); //can't use it as we doesnt extend hindi class
		obj2.speak();
		obj2.region();
		
	}
	

}
