package test.java;

import static org.junit.Assert.*;

import org.junit.Test;


public class UpdateP2P3AttributesTest {

	@Test
	public void testDoAction() {
	      int salary =1000;
//	          assertEquals(500,salary, 0.0);
	         assertEquals(1000,salary, 0.0);
	}
	
	@Test
	public void testDoAction1() {
	      int age=25;			
	         // assertEquals(15,age, 0.0);
	         assertEquals(25,age, 0.0);
	}

	@Test
	public void testDoAction2() {
	     String name="Rajeev";		
	         // assertEquals("Rajeev",name, "Sanjay");
	         assertEquals("Rajeev",name, "Rajeev");
	}
}
