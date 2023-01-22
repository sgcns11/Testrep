package Dance;

public class Tuesday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Hemant";
	     String LastName = "Kumar";
	     String school ="Carmel";
	     int data =10;
	    // aby valriable declared with final keyword cannot be changed
	     float b =5.7f;
	     char ch ='A';
	     boolean result = true;
	     
	     //<data type > variable_name = value
	     
	     System.out.println("My Name Is "+ name + LastName);
	     System.out.println(school);
	     System.out.println(data);
	     System.out.println(b);
	     System.out.println(ch);
	     System.out.println(result);
	     
	     
	     //user entered data should be captured ---Variables
	     //based on user data system returns results, it means it 
	     //is performing activity - method
	     
	     //Reintialise to other values
	     System.out.println("---reassign new values to variables");
	     
	     data =120;
	     System.out.println(data);
	     
	      b =7.7f;
	     System.out.println(b);
	     
	     ch ='C';
	     System.out.println(ch);
	    
	     
	     getvariable(); 
	}
	
	public static void getvariable ()
	{
		//declare a variable
		
		byte a;
		//assign a value - is called initialisation
		a=12;
		System.out.println(a);
		
	}

}
