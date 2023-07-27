package com.cayo.ms.demo.api;

import com.cayo.ms.demo.model.Category;
import com.cayo.ms.demo.model.ModelApiResponse;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class CategoryAPIDelegateImpl implements CategoryApiDelegate {

    private final Logger logger = LoggerFactory.getLogger(CategoryAPIDelegateImpl.class);

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
            logger.info("Category By Id: " + categoryId);
            if(categoryId == 1) {
                category.setId(categoryId);
                category.setName("Category 1");
                return new ResponseEntity<Category>(category, HttpStatus.OK);
            } else {
                throw new Run;
            }

        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
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
