package ConversorTiempo;

import javax.swing.JOptionPane;

public class UnidadesDeTiempo {

	
	public void segundosMinutos(double valorRecibido) {
		double minutos = valorRecibido / 60;
		minutos = (double) Math.round(minutos * 1000000) / 1000000.0; 

		JOptionPane.showMessageDialog(null, valorRecibido + " segundo/s = " + minutos + " minuto/s"); 
		
	}

	public void minutosHoras(double valorRecibido) {
		double horas = valorRecibido / 60;
		horas = (double) Math.round(horas * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, valorRecibido + " minuto/s = " + horas + " hora/s");
	}

	public void horasDias(double valorRecibido) {
		double dias = valorRecibido / 24; 
		dias = (double) Math.round(dias * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, valorRecibido + " hora/s = " + dias + " día/s");
	}

	public void minutosSegundos(double valorRecibido) {
		double segundos = valorRecibido * 60;
		segundos = (double) Math.round(segundos * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, valorRecibido + " minuto/s = " + segundos + " segundo/s");
	}

	public void horasMinutos(double valorRecibido) {
		double minutos = valorRecibido * 60;
		minutos = (double) Math.round(minutos * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, valorRecibido + " hora/s = " + minutos + " minuto/s");
	}

	public void diasHoras(double valorRecibido) {
		double horas = valorRecibido * 24;
		horas = (double) Math.round(horas * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, valorRecibido + " día/s = " + horas + " hora/s");
	}

	public void segundosHoras(double valorRecibido) {
		double horas = valorRecibido / 3600; 
		horas = (double) Math.round(horas * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, valorRecibido + " segundo/s = " + horas + " hora/s");
	}

	public void horasSegundos(double valorRecibido) {
		double segundos = valorRecibido * 3600; 
		segundos = (double) Math.round(segundos * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, valorRecibido + " hora/s = " + segundos + " segundo/s");
	}
	
}
