package controllers;

import models.LoginModel;

import views.LoginView;

public class LoginController {
	
	private LoginView view;
	
    private LoginModel model;

    public LoginController() {
    	
        this.view = new LoginView(this);
        
        this.model = new LoginModel();
        
    }

    public void login(String username, String password) {
    	
        model.processLogin(username, password, view);
        
    }

    public void show() {
    	
        view.login();
        
    }

}
