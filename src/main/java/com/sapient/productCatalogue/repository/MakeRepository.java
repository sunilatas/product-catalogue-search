package com.sapient.productCatalogue.repository;

import com.sapient.productCatalogue.model.Make;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MakeRepository extends CrudRepository<Make, Integer> {
}
