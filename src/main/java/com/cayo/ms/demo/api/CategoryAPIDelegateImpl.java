package com.cayo.ms.demo.api;

import com.cayo.ms.demo.model.Category;
import com.cayo.ms.demo.model.ModelApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class CategoryAPIDelegateImpl implements CategoryApiDelegate {


    @Override
    public ResponseEntity<Category> addCategory(Category category) {
        return CategoryApiDelegate.super.addCategory(category);
    }

    @Override
    public ResponseEntity<Void> deleteCategory(Long categoryId, String apiKey) {
        return CategoryApiDelegate.super.deleteCategory(categoryId, apiKey);
    }

    @Override
    public ResponseEntity<List<Category>> findCategoriesByName(String name) {
        return CategoryApiDelegate.super.findCategoriesByName(name);
    }

    @Override
    public ResponseEntity<Category> getCategoryById(Long categoryId) {
        try{
            Category category = new Category();
            category.setId(categoryId);
            category.setName("Category 1");
            return new ResponseEntity<Category>(category,HttpStatus.OK);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }
    }

    @Override
    public ResponseEntity<Category> updateCategory(Category category) {
        return CategoryApiDelegate.super.updateCategory(category);
    }

    @Override
    public ResponseEntity<Void> updateCategoryWithForm(Long categoryId, String name, String description) {
        return CategoryApiDelegate.super.updateCategoryWithForm(categoryId, name, description);
    }
}
