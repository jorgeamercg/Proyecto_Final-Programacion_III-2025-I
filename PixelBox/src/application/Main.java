package application;

import controllers.LoginController;

public class Main {

	public static void main(String[] args) {
		
		LoginController aplication = new LoginController();
		
		// LLAMADA A LA VIEW DE LOGIN
		aplication.show();
		
	}

}
