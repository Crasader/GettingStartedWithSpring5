package sample.spring.chapter06.bankapp.service;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Services {
	@Autowired
	@Qualifier("service")
	private Set<MyService> services;
	
	private static Logger logger = LogManager
			.getLogger(Services.class);
	
	public Services() {
		logger.info("Created Services instance");
	}

	public Set<MyService> getServices() {
		return services;
	}
}
