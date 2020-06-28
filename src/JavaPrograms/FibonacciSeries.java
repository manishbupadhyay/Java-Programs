package JavaPrograms;

public class FibonacciSeries {

	static int n1=0,n2=1,n3=0;

	public static void main(String[] args) {

		// simple way
		int t1=0,t2=1,num=10;

		for(int i=1; i<=num; i++) {
			System.out.println(t1);
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
		
		System.out.println("--------------------------------");
		
		// Fibonnaci series is, next number is the sum of previous two numbers. example 0,1,1,2,3,5,8,13......
		// Fibonacci series without using recursion
		int a=0,b=1,c,count=10;
		System.out.println(a+" " +b);
		for(int i=2;i<count;i++) {
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
		}

		System.out.println("Fibonacci series using recursion");

		fibonacciSeries(count-2);

	}

	// Fibonacci series using recursion
	static void fibonacciSeries(int count) {
		if(count>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(""+n3);
			fibonacciSeries(count-1);
		}
	}

}
