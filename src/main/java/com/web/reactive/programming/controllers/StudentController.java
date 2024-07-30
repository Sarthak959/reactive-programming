package com.web.reactive.programming.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.reactive.programming.entities.Student;
import com.web.reactive.programming.services.StudentService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
@Slf4j
public class StudentController {

    private final StudentService service;

    @PostMapping
    public Mono<Student> create(@RequestBody Student student){
        log.debug("Dto Obtained:: {}",student.toString());
        return service.create(student);
    }

    @GetMapping("/{id}")
    public Mono<Student> getStudent(@PathVariable String id){
        log.debug("Dto Obtained:: {}", id);
        return service.getStudent(id);
    }


        
    
}
