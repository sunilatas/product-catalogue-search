package com.sapient.productCatalogue.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "SIZE")
public class Size implements Serializable {

    @Id
    private Integer id;

    private String size;

    private String description;
}
