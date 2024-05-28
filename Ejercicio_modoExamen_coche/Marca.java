package examen;

public enum Marca {
	SE ("Seat"),HO ("Honda"),KI ("Kia"),M4 ("Marca4"),M5 ("Marca5"),;
	
	private String nombreLargoMarca;

	private Marca(String nombreLargoMarca) {
		this.nombreLargoMarca = nombreLargoMarca;
	}

	public String getNombreLargoMarca() {
		return nombreLargoMarca;
	}	
}
