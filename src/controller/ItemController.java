/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database_connection.DBConnection;
import database_connection.DBHandler;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Item;

/**
 *
 * @author Ershadi
 */
public class ItemController {

    public static int addItem(Item item) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO item(item_code,item_title,item_description,item_quantity_unit) VALUES('" + item.getItem_code() + "','" + item.getItem_title() + "','" + item.getItem_description() + "','" + item.getItem_quantity_unit() + "')";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }

    public static Item searchItem(String searchFrom, String detail) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM item WHERE " + searchFrom + "='" + detail + "'";
        ResultSet resultSet = DBHandler.getData(DBConnection.getConnectionToDB(), query);
        Item item = new Item();
        if (resultSet.next()) {
            item.setItem_code(resultSet.getString(1));
            item.setItem_title(resultSet.getString(2));
            item.setItem_description(resultSet.getString(3));
            item.setItem_quantity_unit(resultSet.getString(4));
        }
        return item;
    }
}
