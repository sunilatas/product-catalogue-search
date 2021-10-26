package com.sapient.productCatalogue.controller;

import com.sapient.productCatalogue.model.Product;
import com.sapient.productCatalogue.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/search")
    public List<Product> findAll(@RequestParam Map<String, Integer> params) {
        return productService.findAll(params);
    }

    @GetMapping("/search/{id}")
    public Product findOne(@PathVariable Integer id) {
        return productService.findOne(id);
    }
}
