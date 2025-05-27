package controllers;

import views.VideogamesView;

public class VideogamesController {
	private VideogamesView view;
	
	public VideogamesController() {
		view = new VideogamesView();
	}
	
	public void games() {
		view.games();
	}
	
}
