import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import FamilyTask.FamilyModel;
import FamilyTask.Gender;

public class TDD {
	FamilyModel fam;
	
	@Before
	public void setUp() {
		 fam = new FamilyModel();
	}

    @Test
    public void test(){
//    	fam.setParentOf("Vera","George");
//    	fam.isFemale("Vanessa");
//    	fam.isFemale("George");
//    	fam.female("Vanessa");
    	
//    	assertEquals(true, fam.isFemale("Vanessa"));
//    	assertEquals("Vera", fam.getParentOf("George"));
    	fam.setName("George");
    	fam.setGender(Gender.MALE);
    	
    	System.out.println(fam.getGender());
    	assertEquals(Gender.MALE, fam.getGender());
    }
    
    @After
    public void tearDown() {
    	
    }
}
