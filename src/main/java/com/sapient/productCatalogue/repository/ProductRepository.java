package com.sapient.productCatalogue.repository;

import com.sapient.productCatalogue.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

    @Query("select p from Product p")
    List<Product> findProductBy(@Param("categoryId") Integer categoryId, @Param("colourId") Integer colourId,
                                @Param("makeId") Integer makeId, @Param("sizeId") Integer sizeId);
}
