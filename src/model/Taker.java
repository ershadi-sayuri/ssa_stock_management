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
public class Taker {

    private String taker_id;
    private String taker_name;

    public Taker() {
    }

    public Taker(String taker_id, String taker_name) {
        this.taker_id = taker_id;
        this.taker_name = taker_name;
    }

    /**
     * @return the taker_id
     */
    public String getTaker_id() {
        return taker_id;
    }

    /**
     * @param taker_id the taker_id to set
     */
    public void setTaker_id(String taker_id) {
        this.taker_id = taker_id;
    }

    /**
     * @return the taker_name
     */
    public String getTaker_name() {
        return taker_name;
    }

    /**
     * @param taker_name the taker_name to set
     */
    public void setTaker_name(String taker_name) {
        this.taker_name = taker_name;
    }

}
