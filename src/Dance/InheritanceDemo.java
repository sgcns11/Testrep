package Dance;

public class InheritanceDemo {

	public static void main(String[] args) {
		InheritanceA parent = new InheritanceA();
		InheritanceB child = new InheritanceB();
		parent.i=10;
		parent.j=20;
		parent.showij();
		
		child.k=3;
		child.i=40;
		child.j=50;
		child.showij();
		child.showk();
				
	}
}
