package com.project.dla.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dla.repositories.CategoryRepo;

@Service
public class Services {
    @Autowired
    private CategoryRepo repo;
}
