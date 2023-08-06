package conversorTemperaturas;

/**
 * guarda el metodo que permite ejecutar las operaciones de convercion de temperaturas
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
	
	OperacionesTemperaturas temperaturas = new OperacionesTemperaturas();
	
	public String[] getListaComvercionTemperatura() {
		return ListaComvercionTemperatura;
	}
	
	/**
	 * ejecuta la operacion matematica de convercion de temperatura seleccionada por el usuario.
	 * @param opcionDeLaLista opcion seleccionada por el usuario de la lista "ListaComvercionTemperatura".
	 * @param valorDouble valor ingresado por el usuario convertido a double
	 */
	public  void comvertirtemperaturas(String opcionDeLaLista, double valorDouble) {
		
		switch (opcionDeLaLista) {
		case "comvertir ºC a ºF": {
			temperaturas.celciusAf(valorDouble);
			break;
		}
		case "convertir ºF a ºC": {
			temperaturas.farenheitAc(valorDouble);
			break;
		}
		case "convertir K a ºC": {
			temperaturas.kelvinAc(valorDouble);
			break;
		}
		case "convertir ºC a K": {
			temperaturas.celciusAk(valorDouble);
			break;
		}
		}
	}
}
