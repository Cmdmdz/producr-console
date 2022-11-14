package org.example;

public class ProductModel {

    private Integer item_ID;
    private Integer item_Price;
    private Integer item_Quantity;
    private String item_Description;
    private String item_Manufacturing_date;

    public Integer getItem_ID() {
        return item_ID;
    }

    public void setItem_ID(Integer item_ID) {
        this.item_ID = item_ID;
    }

    public Integer getItem_Price() {
        return item_Price;
    }

    public void setItem_Price(Integer item_Price) {
        this.item_Price = item_Price;
    }

    public Integer getItem_Quantity() {
        return item_Quantity;
    }

    public void setItem_Quantity(Integer item_Quantity) {
        this.item_Quantity = item_Quantity;
    }

    public String getItem_Description() {
        return item_Description;
    }

    public void setItem_Description(String item_Description) {
        this.item_Description = item_Description;
    }

    public String getItem_Manufacturing_date() {
        return item_Manufacturing_date;
    }

    public void setItem_Manufacturing_date(String item_Manufacturing_date) {
        this.item_Manufacturing_date = item_Manufacturing_date;
    }
}
