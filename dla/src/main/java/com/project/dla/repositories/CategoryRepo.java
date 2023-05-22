package com.project.dla.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.dla.domains.Category;
import com.project.dla.domains.CategoryItem;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long>{

    List<Category> findAll(); 
    
    @Query(value = "SELECT * FROM categoryitem as ci INNER JOIN category AS c ON c.id = ci.category_id WHERE ci.category_id = ?1", nativeQuery = true)
    List<CategoryItem> findAllCompany(String categoryID);
}
