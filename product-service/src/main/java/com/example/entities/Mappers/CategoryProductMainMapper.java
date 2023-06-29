package com.example.entities.Mappers;

import com.example.common.DTOs.CategoryProductMainDTO;
import com.example.common.VOs.CategoryProductMainVO;
import com.example.entities.CategoryProductMainEntity;

public class CategoryProductMainMapper {
    public static CategoryProductMainEntity mapperCategoryProductMainEntity(CategoryProductMainVO categoryProductMainVO) {
        return CategoryProductMainEntity.builder()
                .id(categoryProductMainVO.getId())
                .name(categoryProductMainVO.getName())
                .icon(categoryProductMainVO.getIcon())
                .build();
    }

    public static CategoryProductMainDTO mapperCategoryProductMainDTO(CategoryProductMainEntity categoryProductMainEntity) {
        return CategoryProductMainDTO.builder()
                .id(categoryProductMainEntity.getId())
                .name(categoryProductMainEntity.getName())
                .icon(categoryProductMainEntity.getIcon())
                .build();
    }
}
