package com.example.studentapp.model;



import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "git_hub")
    private String gitHub;

    @Column(name = "start")
    private String start;

    public StudentModel() {
    }

    public StudentModel(String firstName, String lastName, String gitHub, String start) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gitHub = gitHub;
        this.start = start;
    }
}
