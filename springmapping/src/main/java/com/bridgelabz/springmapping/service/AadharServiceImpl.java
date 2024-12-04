package com.bridgelabz.springmapping.service;

import com.bridgelabz.springmapping.dto.AadharDto;
import com.bridgelabz.springmapping.entity.Aadhar;
import com.bridgelabz.springmapping.entity.Person;
import org.springframework.stereotype.*;
import com.bridgelabz.springmapping.repository.AdharRepository;
import com.bridgelabz.springmapping.repository.PersonRepository;

import java.util.List;


@Service
public class AadharServiceImpl implements AdharService {
    public PersonRepository personRepository;
    public AdharRepository aadharRepository;

    public AadharServiceImpl( PersonRepository personRepository, AdharRepository aadharRepository) {
        this.personRepository = personRepository;
        this.aadharRepository = aadharRepository;
    }

    @Override
    public AadharDto addAadhar(AadharDto aadharDto) {
        Aadhar aadhar=new Aadhar(aadharDto);
        aadhar=aadharRepository.save(aadhar);
        return mapToDTO(aadhar);
    }

    public AadharDto addPersonToAadhar(Long PersonId, long AadharId) {
        Aadhar aadhar = aadharRepository.findById(AadharId)
        .orElseThrow(()->new RuntimeException("course id not found"));
        Person person = personRepository.findById(PersonId)
                .orElseThrow(()->new RuntimeException("student id not found"));
        aadhar.setPerson(person);
        aadhar= aadharRepository.save(aadhar);
        return mapToDTO(aadhar);
    }

    @Override
    public List<Aadhar> getAadhar() {
        return (List<Aadhar>) aadharRepository.findAll();
    }
    public Aadhar getById(Long id){
        return aadharRepository.findById(id).orElse(null);
    }
    public void deleteById(Long id) {
        aadharRepository.deleteById(id);
    }

        public AadharDto mapToDTO(Aadhar aadhar) {
        AadharDto adharDto=new AadharDto();
            adharDto.setId(aadhar.getId());
            adharDto.setAadharNumber(aadhar.getAadharNumber());;
            adharDto.setAddress(aadhar.getAddress());
            adharDto.setPerson(aadhar.getPerson());
           return adharDto;
    }

}


