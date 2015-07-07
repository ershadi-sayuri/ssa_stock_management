/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ershadi
 */
public class DBConnection {

    private static final String url = "jdbc:mysql://localhost/siri_sadaham_ashramaya_stock_management_system";
    private static final String user = "root";
    private static final String password = "";

    private static Connection conn = null;
    private static DBConnection dbconn = null;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);
    }

    private static DBConnection getDBConnection() throws ClassNotFoundException, SQLException {
        if (dbconn == null) {
            dbconn = new DBConnection();
        }
        return dbconn;
    }

    public static Connection getConnectionToDB() throws ClassNotFoundException, SQLException {
        return getDBConnection().conn;
    }
}
