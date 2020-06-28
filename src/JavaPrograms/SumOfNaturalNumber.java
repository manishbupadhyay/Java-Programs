package JavaPrograms;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		// 1+2+3+4+5+.............. +100 ==> 5050
		
		int num = 100;
		int sum = 0;
		
		//1. using for loop
		for(int i=1; i <= num; i++) {
			sum = sum+i;
		}
		System.out.println("Sum of Natural Number is: " + sum);
		
		System.out.println("------------------------------------------"); 
		
		//2. using while loop
		 int sumNumber = 0;
		 int k = 1;
		 while(k <= num) {
			 sumNumber = sumNumber + k;
			 k++;
		 }
		 System.out.println("Sum of Natural Number is: " + sumNumber);
	}

}
