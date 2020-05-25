package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {// this class will read our all properties file what is inside the file 

	/**
	 * this method will just read the properties  file
	 * and load the file
	 * we use try and catch in our exceptions
	 * the goal of this methods is reading the file
	 * @param filePath
	 */
	public static Properties prop;
	public static void readProperties(String filePath) {
		try {
			FileInputStream fis=new FileInputStream( filePath);
			prop=new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	/**
	 * this method will be return value of specified the key
	 * @param  String key
	 * @return String value
	 */
	 
	 public static String getProperty(String key) {//how do we get the value of key, which method?
		 
	 return prop.getProperty(key);
	 }
	 

	
	
	
}
