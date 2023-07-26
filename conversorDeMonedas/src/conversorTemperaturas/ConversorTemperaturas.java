package conversorTemperaturas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * guarda las operaciones matematicas para realizar las comversiones 
 * segun los valores suministrados a los parametros
 * @author Diego
 *
 */
public class ConversorTemperaturas {
	
	private String [] ListaComvercionTemperatura = {
			"comvertir ºC a ºF",
			"convertir ºF a ºC",
			"convertir K a ºC",
			"convertir ºC a K"
	};
	
	public String[] getListaComvercionTemperatura() {
		return ListaComvercionTemperatura;
	}

	/**
	 * objeto que redondea a 4 decimales
	 */
	DecimalFormat redondear = new DecimalFormat("#.####");
	
	/**
	 * comvierte el valor ingresado a la unidad seleccionada.
	 * @param comvercionTemperatura opcion seleccionada por el usuario, es la unidad a comvertir.
	 * @param valorDouble valor ingresado por el usuario convertido a double
	 */
	public void comvertirtemperaturas(String comvercionTemperatura, double valorDouble) {

		if(comvercionTemperatura == "comvertir ºC a ºF") {
			double resultado =  valorDouble * 1.8 + 32;
			JOptionPane.showMessageDialog(null, redondear.format(resultado)+ " ºF");
			
		}else if(comvercionTemperatura == "convertir ºF a ºC") {
			double resultado = (valorDouble - 32) / 1.8;
			JOptionPane.showMessageDialog(null, redondear.format(resultado) + " ºC");
			
		}else if(comvercionTemperatura == "convertir K a ºC") {
			double resultado =  valorDouble - 273.15;
			JOptionPane.showMessageDialog(null, redondear.format(resultado) + " ºC");
			
		}else if(comvercionTemperatura == "convertir ºC a K") {
			double resultado = valorDouble + 273.15;
			JOptionPane.showMessageDialog(null, redondear.format(resultado) + " K");
		}
	}
}
