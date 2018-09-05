package FamilyTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Family {

	private List<String> females;
	private List<String> males;
	private Map<String, List<String>> childVsParent;
	
	public Family() {
		females = new ArrayList<>();
		males = new ArrayList<>();
		childVsParent = new HashMap<>();
	}

	public boolean male(String name) {

		if (females.contains(name)) {
			return false;
		}

		Set<String> childs = childVsParent.keySet();

		for (String child : childs) {

			List<String> parents = childVsParent.get(child);

			if (parents.contains(name)) {

				for (String parent : parents) {
					if (!parent.equals(name)) {

						return female(parent);
					}
				}
			}

		}

		return males.add(name);
	}

	public boolean female(String name) {
		if (males.contains(name)) {
			return false;
		}
		return females.add(name);
	}

	public boolean isMale(String name) {
		return males.contains(name);
	}

	public boolean isFemale(String name) {
		return females.contains(name);
	}

	public boolean setParentOf(String child, String parent) {

		List<String> allParents = getParentsOf(parent);

		if (allParents != null && allParents.contains(child)) {

			return false;
		}

		List<String> parentSet = childVsParent.get(child);
		if (parentSet == null) {
			parentSet = new ArrayList<>();
			childVsParent.put(child, parentSet);
		}

		return parentSet.add(parent);
	};

	public List<String> getChildrenOf(String parent) {

		List<String> parentsList = new ArrayList<>();

		Set<String> childs = childVsParent.keySet();

		for (String child : childs) {

			List<String> parents = childVsParent.get(child);

			if (parents.contains(parent)) {

				parentsList.add(child);
			}

		}

		return parentsList;
	}

	public List<String> getParentsOf(String child) {
		return childVsParent.get(child);

	}


}

