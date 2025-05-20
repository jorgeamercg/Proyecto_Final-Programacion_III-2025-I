package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.mindrot.jbcrypt.BCrypt;

public class AdminDAO {
	
	// MÉTODO PARA REALIZAR CRUD DE AUTENTICACIÓN
	public boolean authenticate(String username, String password) {
		
		Connection connection = ConnectionDB.connect();
	    if (connection == null) return false;

	    try {
	    	// PreparedStatement PARA EVITAR SQL INJECTION
	        String sql = "SELECT password FROM Admins WHERE username = ?";
	        PreparedStatement statement = connection.prepareStatement(sql);
	        statement.setString(1, username);

	        ResultSet result = statement.executeQuery();

	        // ENCRIPTACIÓN CON BCrypt
	        if (result.next()) {
	            String storedPassword = result.getString("password");

	            // Si la contraseña ya está encriptada con BCrypt (porque ya se ingresó anteriormente en el login)
	            if (storedPassword.startsWith("$2a$")) {
	                return BCrypt.checkpw(password, storedPassword);
	            }

	            // Si la contraseña está en texto plano (porque aún no se ha encriptado al ser la primera vez que se ingresa en el login)
	            if (password.equals(storedPassword)) {
	                String hashed = org.mindrot.jbcrypt.BCrypt.hashpw(password, org.mindrot.jbcrypt.BCrypt.gensalt());

	                PreparedStatement update = connection.prepareStatement(
	                    "UPDATE Admins SET password = ? WHERE username = ?"
	                );
	                update.setString(1, hashed);
	                update.setString(2, username);
	                update.executeUpdate();

	                return true;
	            }
	        }

	        result.close();
	        statement.close();
	        connection.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return false;
	    
	}

}
