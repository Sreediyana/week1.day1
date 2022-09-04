package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstnum=0;
		int secondnum=1;

		int sum=firstnum+secondnum;
		int i;
		System.out.print(firstnum);
		System.out.print(",");
		System.out.print(secondnum);
		System.out.print(",");
		System.out.print(sum);
		System.out.print(",");

		for(i=1;i<=5;i++)
		{

			firstnum=secondnum;
			secondnum=sum;
			sum=firstnum+secondnum;
			System.out.print(sum);
			System.out.print(",");

		}

	}



}