package myPractice;

public class PatternM 
{
	
	public static void main(String [] args)
	{
		int n=20;
		
		for (int r=1;r<=n;r++)
		{
			for (int c=1;c<=n;c++)
			{
				if(c==1|| c==n-1 || ((c==r||c==n-r-1) && (r<n/2)))
						{
					System.out.print("*");
						}
				else{
					
					System.out.print(" ");
				}
				
			}
	        
			System.out.println();
		}
		
		
	}

}
