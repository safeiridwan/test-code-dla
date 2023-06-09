package com.project.dla.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.dla.domains.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long>{

    List<Category> findAll(); 
}
