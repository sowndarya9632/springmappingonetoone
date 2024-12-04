package com.bridgelabz.springmapping.repository;

import com.bridgelabz.springmapping.entity.Aadhar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdharRepository  extends CrudRepository<Aadhar,Long> {
}
