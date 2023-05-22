package com.project.dla.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.project.dla.domains.Category;
import com.project.dla.repositories.CategoryRepo;
import com.project.dla.responses.ResponseAPI;

@Service
public class Services {
    @Autowired
    private CategoryRepo repo;

    public ResponseAPI getListCategory(){
        ResponseAPI res = new ResponseAPI();
        List<Category> list = repo.findAll();
        
        res.setCode(HttpStatus.OK.value());
        res.setMessages("OK");
        res.setResult(list);
        res.setAdditionalEntity(null);
        return res;
    }
}
