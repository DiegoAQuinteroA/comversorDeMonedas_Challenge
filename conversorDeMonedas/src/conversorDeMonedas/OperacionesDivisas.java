package conversorDeMonedas;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * guarda las operaciones matematicas para la convercion de pesos Colombianos a las divisas.
 * @author Diego
 *
 */
public class OperacionesDivisas{
	
	DecimalFormat redondear = new DecimalFormat("#.####");
	
	/**
	 * convierte de peso Colombiano a Dolares
	 * @param valorDouble valor ingresado por el usuario
	 */
	public void dolar (double valorDouble) {
		double resultado = valorDouble / 4157.35;
		JOptionPane.showMessageDialog(null, redondear.format(resultado) + " Dolares");
	}
	
	/**
	 * convierte de peso Colombiano a Euros
	 * @param valorDouble valor ingresado por el usuario
	 */
	public void euro (double valorDouble) {
		double resultado = valorDouble / 4626.83;
		JOptionPane.showMessageDialog(null, redondear.format(resultado) + " Euros");
	}
	
	/**
	 * convierte de peso Colombiano a Libra Esterlina
	 * @param valorDouble valor ingresado por el usuario
	 */
	public void libraEsterlina (double valorDouble) {
		double resultado = valorDouble / 5402.70;
		JOptionPane.showMessageDialog(null, redondear.format(resultado) + " Libra Esterlina");
	}
	
	/**
	 * convierte de peso Colombiano a Yen Japones
	 * @param valorDouble valor ingresado por el usuario
	 */
	public void yenJapones (double valorDouble) {
		double resultado = valorDouble / 30.07;
		JOptionPane.showMessageDialog(null, redondear.format(resultado) + " Yen Japones");
	}
	
	/**
	 * convierte de peso Colombiano a won Sul Coreano
	 * @param valorDouble valor ingresado por el usuario
	 */
	public void wonSulCoreano (double valorDouble) {
		double resultado = valorDouble / 0.31;
		JOptionPane.showMessageDialog(null, redondear.format(resultado) + " won Sul Coreano");
	}
}
