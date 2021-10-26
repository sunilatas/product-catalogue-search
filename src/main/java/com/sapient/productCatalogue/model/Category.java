package com.sapient.productCatalogue.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "CATEGORY")
public class Category implements Serializable {

    @Id
    private Integer id;

    private String name;

    private String description;
}
