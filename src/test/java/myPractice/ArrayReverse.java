package myPractice;

public class ArrayReverse {
	
	public static void main(String [] args)
	{
		// A program to find clumps in an array
	int arr[]={1,1,0,2,2,2,3,4,5,5,10};
	int n=arr.length-1;
	for(int i = 0;i<n;i++,n--){
			
			
			int temp=arr[i];
			arr[i]=arr[n];
			arr[n]=temp;
			
	}
			for(int j:arr)
			{
				System.out.print(j + ", ");
			}
	
		
	}

}
