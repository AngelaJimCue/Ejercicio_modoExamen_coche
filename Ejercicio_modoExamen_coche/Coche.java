package examen;

import java.util.Objects;
import java.util.Random;

public class Coche implements Comparable<Coche>{

	private Marca marca;
	private Color color; 
	private short anioFabricacion;
	private int id;
	
	private static int idStatic = 1;
	private Random random = new Random();
	
	
	public Coche() throws CombinacionInvalidaException {
		this.marca = marca.values()[random.nextInt(marca.values().length)];
			if (marca.equals(Marca.SE)) throw new CombinacionInvalidaException();
		this.color = color.values()[random.nextInt(color.values().length)];
			if (color.equals(Color.RO)) throw new CombinacionInvalidaException();
		this.anioFabricacion = (short) (random.nextInt(2024-1998)+1998);
		this.id = idStatic++;
	}

	public Marca getMarca() {
		return marca;
	}
	public Color getColor() {
		return color;
	}
	public short getAnioFabricacion() {
		return anioFabricacion;
	}
	public int getId() {
		return id;
	}
	public static int getIdStatic() {
		return idStatic;
	}
	public Random getRandom() {
		return random;
	}



	@Override
	public int compareTo(Coche o) {
		if (this.marca.compareTo(o.marca) == 0) return this.marca.compareTo(o.marca);
		return this.marca.compareTo(o.marca);
	}


	@Override
	public int hashCode() {
		return Objects.hash(color, marca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return color == other.color && marca == other.marca && id==other.id;
	}

	@Override
	public String toString() {
		return String.format("Coche %S %S con id %d.", marca.getNombreLargoMarca(),color.getNombreLargoColor(),id);
	}
}
