package com.heroku.workshop;

import com.heroku.workshop.Account ;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface AccountRepository extends CrudRepository<Account, Long> {
		Account findBySfid(String sfid);
}