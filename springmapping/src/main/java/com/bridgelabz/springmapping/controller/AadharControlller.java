package com.bridgelabz.springmapping.controller;

import com.bridgelabz.springmapping.dto.AadharDto;
import com.bridgelabz.springmapping.entity.Aadhar;
import com.bridgelabz.springmapping.service.AadharServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Aadhar")
public class AadharControlller {
    @Autowired
    public AadharServiceImpl aadharServiceimpl;
    @PostMapping("/add")
    public AadharDto addAadhar(@RequestBody AadharDto aadharDto) {
        return aadharServiceimpl.addAadhar(aadharDto);
    }
    @PatchMapping("/{AadharId}/person/{PersonId}")
    public AadharDto addpersontoAdhar(@PathVariable long AadharId, @PathVariable long PersonId) {
        return aadharServiceimpl.addPersonToAadhar(AadharId,PersonId);
    }
    @GetMapping()
    public List<Aadhar> getAdhar(){
        return aadharServiceimpl.getAadhar();
    }
    @GetMapping("/{id}")
    public Aadhar getById(@PathVariable Long id){
        return aadharServiceimpl.getById(id);
    }
    @DeleteMapping ("/{id}")
    public void deleteById(@PathVariable Long id){
        aadharServiceimpl.deleteById(id);
    }
}
