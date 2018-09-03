import org.junit.Test;

public class TDD {

    @Test
    public void test(){
    	Family fam = new Family();
    	fam.setParentOf("Vera","George");
    	fam.isFemale("Vanessa");
    	fam.female("Vanessa");
    	const fam = new Family();
    }
}
