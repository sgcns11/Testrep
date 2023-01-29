package Dance;

public class whileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =3;
		while (num>0)//eal (condition) ==true
		{
			//if conditon is true , statement inside while loop is executed
		System.out.println("Welcome to Java programming:"+num);
		num--;
		}
		System.out.println("First Statement outside the while loop");
		//if condition is false, than next line immediately following
		//loop will be execute
	int a =10;
    int b =20;
	while (a>b)
	{
		System.out.println ("This statement is not printed");
	}
	
	int i =10;
	int j =20;
	//find the midpoint of i and j
	while (++i<--j);
	
	System.out.println ("Mid point is "+i);
}

}
