package week1.day2.assignments;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String test = "STRING";

		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) 
		{
			if(i%2!=0)
			{
				// char ch=charArray[i];			
				System.out.print(Character.toLowerCase(charArray[i]));
			}
			else
			{
				System.out.print(charArray[i]);
			}
		}

	}

}
