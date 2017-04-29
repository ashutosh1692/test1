package myPractice;

public class PrimeSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int f=0;
		int n=100;
		
		for(int x=2;x<=n;x++)
		{
			
			for (int i=2;i<=x/2;i++)
			 {
				int m;
				 
				 m=x%i;
				 
				 if (m==0)
				 {
					 f=1; 
					 break;
				 }
				 else
				 {
					 f=0;
				 }
								
			 }
			if (f==0)
			{
				System.out.println(+x);
			}
			 
		}
	}
}