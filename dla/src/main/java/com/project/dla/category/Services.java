package com.project.dla.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.project.dla.domains.Category;
import com.project.dla.domains.CategoryItem;
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

    public ResponseAPI getListCompany(String categoryID){
        ResponseAPI res = new ResponseAPI();
        List<CategoryItem> list = repo.findAllCompany(categoryID);
        
        res.setCode(HttpStatus.OK.value());
        res.setMessages("OK");
        res.setResult(list);
        res.setAdditionalEntity(null);
        return res;
    }

    public ResponseAPI getDetailCompany(String categoryID, String companyID){
        ResponseAPI res = new ResponseAPI();
        CategoryItem item = repo.findDetailCompany(categoryID, companyID);
        
        res.setCode(HttpStatus.OK.value());
        res.setMessages("OK");
        res.setResult(item);
        res.setAdditionalEntity(null);
        return res;
    }
}
