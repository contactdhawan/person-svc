package sf.crom.jpa;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import sf.crom.domain.Person;

public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
	
	List<Person> getByLastName(String lastName);
	
	List<Person> getByFirstName(String firstName);
	
	Page<Person> findAll(Pageable pageable);

}
