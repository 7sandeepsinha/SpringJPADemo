package dev.sandeep.JpaDemo.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class CarModel extends BaseModel{
    private String modelName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id")
    private Brand brand;
}
