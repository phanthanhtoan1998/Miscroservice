package com.example.entities.Mappers;

import com.example.common.DTOs.ProductMainDTO;
import com.example.entities.ProductMainEntity;

import java.util.ArrayList;
import java.util.List;

public class ProductMainMapper {
    public static ProductMainDTO mapperProductMainDTO(ProductMainEntity productMainEntity) {
        return ProductMainDTO.builder()
                .id(productMainEntity.getId())
                .name(productMainEntity.getName())
                .idCategoryProductMain(productMainEntity.getIdCategoryProductMain())
                .description(productMainEntity.getDescription())
                .price(productMainEntity.getPrice())
                .build();
    }

    public static List<ProductMainDTO> mapperProductMainDTOList(List<ProductMainEntity> productMainEntityList) {
        List<ProductMainDTO> productMainDTOList = new ArrayList<>();
        productMainEntityList.forEach(p ->
                productMainDTOList.add(mapperProductMainDTO(p))
        );
        return productMainDTOList;
    }
}
