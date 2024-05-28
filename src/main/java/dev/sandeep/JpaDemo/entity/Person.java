package dev.sandeep.JpaDemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Person extends BaseModel{
    private String personName;
    @ManyToMany(mappedBy = "people")
    private List<Course> courses;
}