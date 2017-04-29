package myPractice;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int f=0;
		int n=19;
		 for (int i=2;i<n;i++)
		 {
			 int m;
			 
			 m=n%i;
			 
			 if (m==0)
			 {
				 f=1; 
				 break;
			 }
		 }
		if (f==0){
			System.out.println("Number " +n+ " is a prime number");
		}
		else{
			System.out.println("Number " +n+ " is not a prime number");
		}

	}

}

