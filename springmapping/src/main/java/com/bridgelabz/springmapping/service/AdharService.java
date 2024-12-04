package com.bridgelabz.springmapping.service;

import com.bridgelabz.springmapping.dto.AadharDto;
import com.bridgelabz.springmapping.entity.Aadhar;

import java.util.List;

public interface AdharService {
    AadharDto addAadhar (AadharDto aadharDto);
    List<Aadhar> getAadhar();
    Aadhar getById(Long id);
    void deleteById(Long id);
}
