package controllers;

import views.ProductsView;

public class ProductsController {
	private ProductsView view;
	
	public ProductsController() {
		view = new ProductsView();
	}
	
	public void games() {
		view.games();
	}
	
	public void movies() {
		view.movies();
	}
	
}
