package com.cayo.ms.demo.api;

import com.cayo.ms.demo.model.Category;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

/**
 * A delegate to be called by the {@link CategoryApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-25T13:32:01.526325541-04:00[America/New_York]")
public interface CategoryApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /category : Add a new category
     * Add a new category
     *
     * @param category Create a new Category (required)
     * @return Successful operation (status code 200)
     *         or Invalid input (status code 405)
     * @see CategoryApi#addCategory
     */
    default ResponseEntity<Category> addCategory(Category category) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"Dogs\", \"id\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /category/{categoryId} : Deletes a category
     * delete a category
     *
     * @param categoryId Category id to delete (required)
     * @param apiKey  (optional)
     * @return Invalid category value (status code 400)
     * @see CategoryApi#deleteCategory
     */
    default ResponseEntity<Void> deleteCategory(Long categoryId,
        String apiKey) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /category/findByName : Finds Categories by name
     * Multiple status values can be provided with comma separated strings
     *
     * @param name Status values that need to be considered for filter (optional)
     * @return successful operation (status code 200)
     *         or Invalid status value (status code 400)
     * @see CategoryApi#findCategoriesByName
     */
    default ResponseEntity<List<Category>> findCategoriesByName(String name) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"name\" : \"Dogs\", \"id\" : 1 }, { \"name\" : \"Dogs\", \"id\" : 1 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /category/{categoryId} : Find category by Id
     * Returns a single category
     *
     * @param categoryId ID of category to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Category not found (status code 404)
     * @see CategoryApi#getCategoryById
     */
    default ResponseEntity<Category> getCategoryById(Long categoryId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"Dogs\", \"id\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /category : Update an existing category
     * Update an existing category by Id
     *
     * @param category Update an existent category (required)
     * @return Successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Category not found (status code 404)
     *         or Validation exception (status code 405)
     * @see CategoryApi#updateCategory
     */
    default ResponseEntity<Category> updateCategory(Category category) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"Dogs\", \"id\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /category/{categoryId} : Updates a category with form data
     * 
     *
     * @param categoryId ID of category that needs to be updated (required)
     * @param name Name of category that needs to be updated (optional)
     * @param description Description of category that needs to be updated (optional)
     * @return Invalid input (status code 405)
     * @see CategoryApi#updateCategoryWithForm
     */
    default ResponseEntity<Void> updateCategoryWithForm(Long categoryId,
        String name,
        String description) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
