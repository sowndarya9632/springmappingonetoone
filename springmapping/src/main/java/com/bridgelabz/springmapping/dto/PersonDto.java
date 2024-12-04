package com.bridgelabz.springmapping.dto;


import com.bridgelabz.springmapping.entity.Aadhar;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto {
    private Long id;
    private String firstname;
    private String lastName;
    private int age;
    public Aadhar aadhar;
}
