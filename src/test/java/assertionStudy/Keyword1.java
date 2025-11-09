package assertionStudy;

import org.testng.annotations.Test;

public class Keyword1 {
 

		@Test (priority=9)
		public void a()
		{
			System.out.println("method a");
		}
		@Test (priority =-3)
		public void b()
		{
			System.out.println("method b");
		}
  }
