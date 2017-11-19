package sf.crom.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class PersonServiceEventListner implements ApplicationListener<PersonServiceEvent> {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void onApplicationEvent(PersonServiceEvent event) {
		logger.info("Person created :" + event.getEventType() + " with " + event.getPersonEvent());

	}

}
