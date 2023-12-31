package inicio;

import javax.swing.JOptionPane;

/**
 * guarda y muestra las elecciones que el usuario a escogido.
 * @author Diego
 *
 */
public class Formularios {

	/**
	 * toma y devuelve como resultado el valor selececcionado de la lista por el usuario.
	 * 
	 * @param eleccionLista lista con las opciones que puede seleccionar el usuario.
	 * @return retorna el valor elegido por el usuario de la lista suministrada.
	 */
	public String formularioLista(String [] eleccionLista) {
		
		return (String) JOptionPane.showInputDialog(null,"Seleccione una opcion?", 
				"Elegir",JOptionPane.QUESTION_MESSAGE,null,eleccionLista, eleccionLista[0]);
	}
	/**
	 * toma el valor ingresado por el usuario, lo comvierte a double, en ese proseso pueden surgir algunos errores
	 * los cuales manejamos con el try catch y damos una respuesta para el error.
	 * 
	 * @return retorna el valor ingresado por el usuario comvertido a double
	 */
	public double formularioValor() {
		double valorDouble = 0;
		String valor =JOptionPane.showInputDialog(null, "Digite el valor a comvertir", valorDouble);
		
		try {
			valorDouble = Double.valueOf(valor);
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor no valido");
			
		}catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
		}
		return valorDouble;
	}
	
	/**
	 * pregunta al usuariosi desea continuar con el programa.
	 * @return retorna un boolean para confirmar si el programa se seguira ejecutando
	 */
	public boolean confirmarContinuarPrograma() {
		
		int confirmarContinuarPrograma = JOptionPane.showConfirmDialog(null, "Quieres seguir usando el programa?", 
				"confirmar", JOptionPane.YES_NO_CANCEL_OPTION);

		if(confirmarContinuarPrograma == JOptionPane.NO_OPTION || confirmarContinuarPrograma == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Programa Finalizado");
			
			return false;
		}
		return true;
		
	}
}
