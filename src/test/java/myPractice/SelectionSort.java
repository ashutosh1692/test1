package myPractice;

public class SelectionSort {
	
	public static void main(String [] args)
	{
		// A program to find clumps in an array
	int arr[]={8,4,3,9,1,6,7,5,2};
	 
			for (int i=1;i<arr.length;i++)
			{
				
				for (int j=0;j<arr.length-1;j++)
				{
					if(arr[i]<arr[j])
					{
						int temp;
						
						{	
						temp=arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
						}
					}
					
				}	
				
	}
	for(int l:arr)
	{
		System.out.print(l + ", ");
	}
	}
}
