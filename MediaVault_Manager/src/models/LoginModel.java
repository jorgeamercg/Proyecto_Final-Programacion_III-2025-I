package models;

import javax.swing.JOptionPane;

import controllers.HomeController;

import views.LoginView;

public class LoginModel {
	
	private AdminDAO dao = new AdminDAO();
	
	// MÉTODO PARA VALIDAR AUTENTICACIÓN
	public void processLogin(String username, String password, LoginView view) {
		
        boolean valid = dao.authenticate(username, password);

        if (valid) {
            view.disposeWindow();
            
            HomeController home = new HomeController();
            home.home();
        } else {
            JOptionPane.showMessageDialog(view.getFrame(), "Credenciales no válidas");

            view.getPassField().setBorderColor(java.awt.Color.RED);
            view.getUserField().setBorderColor(java.awt.Color.RED);
            view.getErrorLabel().setVisible(true);

            view.getPassField().setText("");
            view.getUserField().setText("");
            view.getUserField().requestFocus();
        }
        
    }

}
