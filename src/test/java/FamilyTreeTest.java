import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import FamilyTask.Family;

public class FamilyTreeTest {
	Family fam;
	
	@Before
	public void setUp() {
		 fam = new Family();
	}
	
	@Test
	public void checkingGender() {
		
    	fam.setParentOf("Frank", "Morgan");
    	fam.setParentOf("Frank", "Dylan");
    	fam.setParentOf("Joy", "Frank");
    	fam.setParentOf("Jennifer", "Morgan");
    	fam.setParentOf("Morgan", "Frank");
    	
    	fam.male("Dylan");
    	fam.female("Morgan");
    	
    	assertEquals(false, fam.male("Morgan"));
    	assertEquals(true, fam.isFemale("Morgan"));
    	assertEquals(true, fam.female("Morgan"));
    	assertEquals(false, fam.isMale("Morgan"));
    	assertEquals(false, fam.isFemale("Dylan"));
    	assertEquals(true, fam.isMale("Dylan"));
    	
	}

    @Test
    public void checkingChild(){
    	
    	fam.setParentOf("July", "Morgan");
    	fam.setParentOf("Frank", "July");
    	fam.setParentOf("Frank", "Dylan");
    	
    	
    	assertEquals("July", fam.getChildrenOf("Morgan").get(0));
    	assertThat(fam.getChildrenOf("Morgan"), hasItems("July"));
    }
    
    @Test
    public void checkingParent(){
    	
    	fam.setParentOf("July", "Morgan");


    	assertEquals("Morgan", fam.getParentsOf("July").get(0));
    }
    
}
