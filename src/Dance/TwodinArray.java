package Dance;

public class TwodinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array of array , multidimensional array
		
		int twoDarr[][];
		twoDarr =new int[4] [5];
		int k=0;
		for (int i=0;i<twoDarr.length;i++)
		{
			for (int j=0;j<5;j++)
			{
			twoDarr[i][j]=k;
			System.out.println("Value["+i+"]["+j+"] is : "+twoDarr[i][j]);
			k++;
			}
			System.out.println("******");
		}
		

	}

}
