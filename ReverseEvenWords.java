package week1.day2.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "first second third fourth fifth"; 
		//String reversedwords= "";
		String reversedevenwords= "";
		String[] sentence=test.split(" ");
		//String[] conc;
		String temp;
		//for (int i = sentence.length-1;i>=0; i--)
			for (int i = 0;i<sentence.length;i++)
		{
			
			if(i%2!=0)
			{
			
				temp =sentence[i];
				char[] charArray = temp.toCharArray();
				for (int j =charArray.length-1;j>=0;j--)
				{
					reversedevenwords=reversedevenwords+charArray[j];
					reversedevenwords=reversedevenwords+ " ";
				}
				System.out.print(" " +reversedevenwords); 
				reversedevenwords="";
			}			
			else
			{
				System.out.print(" " + sentence[i]); 
			}
			
		}
	}

}
