package com.example.components;

import com.example.common.DTOs.ProductMainDTO;
import com.example.commonservice.exceptions.BadRequestException;
import com.example.entities.Mappers.ProductMainMapper;
import com.example.entities.ProductMainEntity;
import com.example.services.ProductMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.example.common.contants.ProductMainContant.NO_PRODUCT_EXIST;

@Component
public class ProductMainComponent {
    @Autowired
    private ProductMainService productMainService;

    public List<ProductMainDTO> getAllProductMain(Integer idCategoryProductMain) {
        List<ProductMainEntity> productMainEntityList = productMainService.getAllProductMain(idCategoryProductMain);
        if (productMainEntityList.isEmpty()) {
             throw new BadRequestException(NO_PRODUCT_EXIST);
        }
        return ProductMainMapper.mapperProductMainDTOList(productMainEntityList);
    }
}
