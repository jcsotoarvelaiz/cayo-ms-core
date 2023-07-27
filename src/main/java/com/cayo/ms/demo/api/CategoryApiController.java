package com.cayo.ms.demo.api;

import com.cayo.ms.demo.model.Category;
import com.cayo.ms.demo.model.Error;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-27T19:35:00.570654233-04:00[America/New_York]")
@Controller
@RequestMapping("${openapi.demoOpenAPI30.base-path:/api/v3}")
public class CategoryApiController implements CategoryApi {

    private final CategoryApiDelegate delegate;

    public CategoryApiController(@Autowired(required = false) CategoryApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new CategoryApiDelegate() {});
    }

    @Override
    public CategoryApiDelegate getDelegate() {
        return delegate;
    }

}
