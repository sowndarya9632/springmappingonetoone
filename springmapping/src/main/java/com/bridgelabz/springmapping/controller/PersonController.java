package com.bridgelabz.springmapping.controller;

import com.bridgelabz.springmapping.dto.PersonDto;
import com.bridgelabz.springmapping.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    public PersonServiceImpl personServiceimpl;
    @PostMapping("/add")
    public PersonDto addPerson(@RequestBody PersonDto requestDto){

        return  personServiceimpl.addPerson(requestDto);
    }
}
