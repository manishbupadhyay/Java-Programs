package JavaPrograms;

public class LargestAmongThreeNumber {

	public static void main(String[] args) {
		int x=1000;
		int y=1200;
		int z=1000;
		
		//1. approach
		if(x>y && x>z) {
			System.out.println("x is the greatest number");
		}
		else if(y>z) {
			System.out.println("y is the greatest number");
		}
		else {
			System.out.println("z is the greatest number");
		}

		//2. approach
		if(x>=y) {
			if(x>=z) {
				System.out.println("x is the greatest number");
			}
			else {
				System.out.println("z is the greatest number");
			}
		}
		else {
			if(y>=z) {
				System.out.println("y is the greatest number");
			}
			else {
				System.out.println("z is the greatest number");
			}
		}
	}

}
