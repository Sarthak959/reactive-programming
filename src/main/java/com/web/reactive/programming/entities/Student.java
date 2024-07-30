package com.web.reactive.programming.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
@Table("students")
public class Student {

    @Id
    @Column("id")
    private String id;

    @Column("student_name")
    private String name;

    @Column("total_marks")
    private int marks;
}
