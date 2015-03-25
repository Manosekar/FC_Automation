package webdriver_Project1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class test {

	@Before
	public  void beforeTest(){
		System.out.println("before");
	}		
	@Test
		public void testregister1(){
			System.out.println("test1");
	}
	@Test
		public void testsign1(){
		System.out.println("test2");
		
	}
	@Ignore
	   public void testignore(){
		System.out.println("test3");
	}
	@After
	
	  public  void afterTest(){
		System.out.println("after");
		
	}
	
			
		
		
		
		
	

}
