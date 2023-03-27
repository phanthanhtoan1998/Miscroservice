package com.example.repositories;

import com.example.entities.CategoryProductMainEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryProductMainRepository extends JpaRepository<CategoryProductMainEntity,Integer> {
}
