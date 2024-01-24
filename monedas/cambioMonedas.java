package monedas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.SystemColor;

public class cambioMonedas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ventanaImporte;
	private JTextField ventanaCambio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cambioMonedas frame = new cambioMonedas();
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
	public cambioMonedas() {
		setTitle("Calculadora De Moneda");
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/Jonay/Desktop/png-transparent-computer-icons-currency-trade-currency-converter-text-trademark-service-thumbnail.png"));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		//Para que el programa se ejecute en el centro de la pantalla.
		setLocationRelativeTo (null);
		
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ventanaImporte = new JTextField();
		ventanaImporte.setHorizontalAlignment(SwingConstants.RIGHT);
		ventanaImporte.setForeground(new Color(254, 255, 255));
		ventanaImporte.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		ventanaImporte.setBackground(new Color(0, 0, 0));
		ventanaImporte.setBounds(136, 256, 224, 49);
		contentPane.add(ventanaImporte);
		ventanaImporte.setColumns(10);
		
		ventanaCambio = new JTextField();
		ventanaCambio.setHorizontalAlignment(SwingConstants.RIGHT);
		ventanaCambio.setForeground(new Color(254, 255, 255));
		ventanaCambio.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		ventanaCambio.setBackground(new Color(0, 0, 0));
		ventanaCambio.setColumns(10);
		ventanaCambio.setBounds(136, 22, 224, 49);
		contentPane.add(ventanaCambio);
		
		JButton botonDolar = new JButton("DOLAR");
		botonDolar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int valorImporteCambiar;
				double valorImporteCambiado;
				double valordolar=0.92;
				String input=ventanaImporte.getText();
				
				if (input.matches("\\d+")) {
					valorImporteCambiar=Integer.parseInt(input);
					valorImporteCambiado=valorImporteCambiar*valordolar;
					ventanaCambio.setText(String.format("%.2f",valorImporteCambiado)+ " EUROS ");
				}else {
					ventanaCambio.setText("Ingrese un Importe Valido ");
				}
			}
		});
		botonDolar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonDolar.setBounds(253, 174, 107, 57);
		contentPane.add(botonDolar);
		
		JButton botonRublos = new JButton("RUBLOS");
		botonRublos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int valorImporteCambiar;
				double valorImporteCambiado;
				double valorRublo=0.010;
				String input=ventanaImporte.getText();
				
				if (input.matches("\\d+")) {
					valorImporteCambiar=Integer.parseInt(input);
					valorImporteCambiado=valorImporteCambiar*valorRublo;
					ventanaCambio.setText(String.format("%.2f",valorImporteCambiado)+ " EUROS ");
				}else {
					ventanaCambio.setText("Ingrese un Importe Valido ");
				}
			}
		});
		botonRublos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonRublos.setBounds(136, 174, 107, 57);
		contentPane.add(botonRublos);
		
		JButton botonLibras = new JButton("LIBRAS");
		botonLibras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int valorImporteCambiar;
				double valorImporteCambiado;
				double valorLibras=1.17;
				String input=ventanaImporte.getText();
				
				if (input.matches("\\d+")) {
					valorImporteCambiar=Integer.parseInt(input);
					valorImporteCambiado=valorImporteCambiar*valorLibras;
					ventanaCambio.setText(String.format("%.2f",valorImporteCambiado)+ " EUROS ");
				}else {
					ventanaCambio.setText("Ingrese un Importe Valido ");
				}
			}
		});
		botonLibras.setBounds(253, 105, 107, 57);
		contentPane.add(botonLibras);
		
		JButton botonYenes = new JButton("YENES");
		botonYenes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int valorImporteCambiar;
				double valorImporteCambiado;
				double valorYenes=0.0062;
				String input=ventanaImporte.getText();
				
				if (input.matches("\\d+")) {
					valorImporteCambiar=Integer.parseInt(input);
					valorImporteCambiado=valorImporteCambiar*valorYenes;
					ventanaCambio.setText(String.format("%.2f",valorImporteCambiado)+ " EUROS ");
				}else {
					ventanaCambio.setText("Ingrese un Importe Valido ");
				}
			}
		});
		botonYenes.setBounds(136, 108, 105, 54);
		contentPane.add(botonYenes);
		
		JLabel imagenImporte = new JLabel("AÑADIR IMPORTE");
		imagenImporte.setBounds(16, 36, 119, 26);
		contentPane.add(imagenImporte);
		
		JLabel imagenCambio = new JLabel("CAMBIO A €");
		imagenCambio.setBounds(16, 265, 130, 36);
		contentPane.add(imagenCambio);
		
		JButton botonLimpiar = new JButton("LIMPIAR");
		botonLimpiar.setBackground(new Color(255, 255, 255));
		botonLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventanaImporte.setText ("");
				ventanaCambio.setText("");
				
			}
		});
		botonLimpiar.setBounds(25, 128, 99, 78);
		contentPane.add(botonLimpiar);
	}
}
