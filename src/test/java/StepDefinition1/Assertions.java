package StepDefinition1;

import org.testng.annotations.Test;

import junit.framework.Assert;


public class Assertions {
	 @Test 
	public void Assertion() {
		String expected = "200";
		String actual= "200";
		// Assert.assertTrue(true);
		// Assert.assertTrue(false);
		// Assert.assertEquals(200, 200);
		 Assert.assertEquals(expected, actual);
		 
	}
	 

}
