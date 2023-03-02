package Practice_1;

import encap.Encap_Example;

public class Hello {
	
	public static void main(String[] args) {
		Encap_Example encap_Example=new Encap_Example();
		int private_a=encap_Example.returnprivateValue(); // calling method will return a private variable
		System.out.println(private_a);
	}

}
