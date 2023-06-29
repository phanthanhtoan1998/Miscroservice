package com.example.services.serviceImpl;


import com.example.entities.ProductMainEntity;
import com.example.repositories.ProductMainRepository;
import com.example.services.ProductMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductMainServiceImpl implements ProductMainService {
    @Autowired
    private ProductMainRepository productMainRepository;
    @Override
    public List<ProductMainEntity> getAllProductMain(Integer idCategoryProductMain){
        return productMainRepository.findAllByIdCategoryProductMain(idCategoryProductMain);
    }
}
