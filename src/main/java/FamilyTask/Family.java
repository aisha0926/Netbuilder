package FamilyTask;

public class Family {

	private boolean male;
	private boolean female;
	private boolean parentOf;
	private String[] parents;
	private String[] children;
	
	public boolean male(String name) {
		return false;
	}
	
	public boolean female() {
		return false;
	}
	
	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public boolean isFemale() {
		return female;
	}

	public void setFemale(boolean female) {
		this.female = female;
	}

	public boolean isParentOf() {
		return parentOf;
	}

	public void setParentOf(boolean parentOf) {
		this.parentOf = parentOf;
	}

	public String[] getParents() {
		return parents;
	}

	public String[] getChildren() {
		return children;
	}
	
	
	
	
}
