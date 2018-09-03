package FamilyTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FamilyModel {
	
	private String name;
	private Gender gender;
	private ArrayList<FamilyModel> parents;
	private String parentName;
	private String childName;

	Map<String, FamilyModel> parentMap;
	
	public FamilyModel() {
		parentMap = new HashMap<String, FamilyModel>();
	}
	
	public FamilyModel(String name) {
		this.name = name;
	}
	
	public void addParent(FamilyModel parent) {
		this.parents.add(parent);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public ArrayList<FamilyModel> getParents() {
		return parents;
	}
	public void setParents(ArrayList<FamilyModel> parents) {
		this.parents = parents;
	}
	public String getParent() {
		return parentName;
	}
	
	public String getChild() {
		return childName;
	}
	public void setChild(String childName) {
		this.childName = childName;
	}
	
}
