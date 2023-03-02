package encap;


public class Encap_Example {

	private int a=10;
	private int b=20;
	
	public int   returnprivateValue()
	{
		return a;
	}
	
	//what your returning mention that here. // in place of void mention int.
	public int test()
	{
		int c=a+b;
		System.out.println(c);
		return c; // what value you want return metnion that here
	}
	
	public void test1()
	{
		int d=test()+50;
		System.out.println(d);
	}
	
	public void test3(int a,int b) // reusable methods
	{
		int c;
		c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {

		Encap_Example encap_Example= new Encap_Example();
		encap_Example.test1();
		encap_Example.test3(10,20);
		encap_Example.test3(100,20);

	}

}
