/**
First iteration of Disemvoweler

ToDo
Compile
Test
Add punctuation to the list of chars to remove
Recreate with StringBuffer? instead of string for memory efficency




*/

public class Disemvoweler{
	private String original = "";
	private String forCons = "";
	private String forVowels = "";
	
	public Disemvoweler(String input){
		this.original = input;
		disemvowel();
	}
	
	//Does the work for the class
	private void disemvowel(){
		for(int i = 0; i < original.length(); i++){
			if( isAVowel(i)){
				this.forVowels += this.original.charAt(i);
			} else if( isASpaceOrPunctuation(i) ){
				//Do Nothing
			} else{//Adds punctuation to the cons string, maybe we fix this later
				this.forCons += this.original.charAt(i);
			}
		}
	}
		
	//Returns true if the character at the index is a vowel	
	private boolean isAVowel(int index){
		char toCheck = this.original.charAt(index);
		//returns true if the character at the index is a vowel
		switch(toCheck) {
			//Lower case vowels
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			//Capital vowels
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				return true;
				
			default:
				return false;
				
		}
		
	}
	//Returns true if the character at the index of the original string is a space
	//Expand to punctuation
	//Use regex to select any non letter character
	private boolean isASpaceOrPunctuation(int index){
		char toCheck = this.original.charAt(index);
		boolean toReturn = false;
		switch(toCheck){
			case ' ':
			case '/':
			case '\\':
			case '.':
			case '!':
			case ',':
			case '>':
			case '<':
			case '?':
			case '"':
			case '\'':
				toReturn = true;
				break;
		}
		
		return toReturn;
	
	}
	
	public String getVowels(){
		return this.forVowels;
	}
	
	public String getConsonants(){
		return this.forCons;
	}
	public String getOriginal(){
		return this.original;
	}
	
	public String toString(){
		return "Original: " + this.getOriginal() +"\n" + "Consonants: " + this.getConsonants() + "\n" +
					"Vowels: " + this.getVowels();
	}
}