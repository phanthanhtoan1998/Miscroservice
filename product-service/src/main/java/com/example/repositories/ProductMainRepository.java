package com.example.repositories;

import com.example.entities.ProductMainEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMainRepository extends JpaRepository<ProductMainEntity,Integer> {
    List<ProductMainEntity> findAllByIdCategoryProductMain(Integer idCategoryProductMain);
}
