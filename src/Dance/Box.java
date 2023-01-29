package Dance;

public class Box {
	
	double width;
	double height;
	double depth;
	// the above are the instance variables

}
class BoxDemo{
	public static void main(String[] args) {
		
		//classname objname = new classname(); - syntax to create a box
		Box b1 ;
		// to create an object
		b1= new Box();
		double volume ;
		//assigning values to object b1, which is instance of class Box1
		//dot operator is used to acces instance variables of an object
		b1.width=10;
		b1.height =20;
		b1.depth =15;
		
		//volume of object b1
		volume =b1.width*b1.height*b1.depth;
		System.out.println("Volume of box is " +volume);
		
		//every object will have own copy of instance variables
		
		Box b2;
		b2= new Box();
		b2.width=15;
		b2.height =5;
		b2.depth =10;
		volume =b2.width*b2.height*b2.depth;
		System.out.println("Volume of box is " +volume);
  }
}
/*
class<< name of class>>

*/