package sf.crom.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import sf.crom.domain.Person;
import sf.crom.jpa.PersonRepository;

@Service
public class PersonService {

	Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonRepository personRepository;

	@Autowired
	CounterService counterService;

	public PersonService() {

	}

	public Person createPerson(Person person) {
		return personRepository.save(person);
	}

	public Person getPerson(Long id) {
		return personRepository.findOne(id);
	}

	public void updatePerson(Person person) {
		personRepository.save(person);
	}

	public void deletePerson(Long id) {
		personRepository.delete(id);
	}

	public Page<Person> getAllPerson(int pageNumber, int size) {
		Pageable pageable = new PageRequest(pageNumber, size);
		if (size > 50) {
			log.info("size is more than 50");
			counterService.increment("More Than 50");
		}
		return personRepository.findAll(pageable);
	}

}
