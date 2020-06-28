package JavaPrograms;

public class Alphabetcheck {

	public static void main(String[] args) {
		// check if character is alphabet or not
		
		char c='0';
		
		if((c >= 'a' && c<='z') || (c >= 'A' && c<='Z')) {
			System.out.println(c + " is an alphabet");
		}	
		else {
			System.out.println(c + " is not an alphabet");
		}
	}

}
