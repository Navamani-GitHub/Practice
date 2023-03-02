package Practice_2;

public class AccessSpecfiers {
	public int a=10;
	private int b=30; // can usedwith in the class not outside the class.
	int c=100; // default
	
	public void test_public()
	{
		System.out.println("pub");
	}
	
	private void test_private()
	{
		System.out.println("private");
	}
	 void test_default()
	{
		System.out.println("defaulta");
	}
	public static void main(String[] args) {
		
		AccessSpecfiers accessSpecfiers=new AccessSpecfiers();
		accessSpecfiers.test_private();
	}

}
