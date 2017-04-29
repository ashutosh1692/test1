package myPractice;

public class Array1 {
	
	public static void main(String [] args)
	{
		// A program to find clumps in an array
	int arr[]={1,1,0,2,2,2,3,4,5,5,10};
	int count=0; 
			for(int i = 0;i<arr.length-1;i++){
			if(arr[i] == arr[i+1] && (i==0||arr[i-1]!=arr[i]))
			{
			count++;
			}
	}
	System.out.println("Total Clump = " + count);
		
	}

}
