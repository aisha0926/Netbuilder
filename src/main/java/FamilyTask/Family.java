package FamilyTask;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Family {
	
	private Set<String> females;
	private Set<String> males;
	private Map<String, Set<String>> childVsParent;
	

	public Family() {
		females = new HashSet<String>();
		males = new HashSet<>();
		childVsParent = new HashMap<>();
	}

	public boolean male(String name) {

		if (females.contains(name)) {
			return false;
		}

		Set<Entry<String, Set<String>>> entries = childVsParent.entrySet();

		for (Entry<String, Set<String>> entry : entries) {

			Set<String> parents = entry.getValue();

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

		Set<String> allParents = getParentsOf(parent);

		if (allParents != null && allParents.contains(child)) {

			return false;
		}

		Set<String> parentSet = childVsParent.get(child);
		if (parentSet == null) {
			parentSet = new HashSet<>();
			childVsParent.put(child, parentSet);
		}

		return parentSet.add(parent);
	};

	public Set<String> getChildrenOf(String parent) {

		Set<String> parentsSet = new HashSet<>();

		Set<Entry<String, Set<String>>> entries = childVsParent.entrySet();

		for (Entry<String, Set<String>> entry : entries) {

			Set<String> parents = entry.getValue();

			if (parents.contains(parent)) {

				parentsSet.add(entry.getKey());
			}

		}
		return parentsSet;
	}

	public Set<String> getParentsOf(String child) {
		return childVsParent.get(child);

	}

}

