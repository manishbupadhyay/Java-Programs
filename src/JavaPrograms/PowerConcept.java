package JavaPrograms;

public class PowerConcept {

	public static void main(String[] args) {
		// power concept --> 2^4 = 16
		int base = 2;
		int exponent = 7;
		
		// 1. method
		long result = 1;
		
		while(exponent != 0) {
			result *= base; // result * base
			--exponent;
		}
		System.out.println(result);
		
		// 2. Method
		//System.out.println(Math.pow(base, exponent));
	}

}
