package com.example.actuator.helper;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class mydbheath implements HealthIndicator {
	
	
	public boolean heathchecker()
	{
		return false;
	}

	@Override
	public Health health() {
		// TODO Auto-generated method stub
		
		
		if(heathchecker())
			return Health.up().withDetail("database service", "database service is running").build();
		return Health.down().withDetail("database service", "database service is not running").build();
	}

}
