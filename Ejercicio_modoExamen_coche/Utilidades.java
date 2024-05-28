package examen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Utilidades {
	
	public static List<Coche> generaLista(short s) {
		List<Coche> listaCoches = new ArrayList<>();
		while (listaCoches.size()<s) {
			try {
				listaCoches.add(new Coche());
			} catch (CombinacionInvalidaException e) {}
		}		
		return listaCoches;
	}
	
	
	public static void show(List<Coche> lista, Predicate<Coche> filtro) {
		lista.stream()
				.filter(filtro)
				.sorted(Comparator.comparing(Coche::getId).reversed())
				.map(c->  "-> Coche " + c.getMarca()+ " " + c.getColor() + " con id " + c.getId())
				.toList()
				.forEach(System.out::println);
	}
	
	public static List<Coche> cochesUnicos(List<Coche> lista){
		return lista.stream()
				.distinct()					
				.toList();
	}
	
	public static Optional<Coche> cocheIguales(List<Coche> lista, Coche coche) {
		 return lista.stream()
					.filter(c -> c.equals(coche))
					.findFirst();
	}
	
	public static void main(String[] args) {
		List<Coche> listaDeCoches = generaLista((short)6);
		//listaDeCoches.forEach(System.out::println);
		listaDeCoches.stream()
					.sorted(Comparator.comparing(Coche::getId).reversed())
					.forEach(System.out::println);
		
		System.out.println("-----------------------------------------------------------");
		show(listaDeCoches, c -> c.getAnioFabricacion() > 2005);
		
		System.out.println("-----------------------------------------------------------");
		System.out.println(cocheIguales(listaDeCoches, listaDeCoches.get(0)).get());
		
		System.out.println("-----------------------------------------------------------");
		cochesUnicos(listaDeCoches).forEach(System.out::println);
		
	}
}
