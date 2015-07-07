/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ershadi
 */
public class Stock {

    private String stock_id;
    private String item_expire_date;
    private String item_in_date;
    private String item_out_Date;
    private int item_quantity;
    private double unit_price;

    public Stock() {
    }

    public Stock(String stock_id, String item_expire_date, String item_in_date, String item_out_Date, int item_quantity, double unit_price) {
        this.stock_id = stock_id;
        this.item_expire_date = item_expire_date;
        this.item_in_date = item_in_date;
        this.item_out_Date = item_out_Date;
        this.item_quantity = item_quantity;
        this.unit_price = unit_price;
    }

    /**
     * @return the stock_id
     */
    public String getStock_id() {
        return stock_id;
    }

    /**
     * @param stock_id the stock_id to set
     */
    public void setStock_id(String stock_id) {
        this.stock_id = stock_id;
    }

    /**
     * @return the item_expire_date
     */
    public String getItem_expire_date() {
        return item_expire_date;
    }

    /**
     * @param item_expire_date the item_expire_date to set
     */
    public void setItem_expire_date(String item_expire_date) {
        this.item_expire_date = item_expire_date;
    }

    /**
     * @return the item_in_date
     */
    public String getItem_in_date() {
        return item_in_date;
    }

    /**
     * @param item_in_date the item_in_date to set
     */
    public void setItem_in_date(String item_in_date) {
        this.item_in_date = item_in_date;
    }

    /**
     * @return the item_out_Date
     */
    public String getItem_out_Date() {
        return item_out_Date;
    }

    /**
     * @param item_out_Date the item_out_Date to set
     */
    public void setItem_out_Date(String item_out_Date) {
        this.item_out_Date = item_out_Date;
    }

    /**
     * @return the item_quantity
     */
    public int getItem_quantity() {
        return item_quantity;
    }

    /**
     * @param item_quantity the item_quantity to set
     */
    public void setItem_quantity(int item_quantity) {
        this.item_quantity = item_quantity;
    }

    /**
     * @return the unit_price
     */
    public double getUnit_price() {
        return unit_price;
    }

    /**
     * @param unit_price the unit_price to set
     */
    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

}
