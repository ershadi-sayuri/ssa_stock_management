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
public class Item {

    private String item_code;
    private String item_title;
    private String item_description;
    private String item_quantity_unit;

    public Item() {
    }

    public Item(String item_code, String item_title, String item_brand, String item_description, String item_quantity_unit) {
        this.item_code = item_code;
        this.item_title = item_title;
        this.item_description = item_description;
        this.item_quantity_unit = item_quantity_unit;
    }

    /**
     * @return the item_code
     */
    public String getItem_code() {
        return item_code;
    }

    /**
     * @param item_code the item_code to set
     */
    public void setItem_code(String item_code) {
        this.item_code = item_code;
    }

    /**
     * @return the item_title
     */
    public String getItem_title() {
        return item_title;
    }

    /**
     * @param item_title the item_title to set
     */
    public void setItem_title(String item_title) {
        this.item_title = item_title;
    }

    /**
     * @return the item_description
     */
    public String getItem_description() {
        return item_description;
    }

    /**
     * @param item_description the item_description to set
     */
    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }

    /**
     * @return the item_quantity_unit
     */
    public String getItem_quantity_unit() {
        return item_quantity_unit;
    }

    /**
     * @param item_quantity_unit the item_quantity_unit to set
     */
    public void setItem_quantity_unit(String item_quantity_unit) {
        this.item_quantity_unit = item_quantity_unit;
    }
}
