package com.agile.FirstProject;

import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {

	public void testDoAction() {
		assertNotNull(new HelloWorld().doAction(null, null, null));
	}

}
