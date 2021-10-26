package com.sapient.productCatalogue.repository;

import com.sapient.productCatalogue.model.Colour;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColourRepository extends CrudRepository<Colour, Integer> {
}
