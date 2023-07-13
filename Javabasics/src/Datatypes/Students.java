package Datatypes;

public class Students {
 
	String name;
	int age;
	int marks;
	static String college = "kuppam degree college";
	public  Student  (String name, int age, int marks) {
		this.name = name;
		this.age = age;
		this.marks= marks;
	}
	
	public void print () {
		System.out.println("name=" + Student.name);
		System.out.println("age=" + Student.age);
		System.out.println("marks=" + Student.marks);
		System.out.println("college=" + Student.college);
	}
	
	public static void main  ( String [] args) {
		Student s1 = new student ("Manohar", 101, 95);
		System.out.println(s1);
		
	}
	
 
}
