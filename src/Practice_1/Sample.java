package Practice_1;

import Practice_2.AccessSpecfiers;

public class Sample {

	public void sample1()
	{
		System.out.println("Sample -1 ");
		AccessSpecfiers accessSpecfiers= new AccessSpecfiers();
		System.out.println(accessSpecfiers.a);
		accessSpecfiers.test_public();
	}
}
