package com.example.common.DTOs;

import jakarta.persistence.Column;
import lombok.Builder;

@Builder
public class CategoryProductMainDTO {
    private Integer id;
    private String name;
    private String icon;
}
