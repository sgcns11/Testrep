package Dance;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//When condition of expression is false
		//then body of loop is not executed
		//But some times it is required to execute body of loop atleast once
		//even if the condition is false
		/*
		do 
		{
			<< Statements>>
		}While Condition
		*/
		int num =3;
		do // (condition) ==true
		{
			//if condition is true , statement inside while loop is executed
		System.out.println("Welcome to Java programming:"+num);
		num--;
	} while (num>0);

}
}
