package com.example.common.DTOs;

import lombok.Builder;

@Builder
public class ProductMainDTO {
    private Integer id;
    private String name;

    private Integer idCategoryProductMain;

    private String description;

    private Double price;
}
