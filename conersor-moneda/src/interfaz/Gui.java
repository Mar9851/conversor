package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui extends JFrame {

	private JPanel contenedorPrincipal;
	private JTextField txtConversor1;
	private JLabel lblTitulo;
	private JLabel lblCoonversor1;
	private JLabel lblConversor2;
	private JTextField textField;

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
		setBounds(100, 100, 372, 262);
		contenedorPrincipal = new JPanel();
		contenedorPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		iniciarComponente();
		
		setTitle("CONVERSOR MONEDA");
		//setResizable(false);
		setLocationRelativeTo(null);
		

		
	}

	
	private void iniciarComponente() {
		setContentPane(contenedorPrincipal);
		contenedorPrincipal.setLayout(null);
		
		JComboBox comboMoneda1 = new JComboBox();
		comboMoneda1.setModel(new DefaultComboBoxModel(new String[] {"ARG", "USD", "EUR", "YEN", "LIBRAS", "WON"}));
		comboMoneda1.setBounds(159, 64, 61, 22);
		contenedorPrincipal.add(comboMoneda1);
		
		JComboBox comboMoneda2 = new JComboBox();
		comboMoneda2.setModel(new DefaultComboBoxModel(new String[] {"ARG", "USD", "EUR", "LIBRAS", "YEN", "WON"}));
		comboMoneda2.setBounds(159, 118, 61, 22);
		contenedorPrincipal.add(comboMoneda2);
		
		txtConversor1 = new JTextField();
		txtConversor1.setBounds(230, 65, 116, 20);
		contenedorPrincipal.add(txtConversor1);
		txtConversor1.setColumns(10);
		
		lblTitulo = new JLabel("CONVERSOR DE MONEDA");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(29, 11, 305, 14);
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
				
				double total;
				
				double conversor1 = Double.parseDouble(txtConversor1.getText());
				
				if(comboMoneda1.getSelectedItem().toString() == "ARG" && 
						       comboMoneda2.getSelectedItem().toString() == "USD") {
					
					total = conversor1 * 100.00;
					JOptionPane.showMessageDialog(null, "TOTAL DEL "+total);
				}
				
				
			}
		});
		btnConvertir.setBounds(241, 118, 105, 23);
		contenedorPrincipal.add(btnConvertir);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(169, 195, 0, 2);
		contenedorPrincipal.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 176, 356, 2);
		contenedorPrincipal.add(separator_1);
		
		JLabel lblResultado = new JLabel("RESULTADO:");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblResultado.setBounds(86, 184, 83, 28);
		contenedorPrincipal.add(lblResultado);
		
		textField = new JTextField();
		textField.setBounds(179, 189, 86, 20);
		contenedorPrincipal.add(textField);
		textField.setColumns(10);
		
	}
}
