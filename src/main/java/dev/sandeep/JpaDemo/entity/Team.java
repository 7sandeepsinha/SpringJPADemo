package dev.sandeep.JpaDemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Team extends BaseModel{
    private String teamName;
    @OneToOne(mappedBy = "team")
    private TeamDetails teamDetails;
}
