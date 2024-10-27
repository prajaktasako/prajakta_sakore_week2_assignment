package p1;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayAttributes() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		
	}
	
	public static void main(String[] args) {
		Person person = new Person("prajakta",24);
		
		person.displayAttributes();
		System.out.println();
		
		Person person2 = new Person("divya", 25);
		
		person2.displayAttributes();
		System.out.println();
	}

}
