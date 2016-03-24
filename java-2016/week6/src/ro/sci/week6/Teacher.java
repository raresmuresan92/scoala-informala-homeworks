package ro.sci.week6;

public class Teacher extends Person{
	

	static {
		System.out.println("Static from teacher");
	}
	

	private String speciality="All";
	
	public Teacher() {
		super();
		System.out.println("Teacher "+ speciality);
	}
	
	
	
	public static String toPtring() {
		return "Teacher";
	}
	
	public static void main(String[] args){
		Person t = new Teacher();
		System.out.println(((Teacher)(t)).toPtrint());
	}
	
}
