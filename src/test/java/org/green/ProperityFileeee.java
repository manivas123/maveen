package org.green;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ProperityFileeee {
	
public static void main(String[] args) throws FileNotFoundException, IOException {
    String path =System.getProperty("user.dir");
	Properties propert=new Properties();
//	propert.load(new FileInputStream("C:\\Users\\SCLPT 059\\eclipse-workspace\\Mavennn\\confi.properties"));
	propert.load(new FileInputStream("confi.properties"));
	Object  object=propert.get("browser");
	String value=(String)object;
	System.out.println(value);
	
}
}