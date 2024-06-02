package javaprograms;

public class stringmethods {

	public static void main(String[] args) {
		
		String str = "  Hello World   ";
		
		int length = str.length();
		System.out.println("the length is : " + length );
		
		String toUpperCase = str.toUpperCase();
		System.out.println("UpperCase is : " + toUpperCase);
		
		String toLowerCase = str.toLowerCase();
		System.out.println("Lower case is :" + toLowerCase);
		
		String  trim = str.trim();
		System.out.println("The trim is :" + trim);
		
		boolean contains = str.contains(str);
		System.out.println("The string is : "  + str.contains("Hell"));
		System.out.println("The string is : "  + str.contains("heaven"));
		
		
		
	}

}
