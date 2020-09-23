package week12b;

public class animal {
	int age;
	String gender;
	int weight;
	String eating;
	String fly;
	
	animal(int a,String b,int c){
		age = a;
		gender = b;
		weight = c;
		System.out.println(age+" "+gender+" "+weight+"\n");
	}
	
	void eat() {
		System.out.println("Eating "+eating);
		System.out.println("Flying "+fly);
		System.out.println(age+" "+gender+" "+weight+"\n");
	}
	void walk() {
		System.out.println("Move ");
	}
	void sleep() {
		System.out.println("Sleeping ");
	}
	
	
}
