package com.xworkz.platform.dmart;

import com.xworkz.platform.product.Product;
import com.xworkz.platform.supermarket.SuperMarket;

import java.util.Arrays;

public class DMart extends SuperMarket {

    Product product[];
    int index=0,productID=1;

    public DMart(int size){
       product=new Product[size];
    }


    public boolean addProducts(Product product){
        boolean isAdded=false;
        if (product!=null){
            product.setProductID(productID++);
            this.product[index++]=product;
            System.out.println("ID for product is added successfully..!! ");
            isAdded=true;
        }
        else {
            System.out.println("null pointer exception....!!");
        }
        return isAdded;
    }

    public boolean getAllProducts(){
        System.out.println("List of Products are : ");
        for (int index = 0; index < this.product.length; index++) {
            System.out.println(product[index].getProductID()+" "+product[index].getProductName()+" "+
                    product[index].getProductType()+" "+product[index].getPrice()+" "+product[index].getQuantity()+" "+
                    product[index].getManufacturingDate()+" "+product[index].getExpirationDate()+" "+
                    product[index].getManufacturedByCountry());
        }
        return false;
    }

    public Product getProductByProductID(int productID){
        Product product1=null;
        for (int index = 0; index < this.product.length; index++) {
            if (product[index].getProductID() ==(productID)){
                product1=product[index];
                System.out.println("Application found please collect in the executor : ");
            }
        }
        return product1;
    }


    public Product getProductByProductType(String productType){
       Product product1=null;
        for (int index = 0; index < this.product.length; index++) {
                if(product[index].getProductType().equals(productType)){
                    product1=product[index];
                    System.out.println("Application found please collect in the executor : ");
                }
        }
        return product1;
    }
    

    public boolean updateProductQuantityByProductName(String existingProductName,int updateQuantity){
        boolean isQuantityUpdate=false;
        for (int index = 0; index < this.product.length; index++) {
            product[index].getProductName().equals(existingProductName);
            product[index].setQuantity(updateQuantity);
            isQuantityUpdate=true;
            System.out.println("Quantity updated successfully..! ");
        }
        return isQuantityUpdate;
    }

    public boolean updateProductPriceByQuantity(int existingQuantity,double updateprice){
        boolean isPriceUpdated=false;
        for (int index = 0; index < this.product.length ;index++) {
            if (product[index].getQuantity()==existingQuantity){
                product[index].setPrice(updateprice);
                System.out.println("Quantity updated successfully..! ");
            }
        }
        return isPriceUpdated;
    }


    public void deleteProductByProductID(int productID) {
        System.out.println("Invoked delete Product By ProductID: ");
        Product newproduct[] = new Product[this.product.length - 1];
        int index, newIndex;
        for (index = 0, newIndex = 0; index < this.product.length; index++) {
            if (product[index].getProductID() != (productID)) {
                product[newIndex++] = product[index];
            }
        }

        product = Arrays.copyOf(product, newIndex);
    }

}
