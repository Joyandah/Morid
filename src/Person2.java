
public class Person2 extends Person1{

	String gym;
	
	public Person2(String name,int age,String power,String gym) {
		super(name,age,power);
		this.gym = gym;

	}
	
	public String toString() {
		return name+ " "+ age+ " "+ power+" "+gym;
	}
}
