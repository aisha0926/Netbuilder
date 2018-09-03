import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import FamilyTask.Family;

public class TDD {
	Family fam;
	
	@Before
	public void setUp() {
		 fam = new Family();
	}

    @Test
    public void test(){
    	fam.setParentOf("Vera","George");
    	fam.isFemale("Vanessa");
    	fam.isFemale("George");
    	fam.female("Vanessa");
    	
    	assertEquals(true, fam.isFemale("Vanessa"));
    	assertEquals("Vera", fam.getParentOf("George"));
    	
    }
    
    @After
    public void tearDown() {
    	
    }
}
