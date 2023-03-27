package com.example.repositories;

import com.example.entities.ProductMainEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMainRepository extends JpaRepository<ProductMainEntity,Integer> {
}
