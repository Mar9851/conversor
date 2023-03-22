package conversor;

import javax.swing.JOptionPane;

public class MenuPrincipal {
	public static void inicio() {

	    Convertidor monedas = new Convertidor();
	    TipoDeMedida medida = new TipoDeMedida();
//	    FunctionTime tiempo = new FunctionTime();
//	    FunctionTemp temperatura = new FunctionTemp();

	    try {
	      String opciones;
	      	      
	      int menuSi = JOptionPane.YES_OPTION;

	      do {
	        opciones = (JOptionPane.showInputDialog(null, "Seleccione que desea convertir", "Menú ",
	            JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Monedas", "Medidas", "Tiempo" }, "Selección"))
	            .toString();
	        
	        

	        switch (opciones) {
	          case "Monedas": {

	            // validar que el valor ingresado sea un ##
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
								
							}
								
								
								
								break;
								
							case "Yardas a Metros":{
								
								String input = JOptionPane.showInputDialog("Ingrese las yardas a convertir");
								double yardasRecibidas = Double.parseDouble(input);
						            medida.yardasMetros(yardasRecibidas);
							}
								
								break;
							default:
								break;
							}
						}
							
						break;
							
							
							
						case "Medidas de Peso":
							
							break;
		
						default:
							break;
						}
	        	  
	          }
	        	 
	        	 
	        	  
//	            String input = JOptionPane.showInputDialog("Ingrese la T° a convertir");
//	            while (!esNumero(input)) {
//	              JOptionPane.showMessageDialog(null, "Ha ingresado un valor inválido", "Error", JOptionPane.ERROR_MESSAGE);
//	              input = JOptionPane.showInputDialog(null, "Por favor ingrese el valor");
//	            }
//
//	            double temperaturaRecibida = Double.parseDouble(input);
//	            temperatura.convertirTemperatura(temperaturaRecibida);
//
//	            int seleccion = JOptionPane.showConfirmDialog(null, "¿Quiere volver a convertir?");
//	            System.out.println(seleccion);
//	          }
//	            break;

//	          case "Tiempo": {
//	            String input = JOptionPane.showInputDialog("Ingrese el valor a convertir");
//	            while (!esNumero(input)) {
//	              JOptionPane.showMessageDialog(null, "Ha ingresado un valor inválido", "Error", JOptionPane.ERROR_MESSAGE);
//	              input = JOptionPane.showInputDialog(null, "Por favor ingrese el valor");
//	            }
//
//	            double tiempoRecibido = Double.parseDouble(input);
//	            tiempo.convertirTiempo(tiempoRecibido);
//
//	            int seleccion = JOptionPane.showConfirmDialog(null, "¿Quiere volver a convertir?");
//	            System.out.println(seleccion);
//	          }
//	            break;
//
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
