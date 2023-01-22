package Dance;

public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*
       +Operator in java has 2 different behaviours
       
       It is used for addition of numeric values
       It is used for concatination of string
         */
		
		System.out.println(10+20);
		System.out.println(10+"20");
		System.out.println("10"+"20");
		System.out.println("10" +20);
		
		incremental_ops();
		relational_ops();
		Logical_ops();
		arethmetic_ops();
		
	}
		public static void incremental_ops ()
		
		{
		int a=5;
		//pre increment ---it will increase immediately, it will update and then assign
		System.out.println(++a);
		//post increment -- it will display and then increase. , it will assign and then update.
		int b =8;
		System.out.println(b++);
		int c=b;
		System.out.println(c);
				
		
	}

	public static void relational_ops ()
	{
		int a =10;
		int b=15;
		//<> <= >=
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
	}
	
	public static void Logical_ops ()
	{
	
		//&& ||
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || false);
		
	}
	
	public static void arethmetic_ops ()
	{
		int a =10;
		int b=5 ;	
		int add =a+b;
		int sub = a-b;
		double mul =a*b;
		double div =a/b; 
		System.out.println("Addition of number:"+ add);
		System.out.println("Sub of number:"+sub);
		System.out.println("Multiple of number:"+mul);
		System.out.println("Division of number:"+div);
	}
}
