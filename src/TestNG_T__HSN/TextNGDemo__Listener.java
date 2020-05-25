package TestNG_T__HSN;
import org.testng.annotations.Test;

public class TextNGDemo__Listener {
	

		
		@Test (groups="regression")
		public void methodone() {
			System.out.println("method One");
		}
		
		@Test  (groups="smoke")
		public void methodtwo() {
			System.out.println("method two");
		}
		
		
		@Test (dependsOnMethods="methodtwo", groups="smoke")
		public void methodthree() {
			System.out.println("method Three");
		}
		@Test (groups="regression")
		public void methodfour() {
			System.out.println("method four");
		}
		
		@Test  (groups="smoke")
		public void methodfive() {
			System.out.println("method five");
		}
		
		
		@Test (groups="regression")
		public void methodThree() {
			System.out.println("method Three");
		// method isimlerinin alfabetical sirasina gore print yapiliyor
		// en cok kullanilan annotation @Test
	}
}