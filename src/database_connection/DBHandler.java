/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ershadi
 */
public class DBHandler {

    public static int setData(Connection connection, String query) throws SQLException, ClassNotFoundException {
        Statement stm = connection.createStatement();
        int result = stm.executeUpdate(query);
        return result;
    }

    public static ResultSet getData(Connection connection, String query) throws SQLException, ClassNotFoundException {
        Statement stm = connection.createStatement();
        ResultSet resultSet = stm.executeQuery(query);
        return resultSet;
    }
}
