package com.springbootweb.springbootweb.repositories;

import com.springbootweb.springbootweb.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public  interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
}
