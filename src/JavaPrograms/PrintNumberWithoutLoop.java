package JavaPrograms;

import java.util.stream.IntStream;

public class PrintNumberWithoutLoop {

	public static void main(String[] args) {
		/* print number 1 to 100 without any loop
		 * 1. recursive method - in this method we can also giving range of value in method
		 * 2. Java Streams
		 * */
		System.out.println("============ 1st Method (recursive method) to print numbers from 1 to 100 without any loop ============");
		printNum(1);
		
		System.out.println("============ 1st Method (recursive method) to print numbers from 1 to 100 without any loop and giving value range ============");
		printNumber(1,100);
		
		System.out.println("============ 2nd Method (Java Streams) to print numbers from 1 to 100 without any loop ============");
		IntStream.range(1, 101).forEach(e -> System.out.println(e));

	}

	public static void printNum(int num) {
		if(num <=100) {
			System.out.println(num); // 1 2 3 4 5 ......... 100
			num++;
			printNum(num);
		}
	}
	
	public static void printNumber(int startNum, int endNum) {
		if(startNum <=endNum) {
			System.out.println(startNum); // 1 2 3 4 5 ......... 100
			startNum++;
			printNumber(startNum,endNum);
		}
	}
}
