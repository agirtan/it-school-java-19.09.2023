package com.example.demo0401.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Subject {
    @Id
    @GeneratedValue
    private Long id;
    public String description;
    public int credits;
    public int duration;

    @ManyToMany(mappedBy = "subjectList")
    public List<Student> studentList;


}
