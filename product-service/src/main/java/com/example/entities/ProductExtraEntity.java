package com.example.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

import static com.example.commonservice.contants.TimeContant.CREATE_AT_TIME;
import static com.example.commonservice.contants.TimeContant.UPDATE_AT_TIME;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_extra")
public class ProductExtraEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Integer price;

    @Column(name = "image_link")
    private String imageLink;

    @CreationTimestamp
    @DateTimeFormat(pattern = CREATE_AT_TIME)
    @Column(name = "create_at_time")
    private Date createAtTime;

    @UpdateTimestamp
    @DateTimeFormat(pattern = UPDATE_AT_TIME)
    @Column(name = "update_at_time")
    private Date updateAtTime;

    @Column(name = "id_product_main")
    private Integer idProductMain;

    @Column(name = "id_category_product_extra")
    private Integer idCategoryProductExtra;

}
