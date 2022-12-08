package week1.day2.assignments;

public class RemoveDuplicateword {

	public static void main(String[] args) {
		String text = "We learn java basics part of java sessions in java week1";
		System.out.println(text);

		String[] strarray = text.split(" ");
		String[] out_strarray = text.split(" ");
		for (int i = 0; i < strarray.length; i++)
		{
			for (int j = i+1; j < strarray.length; j++)
			{		
				if(strarray[i].equals(strarray[j]))
				{
					out_strarray[j]="";
					out_strarray[i]="";

				}
			}
			System.out.print(out_strarray[i] + " ");
		}

		}

}
