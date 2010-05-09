package de.hsm.oot.werwars;

import java.io.FileNotFoundException;
import java.util.Properties;

public class Utilities {
	public static Properties loadProperties(String file) throws FileNotFoundException {
		StringBuilder path = new StringBuilder();
		if(!file.startsWith("/")) path.insert(0,'/');
		if(!file.startsWith("/resources/"))
			path.insert(1,"resources/werwars/properties/");
		path.append(file);
		if(!file.endsWith(".properties"))
			path.append(".properties");
		try {
			Properties properties = new Properties();
			properties.load(Utilities.class.getResource(path.toString()).openStream());
			return properties;
		} catch(Exception e) {
			e.printStackTrace();
			throw new FileNotFoundException(new StringBuilder("Properties file ").append(path).append(" was not found.").toString());
		}
	}
}
