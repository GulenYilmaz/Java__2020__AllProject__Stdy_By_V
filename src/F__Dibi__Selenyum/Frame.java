package F__Dibi__Selenyum;

public class Frame {

		/* What is iFrame --> Inline Frame --> Frame indside a frame --> HTML document embedded inside the cureent HTML
		 * document on a website?
		 * Why is it used	--> For better visibility
		 * 					--> To insert content from another source (advertisement etc.)
		 * 					--> ability to change an iFrame's content without making them reload the complete website.
		 *
		 * How to handle	--> driver.switchTo()
		 * How to identify	--> right click on page --> Check this frame option is available or not
		 * 					--> view page source   --> check any tag is available for 'iFrame'
		 *
		 * How to switchTo frame (name/id)	--> driver.switchTo().frame(String name/id);
		 * 									--> driver.quit();
		 * 									--> Throws: NoSuchFrameException
		 *
		 * 					(WebElement)	--> driver.switchTo().frame(iframeElement);
		 * 									-->	driver.quit();
		 * 									--> Throws: NoSuchFrameException
		 *
		 * 					(index)			--> Syntax - driver.switchTo().frame(int arg0);
											--> driver.switchTo().frame(0);
											--> driver.quit();
											
											--> If there are more than one frame and we want to jump from one iFrame to another iFrame
											we need to switchTo parent frame
											
											--> switchTo().defaultContent()
		 */
		
		
	

}
