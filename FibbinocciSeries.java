package week1.day1.assignments;

public class FibbinocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstnumber=0;
		int secondnumber=1;
		int sum;
		System.out.println(firstnumber);
		System.out.println(secondnumber);
		for(int i=0;i<7;i++)
		{
			sum=firstnumber+secondnumber;
			System.out.println(sum);
			firstnumber=secondnumber;
			secondnumber=sum;
		}
	}
}
