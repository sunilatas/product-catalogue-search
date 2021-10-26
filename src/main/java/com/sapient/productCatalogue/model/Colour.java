package com.sapient.productCatalogue.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "COLOUR")
public class Colour implements Serializable {

    @Id
    private Integer id;

    private String name;

}
