

/**
 * 
 * @author Alfredo de los Rios Carrizo
 * @version 1.0
 * 
 *  Clase que realiza operaciones relaccionadas con la divisi�n 
 * 
 */

public class Division {

	
	
	//
	// Atributo propiedad para las clases suma,resta y producto con un
	// contructor para poder inicializarlo
	//
	
	//private double acumulador;
	
	//public Division(double acumulador) {
	//	super();
	//	this.acumulador = acumulador;		
	//}
	
	
	/**
	 * Contructor sin parametros de la clase
	 */
	public Division() {
		super();
	}

	/**
	 * M�todo que realiza la divisi�n entre dos n�meros enteros que devuelve
	 * otro n�mero entero obviando la parte fraccionaria.
	 *<br>
	 * Acepta n�meros negativos en ambos operandos devolviendo negativo si solo
	 * uno de los parametros es negativo y positivo si ambos son negativos.
	 *<br>
	 * Si el denominador es cero la funci�n devolver� cero.
	 *<br> 
	 * Si el divisor es cero devolver� se generar� una excepcion
	 * IllegalArgumentException.
	 *<br>
	 * Si alguno de los parametros de entrada es null o no est� inicializado
	 * se generar� una excepcion IllegalArgumentException.
	 * 
	 * @param denominador -> parametro que ser� dividido por el segundo parametro.
	 * @param divisor -> parametro que divide al primer parametro.
	 * @return devuelve la parte entera de la divisi�n de los dos parametros.
	 * @throws IllegalArgumentException se generar� est� excepci�n cuando se introduzca
	 * un parametro no deseado
	 * 
	 */
	public long dividir(int denominador, int divisor) {
		long resultado = 0;
		
		return resultado;
	}
	
	/**
	 * M�todo que realiza la divisi�n entre dos n�meros reales que devuelve
	 *  otro n�mero real incorporando la parte fraccionaria.
	 *<br>
	 * Acepta n�meros negativos en ambos operandos devolviendo negativo si solo
	 * uno de los parametros es negativo y positivo si ambos son negativos.
	 *<br>
	 * Si el denominador es cero la funci�n devolver� cero.
	 *<br>
	 * Si el divisor es cero devolver� se generar� una excepcion
	 * IllegalArgumentException.
	 *<br> 
	 * Si alguno de los parametros de entrada es null o no est� inicializado
	 * se generar� una excepcion IllegalArgumentException.
	 * 
	 *  
	 * @param denominador -> parametro que ser� dividido por el segundo parametro. 
	 * @param divisor -> parametro que divide al primer parametro.
	 * @return resultado de la divisi�n de los 2 parametros de entrada.
	 * @throws IllegalArgumentException se generar� est� excepci�n cuando se introduzca
	 * un parametro no deseado
	 * 
	 */
	public double dividir(double denominador, double divisor) {
		double resultado = 0;
		
		return resultado;
	}

	/**
	 * M�todo que calcula el n�mero inverso (1/n) del n�mero dado como parametro.
	 * Devuelve un n�mero real.
	 *<br>
	 * Si el parametro de entrada es negativo devolver� un n�mero negativo.
	 *<br>
	 * Si el parametro es cero la funci�n devolver� cero.
	 *<br>
	 * Si el parametros de entrada es null o no est� inicializado
	 * se generar� una excepcion IllegalArgumentException.
	 * 
	 * @param numero -> parametro del cual calcularemos el inverso.
	 * @return devuelve el inverso del parametro de entrada (1 / numero).
	 * @throws IllegalArgumentException se generar� est� excepci�n cuando se introduzca
	 * un parametro no deseado
	 * 
	 */
	public double inverso(double numero) {
		double resultado = 0;
		
		return resultado;
	}
	
	/**
	 * M�todo que calcula la raiz cuadrada del n�mero dado como parametro.
	 * Devuelve un n�mero real.
	 *<br>
	 * Si el parametro de entrada es negativo provocar� una excepci�n.
	 *<br>
	 * Si el parametros de entrada es null o no est� inicializado
	 * se generar� una excepcion IllegalArgumentException.
	 * 
	 * @param numero -> parametro al cual aplicar la raiz cuadrada.
	 * @return devuelve la raiz cuadrada del parametro introducido.
	 * @throws IllegalArgumentException se generar� est� excepci�n cuando se introduzca
	 * un parametro no deseado
	 * 
	 */
	public double raiz(double numero) {
		double resultado = 0;
		
		return resultado;
	}
	
	
	
}
