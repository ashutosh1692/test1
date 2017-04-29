package myPractice;

public class Fibonacci {

	public static void main(String[] args) {
		int a[] = new int[10];
		int n=10;
		
		a[0]=0;
		a[1]=1;
		for(int i=0;i<n;i++)
		{
			if (i<=1)
			{
				System.out.print(+a[i] + " ");
			}
			else
			{
				a[i]=a[i-1]+a[i-2];
				System.out.print(+a[i] + " ");
				
			}
		}

	}

}
