package inicio;

import javax.swing.JOptionPane;

import conversorTemperaturas.ConversorTemperaturas;
import conversorDeMonedas.*;

/**
 * ejecuta el programa
 * @author Diego
 *
 */
public class Inicio {
	
	public static void main(String[] args) {
		
		ComversorDivisas conversorDivisa = new ComversorDivisas();
		ConversorTemperaturas conversorTemperaturas = new ConversorTemperaturas();
		Formularios formularios = new Formularios();
		
		String [] opciones = {"Comvertir divisas", "Comvertir temperaturas", "salir"};
		
		int elejirOpcion = JOptionPane.showOptionDialog(null,"Seleccione una opcion?", 
				"Elegir",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null,opciones, opciones[0]);
		
		if(elejirOpcion == 2) {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
			System.exit(0);
		}
		
		if(elejirOpcion == 0) {
			
			boolean continuarPrograma = true;
			
			while (continuarPrograma) {
	
				
				String eleccionValorLista = formularios.formularioLista(conversorDivisa.getListacomvercionADivisas());
				Double valorIngresado = formularios.formularioValor();
			
				conversorDivisa.comvetirADivisas(valorIngresado, eleccionValorLista);
				conversorDivisa.comvertirAPesosColombianos(valorIngresado, eleccionValorLista);
				
				continuarPrograma = formularios.confirmarContinuarPrograma();
				
			}
			
		}
		
		if(elejirOpcion == 1) {
			
			boolean continuarPrograma = true;
			
			while (continuarPrograma) {
				
				String eleccionValorLista = formularios.formularioLista(conversorTemperaturas.getListaComvercionTemperatura());
				Double valorIngresado = formularios.formularioValor();
				
				conversorTemperaturas.comvertirtemperaturas(eleccionValorLista, valorIngresado);
				
				continuarPrograma = formularios.confirmarContinuarPrograma();
			}
			
		}
	}	
}
