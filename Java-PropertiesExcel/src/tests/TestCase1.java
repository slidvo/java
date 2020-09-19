package tests;

import java.io.FileInputStream;
import java.util.Properties;

public class TestCase1 {
	private static String localDir = System.getProperty("user.dir");
  private static String propertiesPath = localDir +"/src/config/object.properties";
	public static void main(String[] args) {
		Properties properties = new Properties();
		try {

			FileInputStream fis = new FileInputStream(getPath());
			properties.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.print("Name :"+ properties.getProperty("name"));
		System.out.print(" age:"+ properties.getProperty("age"));
		System.out.print(" course :"+ properties.getProperty("course"));
		System.out.print(" salary:"+ properties.getProperty("salary"));
		System.out.println();
		System.out.println(System.getProperty("user.dir"));
	}
	
	public static String getPath() {
		return  propertiesPath;
	}

}
