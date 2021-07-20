package JavaPrograms;

public class NoOfCharacterOccurance {
	static final int maxChar=256;
	
	// using Array
	static void getOccurringChar(String str) {
		// creating an array of size 256
        int count[] = new int[maxChar];
 
        int len = str.length();
 
        // Initialize count array index
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;
 
        // Create an array of given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
 
                // If any matches found
                if (str.charAt(i) == ch[j])
                    find++;
            }
 
            if (find == 1)
                System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);
	}
	}
	// main method
    public static void main(String[] args)
    {
        //String str = "Maish Upadhyay";
        //getOccurringChar(str);
        
    	// using string library
        String input = "Manish Upadhyay";
        char search = 'a';
        int count =0;
        for(int i=0; i<input.length(); i++) {
        	if(input.charAt(i) == search)
        		count++;
        }
        System.out.println("The Character '"+search+"' appears "+count+" times.");
    }

}
