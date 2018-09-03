import static org.junit.Assert.assertEquals;

import org.junit.Test;

import StringManipulation.StringManipulationClass;

public class StringManipulationTest {
	
	@Test
	public void test() {
		StringManipulationClass str = new StringManipulationClass("This NETbuilder assessment is way too easy.");
	       str.manipulation();
	       System.out.print(str);
	       
	       //assertEquals("2089191452022191245181191951919135142091923125201515511925", str);
	}

}
