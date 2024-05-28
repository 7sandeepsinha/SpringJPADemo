package dev.sandeep.JpaDemo.repository;

import dev.sandeep.JpaDemo.entity.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarModelRepository  extends JpaRepository<CarModel, Integer> {
}
