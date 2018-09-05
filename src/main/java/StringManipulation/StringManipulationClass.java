package StringManipulation;

import java.util.ArrayList;

public class StringManipulationClass {
	
	public String stringManipulation(String stringValue) {
		char[] convertedCharacters = stringValue.toCharArray();
		ArrayList<String> stringArray = new ArrayList<String>();
		
		for (char loopingThroughTheArray : convertedCharacters) {
            int individualStringValues = (int) loopingThroughTheArray;
            int asciiLowerCaseStartingPoint = 96;
            int asciiUpperCaseStartingPoint = 64;
            int calculatingTheCharLocation = 0;
            
            if (individualStringValues <= 122 & individualStringValues >= 97){
            	calculatingTheCharLocation = individualStringValues - asciiLowerCaseStartingPoint;
            	stringArray.add(String.valueOf(calculatingTheCharLocation));
                
            } 
            else if(individualStringValues <= 90 & individualStringValues >= 65) {
            	calculatingTheCharLocation = individualStringValues - asciiUpperCaseStartingPoint;
            	stringArray.add(String.valueOf(calculatingTheCharLocation));
               
            }
        }
		
		String formattedString = stringArray.toString().replace(",","").replace("[","").replace("]","");
		
		return formattedString;
	}
}
