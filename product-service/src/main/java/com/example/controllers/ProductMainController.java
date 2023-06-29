package com.example.controllers;

import com.example.common.DTOs.ProductMainDTO;
import com.example.components.ProductMainComponent;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@Validated
public class ProductMainController {
    @Autowired
    private ProductMainComponent productMainComponent;
    @GetMapping("/products/{idCategoryProductMain}")
    public List<ProductMainDTO> getAllProductMain(@PathVariable   Integer idCategoryProductMain) {

      return   productMainComponent.getAllProductMain(idCategoryProductMain);
    }

}
