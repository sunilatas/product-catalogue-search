package com.sapient.productCatalogue.services;

import com.sapient.productCatalogue.model.Product;

import java.util.List;
import java.util.Map;

public interface IProductService {

    List<Product> findAll(Map<String, Integer> params);

    Product findOne(Integer id);
}
