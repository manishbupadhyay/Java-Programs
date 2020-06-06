package JavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
	
		// 1st Method
		// Using StringBuffer class
		
		StringBuffer stringBuffer = new StringBuffer("Manish Upadhyay");
		// use reverse method to reverse string
		System.out.println(stringBuffer.reverse());
		
		System.out.println("2nd Method to reverse String");
		
		// 2nd Method
		String input = "Manish Upadhyay";
		StringBuilder strBuilder = new 	StringBuilder();
		strBuilder.append(input);
		strBuilder= strBuilder.reverse();
		for(int i=0; i<strBuilder.length(); i++) {
			System.out.println(strBuilder.charAt(i));
		}
	}

}
