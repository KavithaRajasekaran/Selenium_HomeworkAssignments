package week1.day1.assignments;

public class IdentifyPrimeNumber {

	public static void main(String[] args) {
	
		int n=59;
		boolean prime = false;
		for(int i=2;i<=(n-1);i++)
		{
			if(n % i ==0)
			{
				prime=true;
				break;
			}
		}
		if(!prime)
		{
			System.out.println(n + " is a prime number");
		}
		else
		{
			System.out.println(n + " is not a prime number");
		}
		}
		
	}

