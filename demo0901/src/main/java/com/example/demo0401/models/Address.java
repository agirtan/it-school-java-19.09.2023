package com.example.demo0401.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Data
@Entity
public class Address{
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate issuedAt;
    private LocalDate expiresAt;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;
}
