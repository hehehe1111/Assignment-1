
 //Name: Hemanta Parajuli
 // Assignment 1
 //Data Structure and Algorithms
 //Professor Vohra
 //Date: 09/02/2021

public class Assignment1 {

	public static void main(String[] args) {
		//creating a bag letter
		Bag<String> letters = new Bag<String>();
		//adding one-letter Strings to the bag
		letters.add("a");
		letters.add("b");
		letters.add("c");
		letters.add("d");
		letters.add("e");
		letters.add("f");
		letters.add("g");
		letters.add("h");
		letters.add("i");
		letters.add("j");
		letters.add("k");
		letters.add("l");
		letters.add("m");
		letters.add("n");
		letters.add("o");
		letters.add("p");
		letters.add("q");
		letters.add("r");
		letters.add("s");
		letters.add("t");
		letters.add("u");
		letters.add("v");
		letters.add("w");
		letters.add("x");
		letters.add("y");
		letters.add("z");
		letters.add("t");
		letters.add("h");
		letters.add("e");
		letters.add("c");
		letters.add("l");
		letters.add("i");
		letters.add("f");
		letters.add("f");
		
	//printing the size of the bag letters
		System.out.println("There are total  " + letters.getCurrentSize() + " letters in the bag 'letters'.");	
		//Creating bag vowel with all vowel letters for checking vowels
		Bag<String> vowel = new Bag<String>();		
	    vowel.add("a");
	    vowel.add("e");
	    vowel.add("i");
	    vowel.add("o");
	    vowel.add("u");
	    
	 //creating a bag for 
	    Bag<String> vowels = new Bag<String>();
		
		//Checking for vowels by comparing with elements in vowel and storing it in the bag named vowels
		for(int i = letters.getCurrentSize(); i > 0; i--)
		{
			String current = letters.remove();
			if(vowel.contains(current))
			{
				vowels.add(current);
			}
		}
		
		//Printing the total number of vowels and total numbers of each vowels.
		System.out.println("There are total " + vowels.getCurrentSize() + " vowels in the bag 'vowels'.");
		System.out.println("There are total " + vowels.getFrequencyOf("a")+ " a in the bag 'vowels'.");
		System.out.println("There are total " + vowels.getFrequencyOf("e") + " e in the bag 'vowels'.");
		System.out.println("There are total " + vowels.getFrequencyOf("i") + " i in the bag 'vowels'.");
		System.out.println("There are total " + vowels.getFrequencyOf("o") + " o in the bag 'vowels'.");
		System.out.println("There are total " + vowels.getFrequencyOf("u") + " u in the bag 'vowels'.");
	}

}
