package SeleniumCocept;

public class data_types {

	public static void main(String[] args) {
		/*String a = "hello";
		String b = "World";
		int x= 200;
		int y= 300;
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		System.out.println(x+a+y+b);*/
		
		String stringOriginal = new String ("kartic");
		StringBuilder strbuilder = new StringBuilder(stringOriginal);
		String strreverse = strbuilder.reverse().toString();
		boolean isPalindrame = stringOriginal.equals(strreverse);
		System.out.println(isPalindrame);
		if(isPalindrame=true) {
			System.out.println("its matching");
		}
		
		else {
			System.out.println("Its not matching");
		}
		
	}

}
