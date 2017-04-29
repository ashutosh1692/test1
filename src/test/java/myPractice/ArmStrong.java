package myPractice;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int arm=371;
int m=arm;

int p=m;
int s=0;
int sum=0;

while (p>0)
{
	s=p%10;
	p=p/10;
	sum=sum + (s*s*s);

}

if (sum==m){
	System.out.print("No. " +arm+ " is an armstrong number");
}

else {
	System.out.print("No. " +arm+ " is not an armstrong number");
}
		
		
	}

}

