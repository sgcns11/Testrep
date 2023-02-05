package Class0502;

public class InheritanceDemo {

	public static void main(String[] args) {
		InheritanceA Obj1 = new InheritanceA();
		InheritanceB Obj2 = new InheritanceB();
		InheritanceC Obj3 = new InheritanceC(10, 20 );
		
		Obj1.i=10;
		Obj1.j=20;
		Obj1.showij();
		
		Obj2.k=3;
		Obj2.i=40;
		Obj2.j=50;
		Obj2.showij();
		Obj2.showk();
		
		Obj3.show();
				
	}
}
