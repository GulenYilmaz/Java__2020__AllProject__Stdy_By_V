package B__Atgldyv;

public class TestNG__Recap__03__xmlFile {
/*
 * <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite"> <!-- xml file is used for configuration purpose -->
 <!-- 1st way -->
	<!-- <test name="Test class01"> <classes> <class name="com.class01.TaskTwo" 
		/> <class name="com.class01.TestNGDemo" /> <class name="com.class01.DifferentAnnotations" 
		/> </classes> </test> -->
	<!-- 2nd way -->
	<test name="Test class01">
		<packages>
			<package name="com.class01" />
		</packages>
		<classes>
			<class name="com.class01.TitleLogoAndLoginValidation"> <!-- we have to specify class name with pacakge -->
				<methods>
					<exclude name="logoValidation"/><!-- We only can exclude methods not classes -->
				</methods>
			</class>
		</classes>
	</test>
</suite> <!-- Suite -->
 */
}
