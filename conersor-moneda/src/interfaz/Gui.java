package interfaz;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Gui extends JFrame {

	private JPanel contenedorPrincipal;
	private JTextField txtConversor1;
	private JLabel lblTitulo;
	private JLabel lblCoonversor1;
	private JLabel lblConversor2;
	
	double cantidad;
	double conversion;
	String de = "ARG";
	String a = "ARG";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 372, 220);
		contenedorPrincipal = new JPanel();
		contenedorPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		iniciarComponente();
		
		setTitle("CONVERSOR MONEDA");
		setResizable(false);
		setLocationRelativeTo(null);
		

		
	}

	
	private void iniciarComponente() {
		setContentPane(contenedorPrincipal);
		contenedorPrincipal.setLayout(null);
		
		JComboBox<Object> comboMoneda1 = new JComboBox<Object>();
		comboMoneda1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				de = comboMoneda1.getSelectedItem().toString();
				//convertir();
			}
		});
		comboMoneda1.setModel(new DefaultComboBoxModel(new String[] {"ARS", "USD", "EUR", "YEN", "LIBRAS", "WON"}));
		comboMoneda1.setBounds(159, 64, 61, 22);
		contenedorPrincipal.add(comboMoneda1);
		
		JComboBox comboMoneda2 = new JComboBox<Object>();
		comboMoneda2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = comboMoneda2.getSelectedItem().toString();
			}

			
		});
		comboMoneda2.setModel(new DefaultComboBoxModel(new String[] {"ARS", "USD", "EUR", "LIBRAS", "YEN", "WON"}));
		comboMoneda2.setBounds(159, 118, 61, 22);
		contenedorPrincipal.add(comboMoneda2);
		
		txtConversor1 = new JTextField();
		txtConversor1.setBounds(230, 65, 116, 20);
		contenedorPrincipal.add(txtConversor1);
		txtConversor1.setColumns(10);
		
		lblTitulo = new JLabel("CONVERSOR DE MONEDA");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 0, 356, 25);
		contenedorPrincipal.add(lblTitulo);
		
		lblCoonversor1 = new JLabel("Introducir Cantidad:");
		lblCoonversor1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblCoonversor1.setBounds(10, 68, 139, 14);
		contenedorPrincipal.add(lblCoonversor1);
		
		lblConversor2 = new JLabel("Convertir a:");
		lblConversor2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblConversor2.setBounds(10, 122, 139, 14);
		contenedorPrincipal.add(lblConversor2);
		
		JButton btnConvertir = new JButton("CONVERTIR");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				convertir();
				
//				if (conversor1.isEmpty()) {
//					JOptionPane.showMessageDialog(null, "EL CAMPO ESTA VACIO", "ERROR",0);
//				}
				
//								
				
			}
		});
		btnConvertir.setBounds(241, 118, 105, 23);
		contenedorPrincipal.add(btnConvertir);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(169, 195, 0, 2);
		contenedorPrincipal.add(separator);
		
	}

	public void convertir() {
		cantidad = Double.parseDouble(txtConversor1.getText().trim());
		switch(de) {
		case "ARS":
			if(a.equals("USD")) {
				conversion = cantidad * 0.0049;
			}else if(a.equals("EUR")) {
				conversion = cantidad * 0.0046;
			}else if(a.equals("LIBRAS")) {
				conversion = cantidad * 0.0041;
			}else if(a.equals("YEN")) {
				conversion = cantidad * 0.66;
			}else if(a.equals("WON")) {
				conversion = cantidad * 6.45;
			}
			break;
			
		case "USD":
			if(a.equals("ARS")) {
				conversion = cantidad * 202.09;
			}else if(a.equals("EUR")) {
				conversion = cantidad * 0.93;
			}else if(a.equals("LIBRAS")) {
				conversion = cantidad * 0.82;
			}else if(a.equals("YEN")) {
				conversion = cantidad * 134.26;
			}else if(a.equals("WON")) {
				conversion = cantidad * 1302.53;
			}
			break;
			
		case "EUR":
			if(a.equals("USD")) {
				conversion = cantidad * 1.07;
			}else if(a.equals("ARS")) {
				conversion = cantidad * 216.86;
			}else if(a.equals("LIBRAS")) {
				conversion = cantidad * 0.88;
			}else if(a.equals("YEN")) {
				conversion = cantidad * 144.09;
			}else if(a.equals("WON")) {
				conversion = cantidad * 1397.67;
			}
			break;
			
		case "LIBRAS":
			if(a.equals("USD")) {
				conversion = cantidad * 1.22;
			}else if(a.equals("EUR")) {
				conversion = cantidad * 1.13;
			}else if(a.equals("ARS")) {
				conversion = cantidad * 245.60;
			}else if(a.equals("YEN")) {
				conversion = cantidad * 163.17;
			}else if(a.equals("WON")) {
				conversion = cantidad * 1582.81;
			}
			break;
			
			
		case "YEN":
			if(a.equals("USD")) {
				conversion = cantidad * 0.0074;
			}else if(a.equals("EUR")) {
				conversion = cantidad * 0.0069;
			}else if(a.equals("LIBRAS")) {
				conversion = cantidad * 0.0061;
			}else if(a.equals("ARS")) {
				conversion = cantidad * 1.50;
			}else if(a.equals("WON")) {
				conversion = cantidad * 9.70;
			}
			break;
			
		case "WON":
			if(a.equals("USD")) {
				conversion = cantidad * 0.00077;
			}else if(a.equals("EUR")) {
				conversion = cantidad * 0.00071;
			}else if(a.equals("LIBRAS")) {
				conversion = cantidad * 0.00063;
			}else if(a.equals("YEN")) {
				conversion = cantidad * 0.10;
			}else if(a.equals("ARS")) {
				conversion = cantidad * 0.15;
			}
			break;
		}
		JOptionPane.showMessageDialog(null, "TOTAL CONVERSION "+ conversion);
		
		
	}
}
