package com.xworkz.platform.supermarket.impl;

import com.xworkz.platform.exception.*;
import com.xworkz.platform.product.Product;
import com.xworkz.platform.supermarket.SuperMarket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dmartimpl implements SuperMarket {

//    Product product[];

    List<Product> products = new ArrayList<>();
    int index=0,productID=1;

//    public Dmartimpl(int size){
//        product=new Product[size];
//    }

    public boolean addProducts(Product product){
        System.out.println("started addProducts method :");
        boolean isAdded=false;

        try {
            if (product != null) {
                product.setProductID(productID++);
                this.products.add(product);
                System.out.println("ID for product is added successfully..!! ");
                isAdded = true;
            } else {
                CannotAddNullProductsException cannotAddNullProductsException=new CannotAddNullProductsException("error message :");
                throw cannotAddNullProductsException;
            }
        }catch (CannotAddNullProductsException e){
            e.printStackTrace();
        }
        return isAdded;
    }

    public boolean getAllProducts(){
        System.out.println("started getAllProducts method: List of Products are : ");

        for (Product product : products) {
            System.out.println(product);
        }
        return true;
    }

    public Product getProductByProductID(int productID){
        System.out.println("started getProductByProductID method : ");
        Product product1=null;

        try {
            for (Product product : products) {
                if (product.getProductID() == (productID)) {
                    product1 = product;
                    System.out.println("Application found please collect in the executor : ");
                }
            }
            if (product1==null){
                ProductIDNotFoundException productIDNotFoundException=new ProductIDNotFoundException("error message :");
                throw productIDNotFoundException;
            }
        }catch (ProductIDNotFoundException e){
            e.printStackTrace();
        }
        return product1;
    }


    public Product getProductByProductType(String productType){
        System.out.println("started getProductByProductType method : ");
        Product product1=null;

        try {
            for (Product product : products) {
                if (product.getProductType().equals(productType)) {
                    product1 = product;
                    System.out.println("Application found please collect in the executor : ");
                }
            }
            if (product1==null){
                ProductTypeNotFoundException productTypeNotFoundException=new ProductTypeNotFoundException("error message : ");
                throw productTypeNotFoundException;
            }
        }catch(ProductTypeNotFoundException e){
            e.printStackTrace();
        }
        return product1;
    }

    public boolean updateProductQuantityByProductName(String existingProductName,int updateQuantity){
        System.out.println("started updateProductQuantityByProductName method : ");
        boolean isQuantityUpdate=false;

        try {
            for (Product product : products) {
                if (product.getProductName().equals(existingProductName)) {
                    product.setQuantity(updateQuantity);
                    isQuantityUpdate = true;
                    System.out.println("Quantity updated successfully..! ");
                }
            }
            if (isQuantityUpdate==false){
                UpdatedProductQuantityNotFoundException updatedProductQuantityNotFoundException=new UpdatedProductQuantityNotFoundException("error message :");
                throw updatedProductQuantityNotFoundException;
            }
        }catch (UpdatedProductQuantityNotFoundException e){
            e.printStackTrace();
        }
        return isQuantityUpdate;
    }

    public boolean updateProductPriceByQuantity(int existingQuantity,double updateprice){
        System.out.println("started updatedProductPriceByQuantity method : ");
        boolean isPriceUpdated=false;

        try {
            for (Product product : products) {
                if (product.getQuantity() == existingQuantity) {
                    product.setPrice(updateprice);
                    isPriceUpdated=true;
                    System.out.println("Quantity updated successfully..! ");
                }
            }
            if (isPriceUpdated==false){
                UpdatedProductPriceNotFoundException updatedProductPriceNotFoundException=new UpdatedProductPriceNotFoundException("error message :");
                throw updatedProductPriceNotFoundException;
            }
        }catch (UpdatedProductPriceNotFoundException e){
            e.printStackTrace();
        }
        return isPriceUpdated;
    }

    public void deleteProductByProductID(int productID) {
        System.out.println("Invoked delete Product By ProductID: ");
//        Product newproduct[] = new Product[this.product.length - 1];
//        int index, newIndex=0;
        boolean isDeleted=false;

        try {
            if (this.products.size()>0) {
                for (Product product : products) {
                    if (product.getProductID() == (productID)) {
                        products.remove(product);
                        isDeleted = true;

                    }
                }
                System.out.println("After deleted method :");
                for (Product product : products ) {
                    System.out.println(product);
                }
                if (isDeleted == false) {
                    DeletedProductNotFoundException deletedProductNotFoundException=new DeletedProductNotFoundException("error message :");
                    throw deletedProductNotFoundException;
                }
            }else {
                DeletedProductNotFoundException deletedProductNotFoundException=new DeletedProductNotFoundException("error message :");
                throw deletedProductNotFoundException;
            }
        }catch (DeletedProductNotFoundException e){
            e.printStackTrace();
        }

//        product = Arrays.copyOf(product, newIndex);
    }

}
