package Class0502;

public class InheritanceC extends InheritanceA { // i& j and showij are also available in InheritanceC
	int i;//data members
	
	public InheritanceC(int a, int b)
	{
		super.i=a;
		i=b;
		
	}
	void show()
	{
		System.out.println("value of i in parent :"+ i);
		System.out.println("value of i in child :"+ i);
	}

}
