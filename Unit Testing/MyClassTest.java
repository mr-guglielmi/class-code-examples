import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class MyClassTest {
	//field for the class being tested
	MyClass c;

   /** Fixture initialization (common initialization for all tests). **/
   @Before public void setUp() {
		c = new MyClass(); //instantiate the class
   }
	
	@Test public void testSum(){
		Assert.assertEquals (c.sum(2, 3), 5); //test the sum function against a known value (2 + 3 = 5)
	}
	
	@Test public void testDivisible(){
		Assert.assertTrue (c.divis(6, 3)); //test the divisible function against a known value
	}
	
	@Test public void testVoid(){
		c.updateField (5);
		Assert.assertEquals (c.getField(), 5); //test the void method by checking the value of the field after calling the void method
	}


}
