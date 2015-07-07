/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database_connection.DBConnection;
import database_connection.DBHandler;
import java.sql.SQLException;
import model.Taker;

/**
 *
 * @author Ershadi
 */
public class TakerController {

    public static int addTaker(Taker taker) throws ClassNotFoundException, SQLException {
        String query = "INSERT INTO taker(taker_id,taker_name) VALUES('" + taker.getTaker_id() + "','" + taker.getTaker_name() + "')";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }
}
