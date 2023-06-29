package com.example.services.serviceImpl;

import com.example.entities.CategoryProductMainEntity;
import com.example.repositories.CategoryProductMainRepository;
import com.example.services.CategoryProductMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryProductMainServiceImpl implements CategoryProductMainService {
    @Autowired
    private CategoryProductMainRepository categoryProductMainRepository;

    @Override
    public CategoryProductMainEntity addCategoryProductMain(CategoryProductMainEntity categoryProductMainEntity) {
        return categoryProductMainRepository.save(categoryProductMainEntity);
    }
}
