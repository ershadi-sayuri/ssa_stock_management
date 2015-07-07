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
public class QuantityType {

    private String quantity_type_id;
    private String quantity_type;

    public QuantityType() {
    }

    public QuantityType(String quantity_type_id, String quantity_type) {
        this.quantity_type_id = quantity_type_id;
        this.quantity_type = quantity_type;
    }

    /**
     * @return the quantity_type_id
     */
    public String getQuantity_type_id() {
        return quantity_type_id;
    }

    /**
     * @param quantity_type_id the quantity_type_id to set
     */
    public void setQuantity_type_id(String quantity_type_id) {
        this.quantity_type_id = quantity_type_id;
    }

    /**
     * @return the quantity_type
     */
    public String getQuantity_type() {
        return quantity_type;
    }

    /**
     * @param quantity_type the quantity_type to set
     */
    public void setQuantity_type(String quantity_type) {
        this.quantity_type = quantity_type;
    }

}
