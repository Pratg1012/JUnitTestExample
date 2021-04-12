package JUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		jUnitTesting junitString = new jUnitTesting();
		String result = junitString.addStrings("Capstone", "Project");
		assertEquals("CapstoneProject",result);
		
	}

}
