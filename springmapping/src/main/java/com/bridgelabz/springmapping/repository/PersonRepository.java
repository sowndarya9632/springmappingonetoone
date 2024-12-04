package com.bridgelabz.springmapping.repository;

import com.bridgelabz.springmapping.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person,Long> {
}
