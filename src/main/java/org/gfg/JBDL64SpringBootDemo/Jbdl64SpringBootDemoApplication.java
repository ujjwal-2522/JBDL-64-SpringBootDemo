package org.gfg.JBDL64SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jbdl64SpringBootDemoApplication {
//it will start the application and deploy into the server.if we have tomcat(not exclusion) or we can change it to jetty
//in pom.xml file
	public static void main(String[] args) {
		SpringApplication.run(Jbdl64SpringBootDemoApplication.class, args);
	}

}
