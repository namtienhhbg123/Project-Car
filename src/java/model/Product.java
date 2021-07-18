/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author admin
 */
public class Product {
    private int productID;
    private String productName;
    private int categoryID;
    private int unitsInStock;
    private int unitsOnOrder;
    private double unitPrice;
    private String img;
    

    public Product() {
    }

    public Product(int productID, String productName, int categoryID, int unitsInStock, int unitsOnOrder, double unitPrice, String img) {
        this.productID = productID;
        this.productName = productName;
        this.categoryID = categoryID;
        this.unitsInStock = unitsInStock;
        this.unitsOnOrder = unitsOnOrder;
        this.unitPrice = unitPrice;
        this.img = img;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public int getUnitsOnOrder() {
        return unitsOnOrder;
    }

    public void setUnitsOnOrder(int unitsOnOrder) {
        this.unitsOnOrder = unitsOnOrder;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Product{" + "productID=" + productID + ", productName=" + productName + ", categoryID=" + categoryID + ", unitsInStock=" + unitsInStock + ", unitsOnOrder=" + unitsOnOrder + ", unitPrice=" + unitPrice + ", img=" + img + '}';
    }

    
    
    
}
