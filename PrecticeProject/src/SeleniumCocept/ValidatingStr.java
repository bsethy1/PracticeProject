package SeleniumCocept;

public class ValidatingStr {

	public static void main(String[] args) {
		String str = "payment $100 paid to the Customer";
		if(str.contains("$100")) {
			System.out.println("payment is successful");
		}else {
			System.out.println("payment is not successful");
		}
		
	}

}
