package com.example.demo0401.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String firstName;
    public String lastName;
    public String city;
    public int age;

    @OneToOne(mappedBy = "student")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "faculty")
    private Faculty faculty;

    @ManyToMany
    @JoinTable(name = "student_subjects",
    joinColumns = @JoinColumn(name="student"),
    inverseJoinColumns = @JoinColumn(name="subjects")
    )

    public List<Subject> subjectList;

}
