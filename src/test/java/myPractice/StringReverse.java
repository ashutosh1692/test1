package myPractice;

public class StringReverse {
	
	public static void main(String [] args)
	{
	 String str="Ashutosh";
	 
	 StringBuilder strBuf=new StringBuilder();
	 strBuf.append(str);
	 strBuf= strBuf.reverse();
	 
	 for(int i=0;i<strBuf.length();i++)
		
	 {
		 System.out.print(strBuf.charAt(i));
	 }
		
	}

}
