package com.matriculasapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "semesters")
@Data
public class Semesters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String description;

}
