package io.github.mjedwabn.mpconfig;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Startup
@Singleton
public class Hello {
	@Inject
	@ConfigProperty(name = "helloMessage", defaultValue = "hi")
	String helloMessage;

	@PostConstruct
	public void init() {
		System.out.println("Message: " + helloMessage);
	}
}
