interface Test1{
	
	int getMarks();
	String getGrade();
}
interface Test2 extends Test1{
	String name();
	int Roll();
	
}
public class InterfaceInheritance implements Test2{
	public int getMarks(int marks) {
		return marks;
	}
	public String getGrade(int marks) {
		
		if (marks<31){
			return "fail";
		}
		else if ((marks>=31)&&(marks<=50)) {
			return "Grade c";
		}
		else if ((marks>=51)&&(marks<=75)) {
			return "Grade b";
		}
		else {
			return "Grade a";
		}
	}
	public String name(String name) {
		return name;
	}
	public int roll(int roll) {
		return roll;
	}
	public static void main(String []args) {
		InterfaceInheritance obj1=new InterfaceInheritance();
		System.out.println(obj1.getMarks(50));
		System.out.println(obj1.getGrade(75));
		System.out.println(obj1.name("Surya"));
		System.out.println(obj1.roll(401));
	}
	

}
