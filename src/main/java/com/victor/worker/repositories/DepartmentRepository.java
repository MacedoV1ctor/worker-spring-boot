package com.victor.worker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor.worker.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
