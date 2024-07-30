package com.web.reactive.programming.services;

import org.springframework.stereotype.Service;

import com.web.reactive.programming.entities.Student;
import com.web.reactive.programming.repositories.StudentRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public Mono<Student> create(Student student){
        return repository.save(student);
    }

    public Mono<Student> getStudent(String id){
        return repository.findById(id);
    }
    

}
