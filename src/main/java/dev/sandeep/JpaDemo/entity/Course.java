package dev.sandeep.JpaDemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Course extends BaseModel{
    private String courseName;
    @ManyToMany
    private List<Person> people;
}
