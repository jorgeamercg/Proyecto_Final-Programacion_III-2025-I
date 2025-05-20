package controllers;

import views.LoginView;

public class LoginController {
	public LoginView vista;
	
	public LoginController() {
		vista = new LoginView();
	}
	public void login() {
		vista.login();
	}

}
