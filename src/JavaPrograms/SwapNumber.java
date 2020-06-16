package JavaPrograms;

public class SwapNumber {

	public static void main(String[] args) {
		 int a = 10;
		 int b = 20;
			/*
			 * System.out.println("----- Before swapping -----");
			 * System.out.println("Value of a is : " + a);
			 * System.out.println("Value of b is : " + b);
			 * 
			 * System.out.println("----- After Swapping -----");
			 * 
			 * int temp; temp = a; a = b; b = temp;
			 * 
			 * System.out.println("Value of a is : " + a);
			 * System.out.println("Value of b is : " + b);
			 */
		 // without temp var
		 
		 System.out.println("----- Before swapping -----");
		 System.out.println("Value of a is : " + a);
		 System.out.println("Value of b is : " + b);

		 System.out.println("----- After Swapping -----");
		 
		 a = a-b; // -10
		 b = a+b; // -10+20 = 10
		 a = b-a; // 10-(-10) = 20
		 
		 System.out.println("Value of a is : " + a);
		 System.out.println("Value of b is : " + b);
	}

}
