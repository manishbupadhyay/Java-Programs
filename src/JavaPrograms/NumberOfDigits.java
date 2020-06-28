package JavaPrograms;

public class NumberOfDigits {

	public static void main(String[] args) {
		// find number of digits 
		// 1234 --- number of digit is 4
		
		int num = 1234879;
		int count = 0;
		
		while(num != 0) {
			num = num/10;
			count++;
		}
		System.out.println("Number of digits : " + count);

	}

}
