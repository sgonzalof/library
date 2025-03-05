package library.demo.run;

public class Book {
	private int isbn;
	private String title;
	private String writer;
	private int year;
	
	public void registerBook (int i, String t, String w, int y) {
		// metodo utilizado para meter libro en el inventario
		// como argumento le tengo que pasar todos los datos del libro
		
	}
	
	public void unregisterBook (int i) {
		// metodo utilizado para dar de baja un libro en el inventario
		// como argumento le paso el isbn que es el id del libro en DB
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	

}
	