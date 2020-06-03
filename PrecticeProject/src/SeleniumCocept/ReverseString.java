package SeleniumCocept;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Bibhuti";
		StringBuilder OriginalString = new StringBuilder(str);
		String reverseString= OriginalString.reverse().toString();
		if(OriginalString.equals(reverseString)) {
			
			System.out.println("This is palindrome");
		}else
		{
			System.out.println("This is not Palindrome");
		}
			
	}

}
