package Class0502;

public class OverloadingDemo {
	
	void hello()
	{
		System.out.println("hello with no prarameters");
	}
	void hello(int a)
	{
		System.out.println("hello with 1  prarameters of type integer"+ a);
	}
	void hello(int a,int c)
	{
		System.out.println("hello with 2  prarameters of type integer" + a +","+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      OverloadingDemo obj1 =new OverloadingDemo();
      
      obj1.hello();
      obj1.hello(10);
      obj1.hello(10,20);
	}
}

