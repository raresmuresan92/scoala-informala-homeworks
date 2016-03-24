package ro.sci.week6;

public class Person {
	
	private int age = 25;
	private String name;
	
	public Person(){
		this.setName("Rares");
		System.out.println("Person " +age);
		System.out.println("Name is " + this.getName());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	static {
		System.out.println("Static from person");
	}



	
	public String toPtrint() {
		return "Person";
	}
	
	
	
}
