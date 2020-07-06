package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {
	
	
	@AfterTest
	public void LastExecution()
	{
		System.out.println("I will execute last");
	}

	@Test
	public void Demo() {
		System.out.println("hello");
		System.out.println("pavan");
		System.out.println("bye!");
		System.out.println("hello");
		System.out.println("kumar");
		System.out.println("bye!");
		
	}
	
	@Test
	public void SecondTest()
	{ 	
		System.out.println("bye");
	}
	
	@BeforeTest
	public void Prequest()
	{
		System.out.println("I will execute first");
	}
	

}
