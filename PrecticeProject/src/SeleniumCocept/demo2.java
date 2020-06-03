package SeleniumCocept;

public class demo2 {

	public static void main(String[] args) {
		String originalString = "kartic";
		StringBuilder strbuilder = new StringBuilder(originalString);
		String reverse=strbuilder.reverse().toString();
		boolean pp=originalString.equals(reverse);
		if(pp=true) {
			System.out.println("Its matching");
		}
	else {
		System.out.println("Its not matching");
	}}

}
