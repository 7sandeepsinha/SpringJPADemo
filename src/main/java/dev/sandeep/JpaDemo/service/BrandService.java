package dev.sandeep.JpaDemo.service;

import dev.sandeep.JpaDemo.entity.Brand;
import dev.sandeep.JpaDemo.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BrandService {
    @Autowired
    private BrandRepository brandRepository;

    public void getBrand(){
        Optional<Brand> brand = brandRepository.findById(1);
//        if(brand != null){
//            System.out.println(brand.getBrandName());
//            System.out.println(brand.getModels());
//        }
    }
}
