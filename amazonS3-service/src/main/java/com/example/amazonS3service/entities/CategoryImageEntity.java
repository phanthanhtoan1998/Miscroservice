package com.example.amazonS3service.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import static com.example.commonservice.contants.TimeContant.CREATE_AT_TIME;
import static com.example.commonservice.contants.TimeContant.UPDATE_AT_TIME;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "category_image")
public class CategoryImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
    @CreationTimestamp
    @DateTimeFormat(pattern = CREATE_AT_TIME)
    @Column(name = "create_at_time")
    private LocalDateTime createdAt;
    @UpdateTimestamp
    @DateTimeFormat(pattern = UPDATE_AT_TIME)
    @Column(name = "update_at_time")
    private LocalDateTime updatedAt;

}
