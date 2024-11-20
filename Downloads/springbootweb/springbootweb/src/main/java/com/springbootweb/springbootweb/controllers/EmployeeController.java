package com.springbootweb.springbootweb.controllers;


import com.springbootweb.springbootweb.dto.EmployeeDTO;
import com.springbootweb.springbootweb.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "employee")
public class EmployeeController {

//    @GetMapping(path = "/getSuper")
//    public String getSuper(){
//        return "here is message";
//    }

  private final EmployeeRepository employeeRepository;

  public EmployeeController(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

  @GetMapping("/{employeeID}")
    public EmployeeDTO getEmployeeById(@PathVariable  Long employeeID){
   return new EmployeeDTO(employeeID,"ass","@gmail", 27, LocalDate.of(2020,2,10),true);
  }

    public String getAllEmployee(@RequestParam(required = false,name ="inputAge") Integer  age,
                                 @RequestParam(required = false) String name){
      return "hii age" + age + name;
  }

  @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee){
      inputEmployee.setId(100l);
      return inputEmployee;
  }

}
