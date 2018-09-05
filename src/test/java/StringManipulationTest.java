import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import StringManipulation.StringManipulationClass;

public class StringManipulationTest {
	
	@Test
	public void test() {
		
		StringManipulationClass str = new StringManipulationClass();
		
		
		ArrayList<String> list = str.stringManipulation("This NETbuilder assessment is way too easy.");
		System.out.println(list);
		
//		Object a = new Object();
//		a = str.stringManipulation("This NETbuilder assessment is way too easy.");
//	    System.out.println(a);
	    assertEquals("20 8 9 19 14 5 20 2 21 9 12 4 5 18 1 19 19 5 19 19 13 5 14 20 9 19 23 1 25 20 15 15 5 1 19 25",list.toString());
	}

}
