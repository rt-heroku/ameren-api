package com.heroku.workshop; 
import com.heroku.workshop.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface PersonRepository extends CrudRepository<Person, Long> {
}