package Dance;

public class ifElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		if( a==12||(a>1 && a<=2))
		{
			System.out.println("Winter seasom");
		}
		else if( a>2 && a<=5)
		{
			System.out.println("Summer seasom");
		}
		else if( a>5 && a<=8)
		{
			System.out.println("Spring seasom");
		}
		else if( a>8 && a<=11)
		{
			System.out.println("Autmn seasom");
		}
		else
		{
			System.out.println("Invalid seasom");
		}
	}

}
