/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database_connection.DBConnection;
import database_connection.DBHandler;
import java.sql.SQLException;
import model.User;

/**
 *
 * @author Ershadi
 */
public class UserController {

    public static int addUser(User user) throws ClassNotFoundException, SQLException {
        String query = "INSERT INTO user(user_id,user_name,user_password) VALUES('" + user.getUser_id() + "','" + user.getUser_name() + "','" + user.getUser_password() + "')";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }
}
