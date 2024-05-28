package dev.sandeep.JpaDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<dev.sandeep.JpaDemo.entity.Brand, Integer> {
}
