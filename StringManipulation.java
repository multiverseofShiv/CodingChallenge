import java.util.*;

public class StringManipulation {

	Scanner sc = new Scanner(System.in);
	String str = "Annantanat Vibhushit Poorvamanya";

//	public void insert() {
//		System.out.println("Insert String");
//		str = sc.nextLine();
//	}

	// Remove Duplicate Characters
	public void duplicate() {
		Set<Character> set = new LinkedHashSet<>();
		StringBuilder result = new StringBuilder();

		for (char c : str.toCharArray()) {
			if (set.add(c)) {
				result.append(c);
			}
		}

		System.out.println(result);
		System.out.println(set);

	}

	// find out the string inside that string.

	public void subString() {
		
		for (int i = 0; i < str.length(); i++) {  
            for (int j = i + 1; j <= str.length(); j++) 
            {
                String substring = str.substring(i, j);
                System.out.println(substring);
            }
		}

	}

	// reverse each and every word in string

	public void reverse()
	{
		StringBuilder result = new StringBuilder();
		
		String[] words = str.split("\\s+");
		
		
		for (String string : words) 
		
		{
				char arr[]=string.toCharArray();
				
				for(int i=arr.length-1;i>=0;i--)
				{
					result.append(arr[i]);
				}
				result.append(" ");
						
	}
		System.out.println(result);
	}
	
	//count the total number of words.

	public void totalWords()
	{
		String[] words = str.split("\\s+");
		System.out.println(words.length);
	}
	
	//Replace each consonents with next alphabets of that consonents
	public void consonents()
	{
		
	}


	public static void main(String[] args) {
		StringManipulation mil = new StringManipulation();
//		mil.insert();
//		System.out.println("String is : " + mil.str);
//		mil.duplicate();
//		mil.subString();
//		mil.reverse();
//		mil.totalWords();
//		mil.consonents();

	}

}
