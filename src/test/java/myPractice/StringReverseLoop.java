package myPractice;

public class StringReverseLoop {
	
	public static void main(String [] args)
	{
	 String str="Ashutosh";
	 
	char ch[]=str.toCharArray();
		 
	 int n=ch.length-1;
	 
	 for (int i=0;i<n;i++,n--)
	 {
		 char temp=ch[i];
		 ch[i]=ch[n];
		 ch[n]=temp;
	}
		
	 for(char m:ch)
	 {
		 
		 System.out.print(m);
	 }
	}

}
