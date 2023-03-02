package Practice_2;

import Practice_1.Sample; // package importing

public class Welcome {

	//class name and constructer name will be same.
	// when an object is created constucter gets called
	public Welcome() {
	System.out.println( );
	}
	
	int a=10; //global

	public void Room1() {
		int a=30; //local variable
		System.out.println("Hello2--"+a);
	}
	public void Room2() {
		System.out.println("Hello 3--"+a);
	}
	public void Room3() {
		System.out.println("Hello4");
	}
	public static void main(String[] args) { // the execution point of any program starts from main method
	
	Sample sample = new Sample(); // creating object of a differnt class.
	Welcome welcome_objectName = new Welcome();  // object 

	// object 
//	welcome_objectName.Room3();
	//sample.sample1();// calling the method.
	welcome_objectName.Room1(); //calling the methiod with object 
	welcome_objectName.Room2();
//	Welcome welcome_objectName2 = new Welcome();  // object 
	//welcome_objectName2.Room2();

	}
}
