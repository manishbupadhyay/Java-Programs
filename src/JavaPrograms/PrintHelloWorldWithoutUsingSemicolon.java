package JavaPrograms;

public class PrintHelloWorldWithoutUsingSemicolon {

	public static void main(String[] args) {
		// 1st method
		if(System.out.printf("Hello World" + "\n") == null) {

		}

		// 2nd method
		if(System.out.append("Hello World" + "\n") == null) {

		}

		// 3rd method
		if(System.out.append("Hello World").equals(null)) {

		}
		
	}

}
