package Dance;

public class switchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int month = Integer.parseInt(args[0]);
		String month = args[0];
		var season ="";
		switch(month)
		{
		case "Jan":
		case "Dec":
		case "Nov":
		season ="Winter";
		System.out.println(" Season is "+ season);
		break;
		
		case "March":
		case "April":
		case "May":		
		season ="Summer";
		System.out.println(" Season is "+ season);
		break;
	
		
		/*case 6:
		case 7:
		case 8:
		season ="Spring";
		break;
		
		case 9:
		case 10:
		case 11:
		season ="Spring";
		break;*/
		
		default:
			System.out.println("invalid month");
		}
		
	
		
	}

}
