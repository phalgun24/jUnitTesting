package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAddNumbers {

	@Test
	public void test() {
		jUnitTesting junit=new jUnitTesting();
		int result=junit.addNumbers(5, 10);
		assertEquals(15,result);
	}

}
