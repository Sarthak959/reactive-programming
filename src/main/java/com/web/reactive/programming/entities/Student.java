package com.web.reactive.programming.entities;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@Table("students")
@Data
@NoArgsConstructor
public class Student {

    @Id
    @Column("id")
    private String id;

    @Column("student_name")
    private String name;

    @Column("total_marks")
    private int marks;

    // public Student() {
    //     this.id = UUID.randomUUID().toString();
    // }
}
