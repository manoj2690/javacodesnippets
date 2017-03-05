package readCSV;

public class CheckClass {

	public static void main(String[] args) {
		String dels = "-, 0123456789(*&^%$#@!_)";
		String specs = "[" + dels + "]+";
		String letts = "[^" + dels + "]+";
		String text = "one, two - three! four";
		String[] words = text.split( specs );
		String[] delim = text.split( letts );
		
		
		for (int i = 0; i<words.length; i++)
		System.out.println(words[i]);
		
		for (int j = 0; j<delim.length; j++)
			System.out.println(delim[j]);
			
			
			

	}

}
