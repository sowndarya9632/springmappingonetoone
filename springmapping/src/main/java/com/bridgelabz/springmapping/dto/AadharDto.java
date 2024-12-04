package com.bridgelabz.springmapping.dto;

import com.bridgelabz.springmapping.entity.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AadharDto {
    private Long id;
    private String aadharNumber;
    private String address;
    private Person person;
}
