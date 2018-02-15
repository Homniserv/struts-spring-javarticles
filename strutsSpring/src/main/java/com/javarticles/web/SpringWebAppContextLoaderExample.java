package com.javarticles.web;

/**http://logging.apache.org/log4j/2.x/manual/migration.html*/
//import org.apache.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import org.apache.log4j.Logger;
/**
 * http://www.javarticles.com/2015/04/spring-web-application-context-example.html
 */
public class SpringWebAppContextLoaderExample {
	public String toString() {
		LOGGER.info("SpringWebAppContextLoaderExample is called");
		return "This is Spring Webapplication Context Loader Example";
	}

	// private Logger LOGGER =
	// Logger.getLogger(SpringWebAppContextLoaderExample.class);
	private Logger LOGGER = org.apache.logging.log4j.LogManager.getLogger(SpringWebAppContextLoaderExample.class);

}