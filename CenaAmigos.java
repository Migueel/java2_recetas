
import java.util.*;


public class CenaAmigos{
	public static void main(String[] args) {

		int numRecetas;
		int numIngredientes;

		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuantas recetas utilizarás?");
		numRecetas = sc.nextInt();

		for (int r=0;r<numRecetas;r++) {
			
			String nombreReceta;
			ArrayList<Ingrediente> ingredientes;
			String preparacion;

			Receta receta = new Receta();
			
			System.out.println("Introduce el nombre de la receta");
			nombreReceta = sc.next();

			receta.setNombreReceta(nombreReceta);

			System.out.println("¿Cuantos ingredientes emplearás?");
			numIngredientes = sc.nextInt();

			for (int i=0;i<numIngredientes;i++) {
				
				String nombreIngrediente;
				int cantidadGramos;
				int cantidadUnidad;
				boolean enGramos;

				Ingrediente ingrediente = new Ingrediente();
				
				System.out.println("Introduce el nombre del ingrediente");
				nombreIngrediente = sc.next();

				ingrediente.setNombreIngrediente(nombreIngrediente);

				
				System.out.println("¿Medirás la cantidad de este ingrediente en gramos o unidades?");
					enGramos = sc.nextBoolean();

				ingrediente.setEnGramos(enGramos);

				if (enGramos = true) {
					System.out.println("Introduce la cantidad (en gramos) que utilizaras de este ingrediente");
					cantidadGramos = sc.nextInt();

					ingrediente.setCantidadGramos(cantidadGramos);
				}
				else {
					System.out.println("Introduce la cantidad (en unidades) que utilizaras de este ingrediente");
					cantidadUnidad = sc.nextInt();

					ingrediente.setCantidadUnidad(cantidadUnidad);
				}
				ArrayList<Ingrediente> ingrediente = new ArrayList<Ingrediente>();
					ingrediente.add(nombreIngrediente);
					
					if (enGramos = true) {
						ingrediente.add(cantidadGramos)		
					}
					else {
						ingrediente.add(cantidadUnidad)	
					}


			}
			System.out.println("Introduce el metodo de preparacion de esta receta");
			preparacion = sc.next();

			receta.setPreparacion(preparacion);

			ArrayList<Receta> = new ArrayList<Receta>();
			receta.add(nombreReceta);
			receta.add(ingredientes);
			receta.add(preparacion);

		



		}
		
	




















	}	
}
