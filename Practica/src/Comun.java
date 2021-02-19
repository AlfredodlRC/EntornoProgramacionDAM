import java.util.ArrayList;


public class Comun {

	Double acumulador = Double.valueOf(0);
	private ArrayList<String> clases = new ArrayList<String>();
	
	
	public Comun() {
		clases.add("class java.lang.Byte");
		clases.add("class java.lang.Short");
		clases.add("class java.lang.Integer");
		clases.add("class java.lang.Long");
		clases.add("class java.lang.Float");
		clases.add("class java.lang.Double");
		
	}
	
	protected boolean DatoCorrecto(Object dato) {
		boolean resultado = true;
		
		if (dato == null) {
			resultado = false;
		}
		

		return resultado;
	}
	


}
