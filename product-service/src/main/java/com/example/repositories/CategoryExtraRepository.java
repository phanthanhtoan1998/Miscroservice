package com.example.repositories;

import com.example.entities.CategoryProductExtraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryExtraRepository extends JpaRepository<CategoryProductExtraEntity,Integer> {
}
