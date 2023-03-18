package conversor;

import javax.swing.JOptionPane;

public class TipoDeCambio {
   
	// TIPO DE CAMBIO DE PESOS ARS$ A DOLAR, EURO, LIBRA, YEN,WON ****
	public void PesoADolar(double valorRecibido) {
		double dolar = valorRecibido / 371;

		dolar = (double) Math.round(dolar * 1000000) / 1000000.0; 

		JOptionPane.showMessageDialog(null, "$" + valorRecibido + " = US$" + dolar); 
	}

	public void PesoAEuro(double valorRecibido) {
		double euro = valorRecibido / 397;

		euro = (double) Math.round(euro * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, "$" + valorRecibido + " = €" + euro);
	}

	public void PesoALibra(double valorRecibido) {
		double libra = valorRecibido / 240;
		libra = (double) Math.round(libra * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, "$" + valorRecibido + " = £" + libra);
	}

	public void PesoAYen(double valorRecibido) {
		double yen = valorRecibido / 1.5;
		yen = (double) Math.round(yen * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, "$" + valorRecibido + " = ¥" + yen);
	}

	public void PesoAWon(double valorRecibido) {
		double won = valorRecibido / 0.15;
		won = (double) Math.round(won * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, "$" + valorRecibido + " = ₩" + won);
	}

	// TIPO DE CAMBIO DE DOLAR, EURO,LIBRA,YEN,WON, A PESOS ARS$ *****

	public void DolarAPeso(double valorRecibido) {
		double pesos = valorRecibido * 371;
		pesos = (double) Math.round(pesos * 1000000) / 1000000.0; // 2 decimales

		JOptionPane.showMessageDialog(null, "US$" + valorRecibido + " = $" + pesos); 
	}

	public void EuroAPeso(double valorRecibido) {
		double pesos = valorRecibido * 397;
		pesos = (double) Math.round(pesos * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, "€" + valorRecibido + " = $" + pesos);
	}

	public void LibraAPeso(double valorRecibido) {
		double pesos = valorRecibido * 0.15;
		pesos = (double) Math.round(pesos * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, "£" + valorRecibido + " = $" + pesos);
	}

	public void YenAPeso(double valorRecibido) {
		double pesos = valorRecibido * 1.5;
		pesos = (double) Math.round(pesos * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, "¥" + valorRecibido + " = $" + pesos);
	}

	public void WonAPeso(double valorRecibido) {
		double pesos = valorRecibido * 3.88;
		pesos = (double) Math.round(pesos * 1000000) / 1000000.0;
		JOptionPane.showMessageDialog(null, "₩" + valorRecibido + " = $" + pesos);
	}
}
