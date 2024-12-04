package com.bridgelabz.springmapping.entity;

import com.bridgelabz.springmapping.dto.AadharDto;
import com.bridgelabz.springmapping.dto.PersonDto;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "aadhar")
public class Aadhar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String aadharNumber;
    private String address;
    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;
    public Aadhar(AadharDto aadharDto){
        this.aadharNumber=aadharDto.getAadharNumber();
        this.address=aadharDto.getAddress();
        this.person=aadharDto.getPerson();
    }
}

