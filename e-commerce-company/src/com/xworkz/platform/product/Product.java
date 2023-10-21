package com.xworkz.platform.product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor


public class Product {

    private int productID;
    private String productName;
    private String productType;
    private double price;
    private int quantity;
    private String manufacturingDate;
    private String expirationDate;
    private String manufacturedByCountry;

}
