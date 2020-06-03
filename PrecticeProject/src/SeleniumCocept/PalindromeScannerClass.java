package SeleniumCocept;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class PalindromeScannerClass {

	public static void main(String[] args) {
		System.out.println("Enter any String");
		Scanner sc = new Scanner(System.in);
			String OriginalString= sc.nextLine();
			String reverseString = new StringBuilder(OriginalString).reverse().toString();
			if(OriginalString.equals(reverseString)) {
				System.out.println("String is a palindrome.");
			}
			else {
				System.out.println("This is not palindrome ");
			}
			
			ArrayList<Integer> List = new ArrayList();
			List.add(1);
			List.add(2);
			List.add(3);
			List.add(4);
			
			List.forEach(System.out::print);
			System.out.println(List);
			SortedSet<Integer> sortedSet = new TreeSet<>();
			 
			sortedSet.add(2);
			 
			sortedSet.add(1);
			sortedSet.add(1);
			 
			sortedSet.add(3);
			 
			System.out.println(sortedSet);  //[1,2,3]
			
			
			
}
}


