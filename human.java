package week12b;

public class human{
	String name;
	int age;
	int height;
	String eyeColor;
	human(){
		
	}
	void display() {
		System.out.println("Hello world "+name);
		System.out.println("My eyes color is "+ eyeColor);
		System.out.println("I am "+ age + " year old");
		System.out.println("I am "+ height +" cm. \n");
	}
	void eat() {
		System.out.println("Eat fish ");
	}
	void walk() {
		System.out.println("Wakk away ");
	}
	void work() {
		System.out.println("Train code ");
	}
	
}