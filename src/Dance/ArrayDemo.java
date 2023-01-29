package Dance;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//an array is  a data structure which holds a group of variable together
		//its size should be defined.
		//when an array is created we cannot change size of array

	/*
	int month_days[]; //type name_arr[]---declaring an array
	month_days=new int[5];// name_arr =new type [size]---allocating memory to aerray
	month_days[0] =10;//assigning values to the array, array index with 0
	month_days[1] =20;
	month_days[2] =20;
	month_days[3] =20;
	month_days[4] =50;
	for(int i=0; i<=4; i=i+1) // or you can mention i++
	System.out.println(month_days[i]);	
	*/
		/*
		int month_days[]= {10,20,30,40,50,60,70};
		for (int i=0; i<=month_days.length;i=i+1)
			System.out.println(month_days[i]);	
			*/
		/*
		int nums[]= {10,20,30,40,50,70};
		float result =0;
		for(int i=0;i<nums.length;i=i+1)
		{
			//System.out.println(result+"="+result+"+"+nums[i]);
			result = result+nums[i];
		
		}
		System.out.println("Average of nums is :"+ String.format("%.2f",result/nums.length)); 
		*/
		int arr[];
		arr=new int[5];
		for (int i=0; i<arr.length;i++)
		{
			arr[i] =i*10;
			System.out.println(arr[i]);
		}
	}
}
