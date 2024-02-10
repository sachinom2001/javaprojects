package com.xworkz.platform.product;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString


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
