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
import model.Stock;
import model.Taker;

/**
 *
 * @author Ershadi
 */
public class StockController {

    public static int addStock(Stock stock, Item item) throws ClassNotFoundException, SQLException {
        String query = "INSERT INTO stock(stock_id,expire_date,in_date,out_date,quantity,item_id) VALUES('" + stock.getStock_id() + "','" + stock.getItem_expire_date() + "','" + stock.getItem_in_date() + "','" + stock.getItem_out_Date() + "','" + stock.getItem_quantity() + "','" + item.getItem_code() + "')";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }

    public static int addStockTaker(Taker taker, Stock stock) throws ClassNotFoundException, SQLException {
        String query = "INSERT INTO stock_taker(taker_id,stock_id) VALUES('" + taker.getTaker_id() + "','" + stock.getStock_id() + "')";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }
    
    // TODO delete, update stock
    // TODO delete stocktaker
}
