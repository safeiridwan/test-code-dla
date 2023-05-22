package com.project.dla.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dla.responses.ResponseAPI;

@RestController
@RequestMapping("/api/category")
public class Controllers {
    @Autowired
    private Services service;

    @GetMapping("/list")
    public ResponseAPI getListCategory() {
        return service.getListCategory();
    }
}
