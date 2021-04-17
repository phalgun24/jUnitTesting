package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAddStrings {

	@Test

	public void test() {
		jUnitTesting j=new jUnitTesting();
		String res=j.addStrings("se", "lab");
		assertEquals("selab",res);
	}


}
