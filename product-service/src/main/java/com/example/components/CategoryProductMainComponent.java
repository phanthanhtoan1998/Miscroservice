package com.example.components;

import com.example.common.DTOs.CategoryProductMainDTO;
import com.example.common.VOs.CategoryProductMainVO;
import com.example.entities.CategoryProductMainEntity;
import com.example.entities.Mappers.CategoryProductMainMapper;
import com.example.services.CategoryProductMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryProductMainComponent {
    @Autowired
    private CategoryProductMainService categoryProductMainService;

    public CategoryProductMainDTO addCategoryProductMain(CategoryProductMainVO categoryProductMainVO) {
        CategoryProductMainEntity categoryProductMainEntity = categoryProductMainService.addCategoryProductMain(CategoryProductMainMapper.mapperCategoryProductMainEntity(categoryProductMainVO));

        return CategoryProductMainMapper.mapperCategoryProductMainDTO(categoryProductMainEntity);
    }
}
