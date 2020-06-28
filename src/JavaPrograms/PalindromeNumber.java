package JavaPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		// A Palindrome number is a number that is same after reverse. For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. 
		//It can also be a string like LOL, MADAM etc.
		
		int num = 121;
		int rev = 0;
		
		int actualNum = num;
		
		while(num != 0) {
			int n = num % 10;
			rev = rev * 10 + n;
			num = num / 10;
		}
		System.out.println(rev);
		
		if(actualNum == rev) {
			System.out.println(actualNum + " is a Palindrome");
		}
		else {
			System.out.println(actualNum + " is not a Palindrome");
		}
	}

}
