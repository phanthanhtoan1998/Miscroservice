package com.example.entities;

import jakarta.persistence.*;
import lombok.*;
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
@Builder
@Table(name = "image_product_main")
public class ImageProductMainEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "icon")
    private String icon;

    @CreationTimestamp
    @DateTimeFormat(pattern = CREATE_AT_TIME)
    @Column(name = "create_at_time")
    private Date createAtTime;

    @UpdateTimestamp
    @DateTimeFormat(pattern = UPDATE_AT_TIME)
    @Column(name = "update_at_time")
    private Date updateAtTime;

}
