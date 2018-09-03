package FamilyTask;

import java.util.HashMap;
import java.util.Map;

public class Family {
	Map<String, FamilyModel> family;
	
	public Family() {
		family = new HashMap<String, FamilyModel>();
	}

	public void creatingFamily(){
		FamilyModel newFamily = new FamilyModel("");
	//	newFamily.addParent();
	}
	
	public boolean male(String name) {
		
		return false;
	}
	
	public boolean female(String name) {
		return false;
	}
	
	public boolean isMale(String name) {
		return false;
	}
	
	public boolean isFemale(String name) {
		return false;
	}
	
	public void setParentOf(String childName, String parentName) {
		
	}
	
	public String getParentOf(String parentName) {
		return parentName;
	}
	

}
