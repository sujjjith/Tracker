package com.tsrtc.tracker;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileLocDetPropUtil {
	private static Properties prop = new Properties();
    
	public static void load(){
		InputStream input = null;
		try {
		input = FileLocDetPropUtil.class.getClassLoader().getResourceAsStream("filesLocationDetails.properties");
		// load a properties file
		prop.load(input);
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static String getValue(String key){
		return prop.getProperty(key);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileLocDetPropUtil.load();
			// get the property value and print it out
			System.out.println(FileLocDetPropUtil.getValue("INPUTLOCATION"));
			System.out.println(FileLocDetPropUtil.getValue("INBOX"));
			System.out.println(FileLocDetPropUtil.getValue("ARCHIVE"));
			System.out.println(FileLocDetPropUtil.getValue("FAILED"));
	}

}
