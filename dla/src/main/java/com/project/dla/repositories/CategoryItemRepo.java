package com.project.dla.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.dla.domains.CategoryItem;

@Repository
public interface CategoryItemRepo extends JpaRepository<CategoryItem, Long>{

    @Query(value = "SELECT ci.id, ci.category_id, ci.name, ci.image_url, ci.description FROM category_item as ci INNER JOIN category AS c ON c.id = ci.id WHERE ci.category_id = ?1", nativeQuery = true)
    List<CategoryItem> findAllCompany(String categoryID);

    @Query(value = "SELECT ci.id, ci.category_id, ci.name, ci.image_url, ci.description FROM category_item as ci INNER JOIN category AS c ON c.id = ci.id WHERE ci.category_id = ?1 and ci.id = ?2", nativeQuery = true)
    CategoryItem findDetailCompany(String categoryID, String companyID);
}
