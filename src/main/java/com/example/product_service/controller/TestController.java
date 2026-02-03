package com.example.product_service.controller;


import com.example.product_service.dto.ProductRequest;
import com.example.product_service.dto.ProductResponse;
import com.example.product_service.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/test")
public class TestController {

        private final ProductService productService;

        public TestController(ProductService productService) {
            this.productService = productService;
        }
        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public ProductResponse createProduct(@RequestBody ProductRequest productRequest){
            return productService.createProduct(productRequest);
        }

        @GetMapping
        @ResponseStatus(HttpStatus.OK)
        public List<ProductResponse> getAllPro(){
            return productService.getAllProducts();


    }
}
