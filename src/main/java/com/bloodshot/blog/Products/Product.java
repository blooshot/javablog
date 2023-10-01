package com.bloodshot.blog.Products;

import javax.persistence.*;

@Entity
@Table(name = "Product")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
}
