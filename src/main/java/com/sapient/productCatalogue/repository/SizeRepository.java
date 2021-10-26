package com.sapient.productCatalogue.repository;

import com.sapient.productCatalogue.model.Size;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeRepository extends CrudRepository<Size, Integer> {
}
