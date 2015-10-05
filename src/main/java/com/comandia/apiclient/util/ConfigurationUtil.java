package com.comandia.apiclient.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;

import com.comandia.apiclient.model.Configuration;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConfigurationUtil {
	
	public static Configuration configuration = null;
	
	private static final String CONFIG_FILENAME = "config.json";
	
	public static void load() {
		
		ObjectMapper om = new ObjectMapper();
		FileInputStream fis = null;
		try {
			 fis = new FileInputStream(new File(ConfigurationUtil.class.getClassLoader().getResource(CONFIG_FILENAME).toURI()));
			 
			 try {
				configuration = om.readValue(fis, Configuration.class);
				if(configuration==null) {
					throw new IOException("Couldn't load" + CONFIG_FILENAME);
				}
			} catch (IOException e) {
				System.err.println("Couldn't load " + CONFIG_FILENAME);
				e.printStackTrace();
			} 
		} catch (FileNotFoundException | URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		

		
		
		
	}

}
