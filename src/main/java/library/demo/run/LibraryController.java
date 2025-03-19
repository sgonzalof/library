package library.demo.run;

import java.util.List;


import library.demo.run.LibraryModel;
import library.demo.run.LibraryView;

public class LibraryController {
	private LibraryModel model;
	private LibraryView view;
	
	
	public void setVistaModel( LibraryView v , LibraryModel m) {
		this.model = m;
		this.view = v;
		//no hay inicializacion especifica del modelo, solo de la vista
		//this.view.getFrame().setVisible(true);
	}
	
	//a partir de aqui, implementamos los metodos de las funcionalidades correspondientes
	
	public void AniadirArticulosPedido(int i) {
		//metodo para rellenar la tabla de articulos y pedidos
		
		
		
		
	};
	

	public LibraryView getView() {
		return view;
	}

	public void setView(LibraryView view) {
		this.view = view;
	}

	public LibraryModel getModel() {
		return model;
	}

	public void setModel(LibraryModel model) {
		this.model = model;
	}

}


