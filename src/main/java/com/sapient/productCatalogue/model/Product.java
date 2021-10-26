package com.sapient.productCatalogue.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {

    @Id
    private Integer id;

    private String name;

    private String description;

    @ManyToOne
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private Colour colour;

    @ManyToOne
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private Size size;

    @ManyToOne
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private Make make;

    @ManyToOne
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private Category category;

}
