package dev.sandeep.JpaDemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class TeamDetails extends BaseModel{
    private String teamDetails;
    @OneToOne
    @JoinColumn(name = "team_Id") // just like giving a random column name
    private Team team;
}
