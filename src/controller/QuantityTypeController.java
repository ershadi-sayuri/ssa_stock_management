/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database_connection.DBConnection;
import database_connection.DBHandler;
import java.sql.SQLException;
import model.Item;
import model.QuantityType;

/**
 *
 * @author Ershadi
 */
public class QuantityTypeController {

    public static int addQuantityType(QuantityType quantityType) throws ClassNotFoundException, SQLException {
        String query = "INSERT INTO item_taker(quantity_type_id,quantity_type) VALUES('" + quantityType.getQuantity_type_id() + "','" + quantityType.getQuantity_type() + "')";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }

    public static int addItemQuantityType(Item item, QuantityType quantityType) throws ClassNotFoundException, SQLException {
        String query = "INSERT INTO item_quantity_type(item_code,quantity_type_id) VALUES('" + item.getItem_code() + "','" + quantityType.getQuantity_type_id() + "')";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }
}
