import java.util.ArrayList;

public class Receta {
	private String nombreReceta;
	ArrayList<Ingrediente> ingredientes;
	private String preparacion;

	public Receta(){

	}
	
	public Receta(String nombreReceta, ArrayList<Ingrediente> ingrediente, String preparacion){
		this.nombreReceta = nombreReceta;
		this.preparacion = preparacion;
		this.ingredientes = ingredientes;
	}
	public String getNombreReceta(){
		return nombreReceta;
	}
	public void setNombreReceta(String nombreReceta){
		this.nombreReceta = nombreReceta;
	}
	public ArrayList<Ingrediente> getIngredientes(){
		return ingredientes;
	}
	public void setIngredientes(ArrayList<Ingrediente> ingredientes){
		this.ingredientes = ingredientes;
	}

	public String getPreparacion(){
		return preparacion;
	}
	public void setPreparacion(String preparacion){
		this.preparacion = preparacion;
	}

}