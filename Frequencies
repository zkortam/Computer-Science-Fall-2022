   import java.util.Scanner;

    public class Frequencies{
		public static void main(String[]args){
			Scanner in = new Scanner(System.in); 
			int vowelsCount;
			int tVowels=0;
			int consonants;
			int tConsonants=0;
			int numbers;
			int tNumbers=0;
			int other;
			int tOther=0;
			String sentence="  ";
			
			while (!sentence.equals("")){
				//Variable Reset
				vowelsCount = 0;
				consonants = 0;
				numbers = 0;
				other = 0;	
				
				//Input
				System.out.printf("Please enter a sentence, or press RETURN to end: ");
				sentence = in.nextLine();
				if (sentence.equals("")){
					break; 
				}
				System.out.printf("%n");
				sentence = sentence.toLowerCase();
				//Input Evaluation 
				for(int i=0; i<sentence.length(); i++) {	
				
					char ch = sentence.charAt(i);
					if ( ch == 'a' || ch == 'i'|| ch == 'o' || ch == 'u' || ch == 'e' || ch =='y'){
						vowelsCount = vowelsCount + 1;
					} else if (ch >= 'a' && ch <= 'z'){
						consonants = consonants + 1;
					} else if ( ch >= '1' && ch <= '9') {
						numbers = numbers + 1;
					} else {
						other = other + 1;
					}	
				}
				// Round Output	
				System.out.printf("Vowels: %d%n", vowelsCount);
				System.out.printf("Consonants: %d%n",consonants);
				System.out.printf("Numbers: %d%n",numbers);
				System.out.printf("Other Characters: %d%n%n",other);
				
				// Total Calculation	
				tVowels = vowelsCount + tVowels;	
				tConsonants = consonants + tConsonants;
				tNumbers = numbers + tNumbers;
				tOther = other + tOther;
			
			}
			// Total Output
			System.out.printf("The total number of vowels are: %d%n", tVowels);
			System.out.printf("The total number of consonants are: %d%n",tConsonants);
			System.out.printf("The total number of numbers are: %d%n",tNumbers);
			System.out.printf("The total number of other characters are: %d%n",tOther);
	  
	

	}
}
