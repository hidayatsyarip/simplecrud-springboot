package com.cefercode.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cefercode.entity.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
