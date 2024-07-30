package com.web.reactive.programming.repositories;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.web.reactive.programming.entities.Student;

public interface StudentRepository extends ReactiveCrudRepository<Student, String>{

}
