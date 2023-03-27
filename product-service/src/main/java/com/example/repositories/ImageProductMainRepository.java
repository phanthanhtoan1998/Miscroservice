package com.example.repositories;

import com.example.entities.ImageProductMainEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageProductMainRepository extends JpaRepository<ImageProductMainEntity,Integer> {
}
