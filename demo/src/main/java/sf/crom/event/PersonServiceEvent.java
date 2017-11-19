package sf.crom.event;

import org.springframework.context.ApplicationEvent;

import sf.crom.domain.Person;

public class PersonServiceEvent extends ApplicationEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Person personEvent;
	
	String eventType;

	public Person getPersonEvent() {
		return personEvent;
	}

	public void setPersonEvent(Person personEvent) {
		this.personEvent = personEvent;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public PersonServiceEvent(Object source, Person personEvent, String eventType) {
		super(source);
		this.personEvent = personEvent;
		this.eventType = eventType;
	}

	public PersonServiceEvent(Object source) {
		super(source);
	}
	
	
	
	
}
