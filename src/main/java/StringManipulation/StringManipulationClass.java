package StringManipulation;

public class StringManipulationClass {
	private String stringVal;
	
	public StringManipulationClass() {
		
	}
	
	public StringManipulationClass(String stringValue) {
		this.stringVal = stringValue;
	}

	public int manipulation() {		 	
	        char[] convertedCharacters = stringVal.toCharArray();
	        
	        for (char loopingThroughTheArray : convertedCharacters) {
	            int individualStringValues = (int) loopingThroughTheArray;
	            int asciiLowerCaseStartingPoint = 96;
	            int asciiUpperCaseStartingPoint = 64;

	            if (individualStringValues <= 122 & individualStringValues >= 97){
//	                System.out.print(" ");
	                System.out.print(individualStringValues - asciiLowerCaseStartingPoint);
	            	return individualStringValues - asciiLowerCaseStartingPoint;
	            } 
	            else if(individualStringValues <= 90 & individualStringValues >= 65) {
//	                System.out.print(" ");
	                System.out.print(individualStringValues - asciiUpperCaseStartingPoint);
	            	return individualStringValues - asciiUpperCaseStartingPoint;
	            } else {
	            	return 0;
	            }
	        }
	        return 0;
	}
}
