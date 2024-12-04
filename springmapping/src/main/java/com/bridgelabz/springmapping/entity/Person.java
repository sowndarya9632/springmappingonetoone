package com.bridgelabz.springmapping.entity;

import com.bridgelabz.springmapping.dto.PersonDto;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private int age;
    private LocalDate dateOfBirth;

    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
    // @JoinColumn(name = "aadhar_id")
    private Aadhar aadhar;

    public Person(PersonDto RequestDto) {
        this.firstName = RequestDto.getFirstname();
        this.lastName =RequestDto.getLastName();
        this.age = RequestDto.getAge();
        this.dateOfBirth = LocalDate.now(); // Can be set from a different source
        this.aadhar = RequestDto.getAadhar();
    }



}
