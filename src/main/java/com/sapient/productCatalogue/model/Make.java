package com.sapient.productCatalogue.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "MAKE")
public class Make implements Serializable {

    @Id
    private Integer id;

    private String name;

}
