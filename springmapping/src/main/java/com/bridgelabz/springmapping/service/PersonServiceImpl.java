package com.bridgelabz.springmapping.service;

import com.bridgelabz.springmapping.dto.PersonDto;
import com.bridgelabz.springmapping.entity.Person;
import com.bridgelabz.springmapping.repository.AdharRepository;
import com.bridgelabz.springmapping.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService{
    public PersonRepository personRepository;
    public AdharRepository aadharRepository;

    public PersonServiceImpl( PersonRepository personRepository, AdharRepository aadharRepository) {
        this.personRepository = personRepository;
        this.aadharRepository = aadharRepository;
    }
    @Override
    public PersonDto addPerson(PersonDto requestDto) {
        Person person=new Person(requestDto);
        person = personRepository.save(person);
        return mapToDto(person);
    }

    private PersonDto mapToDto(Person person) {
        PersonDto requestDto=new PersonDto();
        requestDto.setFirstname(person.getFirstName());
        requestDto.setLastName(person.getLastName());
        requestDto.setAge(person.getAge());
        requestDto.setAadhar(person.getAadhar());
        return requestDto;
    }
}
