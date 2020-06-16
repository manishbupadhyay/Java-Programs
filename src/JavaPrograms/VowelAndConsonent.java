package JavaPrograms;

public class VowelAndConsonent {

	public static void main(String[] args) {

		// vowel are : a e i o u
		char ch = 'm';
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is vowel");
		}
		else {
			System.out.println(ch + " is consonent");
		}

		// 2nd way, we can use switch case
		char chrc = 'u';
		switch (chrc) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':

			System.out.println(chrc + " is vowel");
			break;

		default:
			System.out.println(chrc + " is consonent");
			break;
		}
	}
}
