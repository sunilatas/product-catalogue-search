package com.sapient.productCatalogue.services;

import com.sapient.productCatalogue.model.Product;
import com.sapient.productCatalogue.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll(Map<String, Integer> params) {
        return productRepository.findProductBy(params.get("categoryId"), params.get("colourId"), params.get("makeId"), params.get("sizeId"));
    }

    @Override
    public Product findOne(Integer id) {
        return productRepository.findById(id).get();
    }
}
