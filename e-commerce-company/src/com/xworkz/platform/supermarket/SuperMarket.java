package com.xworkz.platform.supermarket;

import com.xworkz.platform.product.Product;

import java.util.Arrays;

public interface SuperMarket {

    public boolean addProducts(Product product);

    public boolean getAllProducts();

    public Product getProductByProductID(int productID);

    public Product getProductByProductType(String productType);

    public boolean updateProductQuantityByProductName(String existingProductName,int updateQuantity);

    public boolean updateProductPriceByQuantity(int existingQuantity,double updateprice);

    public void deleteProductByProductID(int productID) ;


}
