package JavaPrograms;

import java.util.Arrays;
import java.util.BitSet;

public class PrintNumbersWithoutLoopAndRecursion {

	public static void main(String[] args) {
		// we can achieve this with following 2 methods.
		// 1. Arrays fill
		
		Object num[] = new Object[100];
		Arrays.fill(num, new Object() {
			int count = 0;
			@Override
			public String toString() {
				return Integer.toString(++count);
			}
		});
		
		System.out.println("============ 1st Method to print numbers from 1 to 100 without any loop and recursion ============");
		System.out.println(Arrays.toString(num));
		
		System.out.println("============ 2nd Method to print numbers from 1 to 100 without any loop and recursion ============");
		
		// 2. Bitset
		String set = new BitSet() {{set(1,101);}}.toString();
		System.out.append(set, 1, set.length());
	}

}
