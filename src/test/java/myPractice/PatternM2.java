package myPractice;

public class PatternM2 
{
	
	public static void main(String [] args)
	{
		int n=5;
		
		for (int r=1;r<=n;r++)
		{
			for (int c=1;c<=n;c++)
			{
				if((c==2||c==3||c==4) && (r==1 || r==4 || r==5))
				{
					System.out.print(" ");
				}
				
				else if(c==3 && r==2)
				{
					System.out.print(" ");
				}
				
				else if((c==2||c==4) && r==3)
				{
					System.out.print(" ");
				}
				
								
				else{
					System.out.print("*");
				}
			}
	        
			System.out.println();
		}
		
		
	}

}
