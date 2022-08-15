package awsomecucumber.utils;

import java.util.Properties;

import awsomecucumber.constants.EnvType;

public class ConfigLoader {
	
	private final Properties properties;
	
	private static ConfigLoader configloader;

	private ConfigLoader() {
		String env = System.getProperty("env", String.valueOf(EnvType.STAGE));
		
		switch (EnvType.valueOf(env)) {
		case PROD -> properties = PropertyUtils.propertyLoader("src/test/resources/prod_config.properties");
		case STAGE -> properties = PropertyUtils.propertyLoader("src/test/resources/Stage_config.properties"); 	
			

		default -> throw new IllegalStateException("INVALID ENV" + env);
			
		}
		
	
	}
	
	public static ConfigLoader getInstance() {
		if(configloader == null) {
			configloader = new ConfigLoader();
		}
		return configloader;
	}
	
	public String getBaseUrl() {
		String prop = properties.getProperty("baseUrl");
		if(prop != null) return prop;
		else throw new RuntimeException("property base url is not specified in the config_properties");
		
	}
	
	
	

}
