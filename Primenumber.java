package week1.day1;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int inputvalue=8;
int i;
int count1=0;
for(i=2;i<inputvalue;i++)
{
	if(inputvalue%i==0)
	{
		count1=count1+1;
		
	}
	
	
	}
if(count1==0) {
	System.out.println("Prime");
}
	else
	{
		System.out.println("not prime");
}

	}

}
