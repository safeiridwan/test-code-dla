package com.project.dla.domain.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "category_id")
    private Integer categoryID;
    @Column(columnDefinition = "name", length = 64)
    private String name;
    @Column(columnDefinition = "image_url", length = 255)
    private String imageUrl;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY, orphanRemoval = false)
    private List<CategoryItem> listCategoryItem = new ArrayList<>();
}
