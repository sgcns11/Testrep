package Class0502;

public class AccessCrontroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    AccessControlDemo Obj1 = new AccessControlDemo();
    Obj1.a=5;
    Obj1.b=6;
    Obj1.setC(8);
    System.out.println("Vlaue of A:"+ Obj1.a);
    System.out.println("Vlaue of B:"+Obj1.b);
    System.out.println("Vlaue of C:"+Obj1.getc());
    //when a member of a class is public then it is accessed by any other code
    //If private then getter and setter need to used as it not accessable to any other classes or sub classes. .
    // Can be used only the by the members of the class thats is getters and setter. 
    //protected applies only when inheritance is involved
    //final variable -it cnnot be chnaged further
	}

}
