package models;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
	
	public static Connection connect() {
		
        // CONEXIÓN CON BASE DE DATOS DE MySQL EN SERVIDOR REMOTO DE AIVEN
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://mysql-4cec556-mediavault-manager-db.j.aivencloud.com:12192/MediaVault_Manager_DB?sslMode=REQUIRED";
            String user = "avnadmin";
            String password = "AVNS_WMZjj0OaO_nbE6AR3_X";

            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
    }
	
}
