package com.springbootweb.springbootweb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Setter
@Getter
public class EmployeeDTO {


    private Long id;

    @Setter
    private String name;

    @Setter
    private String email;


    private Integer age;

    @Setter
    private LocalDate dateOfJoining;
    @JsonProperty("isActive")
    private Boolean isActive;



    public EmployeeDTO(){

    }

    public EmployeeDTO(Long id,String name,String email,Integer age,LocalDate dateOfJoining,Boolean isActive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
        this.isActive =isActive;

    }


}
