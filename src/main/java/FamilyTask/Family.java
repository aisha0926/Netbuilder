package FamilyTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Family {

	private List<String> females;
	private List<String> males;
	private Map<String, List<String>> childParentMap;
	
	public Family() {
		females = new ArrayList<>();
		males = new ArrayList<>();
		childParentMap = new HashMap<>();
	}

	public boolean male(String name) {

		if (females.contains(name)) {
			return false;
		}

		Set<String> childs = childParentMap.keySet();

		for (String child : childs) {

			List<String> parents = childParentMap.get(child);

			if (parents.contains(name)) {

				for (String parent : parents) {
					if (!parent.equals(name)) {

						return females.add(parent);
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

		Set<String> childs = childParentMap.keySet();

		for (String childLoop : childs) {

			List<String> parents = childParentMap.get(childLoop);

			if (parents.contains(name)) {

				for (String parent : parents) {
					if (!parent.equals(name)) {

						return males.add(parent);
					}
				}
			}

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

		List<String> grandParents = getParentsOf(parent);

		if (grandParents != null && grandParents.contains(child)) {

			return false;
		}

		List<String> parents = childParentMap.get(child);

		if (parents == null) {

			parents = new ArrayList<>();
			childParentMap.put(child, parents);
		}

		return parents.add(parent);
	};

	public List<String> getChildrenOf(String parent) {

		List<String> children = new ArrayList<>();

		Set<String> childs = childParentMap.keySet();

		for (String child : childs) {

			List<String> parents = childParentMap.get(child);

			if (parents.contains(parent)) {

				children.add(child);
			}

		}
		return children;
	}

	public List<String> getParentsOf(String child) {
		return childParentMap.get(child);

	}


}

