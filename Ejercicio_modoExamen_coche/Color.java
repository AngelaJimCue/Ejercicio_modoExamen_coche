package examen;

public enum Color {
	RO("rojo"),AM ("amarillo"),AZ ("azul"),BL("blanco"),NE ("negro"),;
	
	
	private String nombreLargoColor;

	private Color(String nombreLargoColor) {
		this.nombreLargoColor = nombreLargoColor;
	}

	public String getNombreLargoColor() {
		return nombreLargoColor;
	}
	
	
}
