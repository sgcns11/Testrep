package Dance;

public class flowControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		if (boolean condition)
		{
			//Statement inside it will get executed
		}

	} // if condition is false then will skip to next statement
*/
		//Largest among three numbers 40 75 150
		int a = 40, b =-40, c=140 ;
		// compare a with b and c
		//if both conditions are true then print a
		if (a>=b && a>=c)
		{
			System.out.println("Largest of 3 numbers is :" +a);
		}
		if (b>=a && b>=c)
		{
			System.out.println("Largest of 3 numbers is :" +b);
		}
		if (c>=a && c>=b)
		{
			System.out.println("Largest of 3 numbers is :" +c);
		}
}
}
