package conversor;

import javax.swing.JOptionPane;
public class Convertidor {
  
	


	

	TipoDeCambio monedas = new TipoDeCambio();

		public void ConvertirMoneda(double Valor) {

			String opciones = (JOptionPane.showInputDialog(null, "Seleccione la moneda a convertir", "monedas ",
					JOptionPane.PLAIN_MESSAGE, null, new Object[] {
							"Peso Ars a Dólar", "Peso Ars a Euro", "Peso Ars a Libra esterlina", "Peso Ars a Yen", "Peso Ars a Won",
							"Dólar a Peso Ars", "Euro a Peso Ars", "Libra esterlina a Peso Ars", "Yen a Peso Ars",
							"Won a Peso Ars"
					}, "Selección")).toString();

			switch (opciones) {
				case "Peso Ars a Dólar":
				monedas.PesoADolar(Valor);
					break;
				case "Peso Ars a Euro":
					monedas.PesoAEuro(Valor);
					break;
				case "Peso Ars a Libra esterlina":
					monedas.PesoALibra(Valor);
					break;
				case "Peso Ars a Yen":
					monedas.PesoAYen(Valor);
					break;
				case "Peso Ars a Won":
					monedas.PesoAWon(Valor);
					break;
				case "Dólar a Peso Ars":
					monedas.DolarAPeso(Valor);
					break;
				case "Euro a Peso Ars":
					monedas.EuroAPeso(Valor);
					break;
				case "Libra esterlina a Peso Ars":
					monedas.LibraAPeso(Valor);
					break;
				case "Yen a Peso Ars":
					monedas.YenAPeso(Valor);
					break;
				case "Won a Peso Ars":
					monedas.WonAPeso(Valor);
					break;
				default:
					break;
			}
		}
	}

