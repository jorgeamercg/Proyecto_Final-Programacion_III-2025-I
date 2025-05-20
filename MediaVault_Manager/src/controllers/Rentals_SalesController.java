package controllers;

import views.Rentals_SalesView;

public class Rentals_SalesController {
	private Rentals_SalesView view;
	
	public Rentals_SalesController() {
		view = new Rentals_SalesView();
	}
	
	public void rentas_compras() {
		view.rentas_compras();
	}
}
