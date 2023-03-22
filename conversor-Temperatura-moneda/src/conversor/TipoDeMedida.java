package conversor;

import javax.swing.JOptionPane;

public class TipoDeMedida {
   
	public void pulgadasMilimetros(double valor) {
		double resultado = valor * 25.40;
		
		JOptionPane.showMessageDialog(null, "Pulgadas" + valor + " = Milimetros" + resultado);
		
   }
	
	public void yardasMetros(double valor) {
		double resultado = valor * 0.9144;
		
		JOptionPane.showMessageDialog(null, "Yardas" + valor + " = Metros" + resultado);
		
   }
	
	
	public void onzasGramos(double valor) {
		
        double resultado = valor * 28.35 ;
		
		JOptionPane.showMessageDialog(null, "Onzas" + valor + " = Gramos" + resultado);
		
	}
	
    public void librasKilogramos(double valor) {
    	
       double resultado = valor * 0.45359;
		
		JOptionPane.showMessageDialog(null, "Libras" + valor + " = Kilogramos" + resultado);
		
	}
	
}