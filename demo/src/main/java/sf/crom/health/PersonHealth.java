package sf.crom.health;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class PersonHealth implements HealthIndicator {

	@Autowired
	ServiceProperties serviceprop;
	
	@Override
	public Health health() {

		return Health.up().withDetail("details :", this.serviceprop.getDescription()+" "+this.serviceprop.getName()).status("okay").build();
	}

}
