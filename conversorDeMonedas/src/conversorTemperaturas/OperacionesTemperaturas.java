package conversorTemperaturas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * guarda los metodos que contiene las operaciones matematicas, estos permiten realizar 
 * las converciones de temperaturas.
 * @author Diego
 *
 */
public class OperacionesTemperaturas{

	DecimalFormat redondear = new DecimalFormat("#.####");
	
	/**
	 * comvertir ºC a ºF
	 * @param valorDouble valor ingresado por el usuario
	 */
	public void celciusAf(double valorDouble) {
		double resultado =  valorDouble * 1.8 + 32;
		JOptionPane.showMessageDialog(null, redondear.format(resultado)+ " ºF");
	}
	
	/**
	 * convertir ºF a ºC
	 * @param valorDouble valor ingresado por el usuario
	 */
	public void farenheitAc(double valorDouble) {
		double resultado = (valorDouble - 32) / 1.8;
		JOptionPane.showMessageDialog(null, redondear.format(resultado) + " ºC");
	}
	
	/**
	 * convertir K a ºC
	 * @param valorDouble valor ingresado por el usuario
	 */
	public void kelvinAc(double valorDouble) {
		double resultado =  valorDouble - 273.15;
		JOptionPane.showMessageDialog(null, redondear.format(resultado) + " ºC");
	}
	
	/**
	 * convertir ºC a K
	 * @param valorDouble valor ingresado por el usuario
	 */
	public void celciusAk(double valorDouble) {
		double resultado = valorDouble + 273.15;
		JOptionPane.showMessageDialog(null, redondear.format(resultado) + " K");
	}
}
