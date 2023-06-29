package com.example.services;

import com.example.entities.ProductMainEntity;

import java.util.List;

public interface ProductMainService {
    List<ProductMainEntity> getAllProductMain(Integer idCategoryProductMain);
}
