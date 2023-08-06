package conversorDeMonedas;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * guarda las operaciones matematicas para la convercion de las divisas a pesos Colimbianos
 * @author Diego
 *
 */
public class OperacionesPesosCol{
	DecimalFormat redondear = new DecimalFormat("#.####");
	
	/**
	 * convierte de Dolares a peso Colombiao
	 * @param valorDouble valor ingresado por el usuario
	 */
	public void dolarApesos( double valorDouble) {
		double resultado = valorDouble * 4157.35;
		JOptionPane.showMessageDialog(null, redondear.format(resultado) + " Peso Colombiao");
	}
	
	/**
	 * convierte de Euros a peso Colombiao
	 * @param valorDouble valor ingresado por el usuario
	 */
	public void euroApesos( double valorDouble) {
		double resultado = valorDouble * 4626.83;
		JOptionPane.showMessageDialog(null, redondear.format(resultado) + " Peso Colombiao");
	}
	
	/**
	 * convierte de Libra Esterlina a peso Colombiao
	 * @param valorDouble valor ingresado por el usuario
	 */
	public void libraEsterlinaApesos( double valorDouble) {
		double resultado = valorDouble * 5402.70;
		JOptionPane.showMessageDialog(null, redondear.format(resultado) + " Peso Colombiao");
	}
	
	/**
	 * convierte de Yen Japones a peso Colombiao
	 * @param valorDouble valor ingresado por el usuario
	 */
	public void yenJaponesApesos( double valorDouble) {
		double resultado = valorDouble * 30.07;
		JOptionPane.showMessageDialog(null, redondear.format(resultado) + " Peso Colombiao");
	}
	
	/**
	 * convierte de won Sul Coreano a peso Colombiao
	 * @param valorDouble valor ingresado por el usuario
	 */
	public void wonSulCoreanoApesos( double valorDouble) {
		double resultado = valorDouble * 0.31;
		JOptionPane.showMessageDialog(null, redondear.format(resultado) + " Peso Colombiao");
	}

}
