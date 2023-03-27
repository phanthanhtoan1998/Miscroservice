package com.example.repositories;

import com.example.entities.ProductExtraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductExtraRepository extends JpaRepository<ProductExtraEntity,Integer > {
}
