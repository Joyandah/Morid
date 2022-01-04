import java.util.Scanner;

public class Person implements Inter{
	
	static int count;
	static String name;
	int age;
	
	public Person(){
	}
	
	public Person(String name){
		Person.name = name;
		count++;
	}
	
	public Person(int age) {
		this.age = age;
		count++;
	}
	
	public Person(String name,int age) {
		Person.name = name;
		this.age = age;
		count++;
	}
	
	public String toString() {
		return "you have "+ count++ +" friend";
	}
	
	Scanner scan = new Scanner(System.in);
//	int speed = scan.nextInt();
//	public void speed() {

//	if(speed >= 200) {
//		System.out.println("this car is fast");
//	}else if(speed < 200 && speed > 100) {
//		System.out.println("this car is in normal speed");
//	}else {
//		System.out.println("this car is too slow");
//	}
//}
	public void people(int age,String name,String lname) {
		System.out.println("what is your full name ? ");
		name = scan.next();
		lname = scan.next();
		System.out.println("how old are you ? ");
		age = scan.nextInt();
		System.out.println("Hello Mr "+name+" "+lname);
		System.out.println("you are "+age+" years old");
	}
}
