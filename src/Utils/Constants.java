package Utils;

public class Constants {
    // herhangi bir dosyanin yerini belirtirken get.property metodu 
	//,kullaniyoruz bunun icinde constant class da final locationlarini yaziyoruz
	
	public static final String CHROME_DRIVER_PATH=System.getProperty("user.dir")+"/driver/chromedriver.exe";
	//how we can go to chrome driver path-->driversFolder ---->chrome driver.exe
	
	public static final String GECKO_DRIVER_PATH=System.getProperty("user.dir")+"/driver/geckodriver.exe";
	// how we can go to firefox driver path--> driversFolder -->geckodriver.exe
	
	public static final String CONFIGURATION_FILEPATH=System.getProperty("user.dir")+"/configs/configuration.properties.exe";
	// how we can go to configuration file path--> configsFolder -->geckodriver.exe
	
	public static final int IMPLICIT_WAIT_TIME=15;
	public static final int EXPLICIT_WAIT_TIME=15;
	
}
