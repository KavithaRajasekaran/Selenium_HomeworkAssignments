package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		String Original= "Madam";
		String reversed="";
		String ch=" ' ";

		char[] charArray = Original.toCharArray();

		for (int i = (charArray.length)-1; i>=0; i--) 
		{
			reversed=reversed+charArray[i];
			//System.out.println(reversed);
		}
		//System.out.println(reversed);
		//System.out.println(Original);
		boolean flag;
		flag=Original.equalsIgnoreCase(reversed);
		if(flag)
		{
			System.out.println("The string " + ch + Original + ch + " is a Palindrome");
		}
		else
		{
			System.out.println("The string " + ch + Original + ch + " is not a Palindrome");
		}
	}

}
