package Menu;

import javax.swing.JOptionPane;

import ConversorMedida.TipoDeMedida;
import ConversorTemperatura.ConvertidorTemp;
import ConversorTemperatura.TipoDeTemperatura;
import ConversorTiempo.ConvertidorDeTiempo;
import conversorMoneda.Convertidor;

public class MenuPrincipal {
	public static void inicio() {

	    Convertidor monedas = new Convertidor();
	    TipoDeMedida medida = new TipoDeMedida();
	    ConvertidorDeTiempo tiempo = new ConvertidorDeTiempo();
	    ConvertidorTemp temperatura = new ConvertidorTemp();

	    try {
	      String opciones;
	      	      
	      int menuSi = JOptionPane.YES_OPTION;

	      do {
	        opciones = (JOptionPane.showInputDialog(null, "Seleccione que desea convertir", "Menú ",
	            JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Monedas", "Medidas", "Temperatura", "Tiempo"}, "Selección"))
	            .toString();
	        
	        

	        switch (opciones) {
	          case "Monedas": {

	            
	            String input = JOptionPane.showInputDialog("Ingrese cantidad a convertir");

	            while (!esNumero(input)) {
	              JOptionPane.showMessageDialog(null, "Ha ingresado un valor inválido", "Error", JOptionPane.ERROR_MESSAGE);
	              input = JOptionPane.showInputDialog(null, "Por favor ingrese el monto");
	            }

	            double valor = Double.parseDouble(input);
	            monedas.ConvertirMoneda(valor);

	            int seleccion = JOptionPane.showConfirmDialog(null, "¿Quiere volver a convertir?");
	            System.out.println(seleccion);

	          }
	            break;

	          case "Medidas": {
	        	  String opcionMedida = (JOptionPane.showInputDialog(null, "Seleccione la medida que desea convertir", "Menu ",
	         	            JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Medidas de Longitud", "Medidas de Peso" }, "Selección"))
	         	            .toString();
	        	  
	        	  switch (opcionMedida) {
						case "Medidas de Longitud":{
							
							String longitud = (JOptionPane.showInputDialog(null, "Seleccione medida longitud que desea convertir", "Menu ",
			         	            JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Pulgadas a Milimetros", "Yardas a Metros" }, "Selección"))
			         	            .toString();
							
							
							switch (longitud) {
							case "Pulgadas a Milimetros":{
								String input = JOptionPane.showInputDialog("Ingrese las pulgadas a convertir");
								double pulgadasRecibidas = Double.parseDouble(input);
						            medida.pulgadasMilimetros(pulgadasRecibidas);
						            
						            int seleccion = JOptionPane.showConfirmDialog(null, "¿Quiere volver a convertir?");
						            System.out.println(seleccion);
								
							}
								
							break;
								
							case "Yardas a Metros":{
								
								String input = JOptionPane.showInputDialog("Ingrese las yardas a convertir");
								double yardasRecibidas = Double.parseDouble(input);
								medida.yardasMetros(yardasRecibidas);
								
								int seleccion = JOptionPane.showConfirmDialog(null, "¿Quiere volver a convertir?");
					            System.out.println(seleccion);
							}
							
							break;
							default:
								break;
							}
						}
						
						break;
						
						case "Medidas de Peso":{
							
							
							String peso = (JOptionPane.showInputDialog(null, "Seleccione medida de peso que desea convertir", "Menu ",
			         	            JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Onzas a Gramos", "Libras a Kilos" }, "Selección"))
			         	            .toString();
							
							
							switch (peso) {
							case "Onzas a Gramos":{
								String input = JOptionPane.showInputDialog("Ingrese las onzas a convertir");
								double onzasRecibidas = Double.parseDouble(input);
						            medida.onzasGramos(onzasRecibidas);
						            
						            int seleccion = JOptionPane.showConfirmDialog(null, "¿Quiere volver a convertir?");
						            System.out.println(seleccion);
								
							}
								
							break;
								
							case "Libras a Kilos":{
								
								String input = JOptionPane.showInputDialog("Ingrese las libras a convertir");
								double librasRecibidas = Double.parseDouble(input);
								medida.librasKilogramos(librasRecibidas);
								
								int seleccion = JOptionPane.showConfirmDialog(null, "¿Quiere volver a convertir?");
					            System.out.println(seleccion);
							}
							
							break;
							default:
								break;
							}
						}
							
							
	        	  }
	        	  
	          }
	          
	          break;
	          
	          
	          case "Temperatura":{
	        	  
	        	  String input = JOptionPane.showInputDialog("Ingrese la T° a convertir");
		            while (!esNumero(input)) {
		              JOptionPane.showMessageDialog(null, "Ha ingresado un valor inválido", "Error", JOptionPane.ERROR_MESSAGE);
		              input = JOptionPane.showInputDialog(null, "Por favor ingrese el valor");
		            }

		            double temperaturaRecibida = Double.parseDouble(input);
		            temperatura.convertirTemperatura(temperaturaRecibida);

		            int seleccion = JOptionPane.showConfirmDialog(null, "¿Quiere volver a convertir?");
		            System.out.println(seleccion);
		          }
		            break;
	        	  
	          
	          case "Tiempo": {
	            String input = JOptionPane.showInputDialog("Ingrese el valor a convertir");
	            while (!esNumero(input)) {
	              JOptionPane.showMessageDialog(null, "Ha ingresado un valor inválido", "Error", JOptionPane.ERROR_MESSAGE);
	              input = JOptionPane.showInputDialog(null, "Por favor ingrese el valor");
	            }

	            double tiempoRecibido = Double.parseDouble(input);
	            tiempo.convertirTiempo(tiempoRecibido);

	            int seleccion = JOptionPane.showConfirmDialog(null, "¿Quiere volver a convertir?");
	            System.out.println(seleccion);
	          }
	            break;

	          default:
	        	  break;
	        }
	      } while (JOptionPane.YES_OPTION == menuSi);
	    } catch (Exception e) {
	    	JOptionPane.showMessageDialog(null, "¡Gracias por su visita!");
	    }
	}
						
						
								
								
	        	 
	        	 
	        	  
	            


	  

	// VALIDO QUE VALORES SEAN NÚMEROS
	  private static boolean esNumero(String num) {
	    try {
	      Double.parseDouble(num);
	      return true;
	    } catch (NumberFormatException nfe) {
	      return false;
	    }
	  }
}
