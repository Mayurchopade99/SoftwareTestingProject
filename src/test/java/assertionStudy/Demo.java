package assertionStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	  
	  
	  
	String actual ="test";
	String expected = "test1";
	
	
//	if(actual.equals(expected))
//	{
//		System.out.println("TC Passed");
//	}
//	else {
//		System.out.println("TC Failed");
//	}
	Assert.assertEquals(actual,expected);
	  
	  
	  
	   
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
