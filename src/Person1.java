
public class Person1 extends Person{

	String power;
	
	public Person1() {
		super();
	}
	
	public Person1(String name) {
		super(name);
	}
	
	public Person1(String name,int age,String power) {
		super(name,age);
		this.power = power;
	}
	
	public String toString() {
		return name + " " + age + " " + power;
	}
}
