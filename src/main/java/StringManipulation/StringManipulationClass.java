package StringManipulation;

public class StringManipulationClass {

	public static void main  (String[] args) {
		 String stringValue = "This NETBUILDER assessment is way too easy.12312";
	        char[] convertedCharacters = stringValue.toCharArray();
	        
	        for (char loopingThroughTheArray : convertedCharacters) {
	            int individualStringValues = (int) loopingThroughTheArray;
	            int asciiLowerCaseStartingPoint = 96;
	            int asciiUpperCaseStartingPoint = 64;
	            
	            
	            if (individualStringValues <= 122 & individualStringValues >= 97){
	                System.out.print(" ");
	                System.out.print(individualStringValues - asciiLowerCaseStartingPoint);
	            } 
	            else if(individualStringValues <= 90 & individualStringValues >= 65) {
	                System.out.print(" ");
	                System.out.print(individualStringValues - asciiUpperCaseStartingPoint);
	            }
	        }
	}
}
