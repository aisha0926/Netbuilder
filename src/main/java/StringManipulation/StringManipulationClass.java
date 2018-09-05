package StringManipulation;

import java.util.ArrayList;

public class StringManipulationClass {

//	public static void main  (String[] args) {
//		 String stringValue = "This NETBUILDER assessment is way too easy.12312";
//	        char[] convertedCharacters = stringValue.toCharArray();
//	        
//	        for (char loopingThroughTheArray : convertedCharacters) {
//	            int individualStringValues = (int) loopingThroughTheArray;
//	            int asciiLowerCaseStartingPoint = 96;
//	            int asciiUpperCaseStartingPoint = 64;
//	            
//	            
//	            if (individualStringValues <= 122 & individualStringValues >= 97){
//	                System.out.print(" ");
//	                System.out.print(individualStringValues - asciiLowerCaseStartingPoint);
//	            } 
//	            else if(individualStringValues <= 90 & individualStringValues >= 65) {
//	                System.out.print(" ");
//	                System.out.print(individualStringValues - asciiUpperCaseStartingPoint);
//	            }
//	        }
//		}
	
	public ArrayList<String> stringManipulation(String stringValue) {
		char[] convertedCharacters = stringValue.toCharArray();
		ArrayList<Integer> characterList = new ArrayList<Integer>();
		ArrayList<String> array = new ArrayList<String>();
		
		
		for (char loopingThroughTheArray : convertedCharacters) {
            int individualStringValues = (int) loopingThroughTheArray;
            int asciiLowerCaseStartingPoint = 96;
            int asciiUpperCaseStartingPoint = 64;
            int test=0;
            
            if (individualStringValues <= 122 & individualStringValues >= 97){
            	test = individualStringValues - asciiLowerCaseStartingPoint;
            	characterList.add(0, test);
            	//array.add(String.valueOf(test));
            	array.add(String.valueOf(test));
                
            } 
            else if(individualStringValues <= 90 & individualStringValues >= 65) {
            	test = individualStringValues - asciiUpperCaseStartingPoint;
            	characterList.add(0, test);
            	array.add(String.valueOf(test));
               
            }
        }
		
		String formattedString = array.toString().replace(",","").replace("[","").replace("]","");
		
		return array;
	}
}
