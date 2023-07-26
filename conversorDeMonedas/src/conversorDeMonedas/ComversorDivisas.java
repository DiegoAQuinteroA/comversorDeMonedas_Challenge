package conversorDeMonedas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * guarda las operaciones matematicas para comvertir el valor ingresado a la divisa seleccionada.
 * @author Diego
 *
 */
public class ComversorDivisas {

	
	private double dolar = 4157.35;
	private double euro = 4626.83;
	private double libraEsterlina = 5402.70;
	private double yenJapones = 30.07;
	private double wonSulCoreano = 0.31;
	
	private String [] ListacomvercionADivisas = {
			"peso Colombiano a Dolares",
			"peso Colombiano a Euros", 
			"peso Colombiano a Libra Esterlina",
			"peso Colombiano a Yen Japones",
			"peso Colombiano a won Sul Coreano",
		
			"Dolares a peso Colombiao",
			"Euros a peso Colombiao",
			"Libra Esterlina a peso Colombiao",
			"Yen Japones a peso Colombiao",
			"won Sul Coreano a peso Colombiao",
	};
	
	
	public String[] getListacomvercionADivisas() {
		return ListacomvercionADivisas;
	}
	
	/**
	 * objeto que redondea a 4 decimales
	 */
	DecimalFormat redondear = new DecimalFormat("#.####");
	
	
	/**
	 * operaciones matematicas para combertir de pesos colombianos a las diferentes divisas
		 * -Dolar
		 * -Euro
		 * -Libra Esterlina
		 * -Yen Japones
		 * -won Sul Coreano
	 * @param valorDouble valor ingresado por el usuario convertido a double
	 * @param comvercionADivisas divisa seleccionada por el usuario a la cual desea comvertir
	 */
	public void comvetirADivisas (double valorDouble, String comvercionADivisas) {
		if(comvercionADivisas == "peso Colombiano a Dolares") {
			double resultado = valorDouble / this.dolar;
			JOptionPane.showMessageDialog(null, redondear.format(resultado) + " Dolares");
		}else if (comvercionADivisas == "peso Colombiano a Euros") {
			double resultado = valorDouble / this.euro;
			JOptionPane.showMessageDialog(null, redondear.format(resultado) + " Euros");
		}else if (comvercionADivisas == "peso Colombiano a Libra Esterlina") {
			double resultado = valorDouble / this.libraEsterlina;
			JOptionPane.showMessageDialog(null, redondear.format(resultado) + " Libra Esterlina");
		}else if (comvercionADivisas == "peso Colombiano a Yen Japones") {
			double resultado = valorDouble / this.yenJapones;
			JOptionPane.showMessageDialog(null, redondear.format(resultado) + " Yen Japones");
		}else if (comvercionADivisas == "peso Colombiano a won Sul Coreano") {
			double resultado = valorDouble / this.wonSulCoreano;
			JOptionPane.showMessageDialog(null, redondear.format(resultado) + " won Sul Coreano");
		}
	}
	
	/**
	 * operaciones matematicas para combertir de las diferentes visas a pesos colombianos
	 * @param valorDouble valor ingresado por el usuario convertido a double
	 * @param comvercionADivisas divisa seleccionada por el usuario a la cual desea comvertir
	 */
	public void comvertirAPesosColombianos(double valorDouble, String comvercionADivisas) {
		if(comvercionADivisas == "Dolares a peso Colombiao") {
			double resultado = valorDouble * this.dolar;
			JOptionPane.showMessageDialog(null, redondear.format(resultado) + " Peso Colombiao");
		}else if (comvercionADivisas == "Euros a peso Colombiao") {
			double resultado = valorDouble * this.euro;
			JOptionPane.showMessageDialog(null, redondear.format(resultado) + " Peso Colombiao");
		}else if (comvercionADivisas == "Libra Esterlina a peso Colombiao") {
			double resultado = valorDouble * this.libraEsterlina;
			JOptionPane.showMessageDialog(null, redondear.format(resultado) + " Peso Colombiao");
		}else if (comvercionADivisas == "Yen Japones a peso Colombiao") {
			double resultado = valorDouble * this.yenJapones;
			JOptionPane.showMessageDialog(null, redondear.format(resultado) + " Peso Colombiao");
		}else if (comvercionADivisas == "won Sul Coreano a peso Colombiao") {
			double resultado = valorDouble * this.wonSulCoreano;
			JOptionPane.showMessageDialog(null, redondear.format(resultado) + " Peso Colombiao");
		}
	}
	
}
