package com.unlam.algoritmo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] resSubCat = {"", "NO CUMPLE", "CUMPLE PARCIALMENTE", "CUMPLE"}; 
	private JPanel contentPane;
	private JPanel panelFuncionalidad;
	private JPanel panelEficiencia;
	private JPanel panelMantenibilidad;
	private JPanel panelUsabilidad;
	private JPanel panelPortabilidad;
	private JPanel panelResultados;
	private ButtonGroup bgFuncionalidadA;
	private ButtonGroup bgFuncionalidadB;
	private ButtonGroup bgEficienciaA;
	private ButtonGroup bgEficienciaB;
	private ButtonGroup bgEficienciaC;
	private ButtonGroup bgMantenibilidadA;
	private ButtonGroup bgMantenibilidadB;
	private ButtonGroup bgMantenibilidadC;
	private ButtonGroup bgUsabilidadA;
	private ButtonGroup bgUsabilidadB;
	private ButtonGroup bgUsabilidadC;
	private ButtonGroup bgPortabilidadA;
	private ButtonGroup bgPortabilidadB;
	private JTextField textResultado;
	private JTextField textFunA;
	private JTextField textFunB;
	private JTextField textEficA;
	private JTextField textEficB;
	private JTextField textEficC;
	private JTextField textMantA;
	private JTextField textMantB;
	private JTextField textMantC;
	private JTextField textUsabA;
	private JTextField textUsabB;
	private JTextField textUsabC;
	private JTextField textFPortA;
	private JTextField textFPortB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setResizable(false);
		setTitle("ALGORITMO DE CALIDAD  - GRUPO 7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelFuncionalidad = new JPanel();
		panelFuncionalidad.setBounds(0, 0, 682, 489);
		contentPane.add(panelFuncionalidad);
		panelFuncionalidad.setLayout(null);
		
		JButton btnSalir_1 = new JButton("Salir");
		btnSalir_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
				
			}
		});
		btnSalir_1.setBounds(484, 455, 89, 23);
		panelFuncionalidad.add(btnSalir_1);
		
		JButton btnSiguiente_1 = new JButton("Siguiente");
		btnSiguiente_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(bgFuncionalidadA.getSelection() == null || bgFuncionalidadB.getSelection() == null)
					JOptionPane.showMessageDialog(null, "Para avanzar debe seleccionar un item de cada subcategor�a");
				else {
					panelFuncionalidad.setVisible(false);
					panelEficiencia.setVisible(true);
				}
			}
		});
		btnSiguiente_1.setBounds(583, 455, 89, 23);
		panelFuncionalidad.add(btnSiguiente_1);
		
		JLabel lblfuncionalidad = new JLabel("FUNCIONALIDAD");
		lblfuncionalidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblfuncionalidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblfuncionalidad.setBounds(239, 11, 204, 14);
		panelFuncionalidad.add(lblfuncionalidad);
		
		JTextArea txtrASeguridadDe = new JTextArea();
		txtrASeguridadDe.setBackground(Color.LIGHT_GRAY);
		txtrASeguridadDe.setWrapStyleWord(true);
		txtrASeguridadDe.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrASeguridadDe.setEditable(false);
		txtrASeguridadDe.setText("a) Seguridad de acceso: Capacidad del producto software para asegurar la integridad de los datos y la\r\n\t                   confidencialidad de estos");
		txtrASeguridadDe.setBounds(82, 54, 512, 39);
		panelFuncionalidad.add(txtrASeguridadDe);
		
		JTextArea textAreaExactitudResult = new JTextArea();
		textAreaExactitudResult.setEditable(false);
		textAreaExactitudResult.setBackground(Color.LIGHT_GRAY);
		textAreaExactitudResult.setText("b) Exactitud de los resultados: Capacidad del producto software para asegurar que los valores de los\r\n\t\t       atributos num\u00E9ricos decimales lo hagan con el grado suficiente de precisi\u00F3n.");
		textAreaExactitudResult.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textAreaExactitudResult.setBounds(82, 207, 512, 29);
		panelFuncionalidad.add(textAreaExactitudResult);
		
		JRadioButton rdbtnFunB3 = new JRadioButton("Se utiliza una presi\u00F3n de 10-4 o superior");
		rdbtnFunB3.setActionCommand("3");
		rdbtnFunB3.setBounds(182, 243, 391, 23);
		panelFuncionalidad.add(rdbtnFunB3);
		
		JRadioButton rdbtnFunB2 = new JRadioButton("Se utiliza una presi\u00F3n de entre 10-2 y 10-3");
		rdbtnFunB2.setActionCommand("2");
		rdbtnFunB2.setBounds(182, 269, 391, 23);
		panelFuncionalidad.add(rdbtnFunB2);
		
		JRadioButton rdbtnFunB1 = new JRadioButton("Se utiliza una presi\u00F3n de 10-1 o inferior");
		rdbtnFunB1.setActionCommand("1");
		rdbtnFunB1.setBounds(182, 295, 391, 23);
		panelFuncionalidad.add(rdbtnFunB1);
		
		bgFuncionalidadB = new ButtonGroup();
		bgFuncionalidadB.add(rdbtnFunB3);
		bgFuncionalidadB.add(rdbtnFunB2);
		bgFuncionalidadB.add(rdbtnFunB1);
		
		JRadioButton rdbtnFunA3 = new JRadioButton("Requiere iniciar sesi\u00F3n sesi\u00F3n y contrase\u00F1a encriptada");
		rdbtnFunA3.setActionCommand("3");
		rdbtnFunA3.setBounds(182, 100, 391, 23);
		panelFuncionalidad.add(rdbtnFunA3);
		
		JRadioButton rdbtnFunA2 = new JRadioButton("S\u00F3lo requiere iniciar sesi\u00F3n");
		rdbtnFunA2.setActionCommand("2");
		rdbtnFunA2.setBounds(181, 126, 392, 23);
		panelFuncionalidad.add(rdbtnFunA2);
		
		JRadioButton rdbtnFunA1 = new JRadioButton("No requiere iniciar sesi\u00F3n");
		rdbtnFunA1.setActionCommand("1");
		rdbtnFunA1.setBounds(182, 152, 391, 23);
		panelFuncionalidad.add(rdbtnFunA1);
		
		bgFuncionalidadA = new ButtonGroup();
		bgFuncionalidadA.add(rdbtnFunA3);
		bgFuncionalidadA.add(rdbtnFunA2);
		bgFuncionalidadA.add(rdbtnFunA1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(101, 182, 453, 14);
		panelFuncionalidad.add(separator_1);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(101, 36, 453, 7);
		panelFuncionalidad.add(separator_8);
		
		panelEficiencia = new JPanel();
		panelEficiencia.setBounds(0, 0, 682, 489);
		contentPane.add(panelEficiencia);
		panelEficiencia.setLayout(null);
		panelEficiencia.setVisible(false);
		
		JButton btnSiguiente_2 = new JButton("Siguiente");
		btnSiguiente_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(bgEficienciaA.getSelection() == null || bgEficienciaB.getSelection() == null || bgEficienciaC.getSelection() == null)
					JOptionPane.showMessageDialog(null, "Para avanzar debe seleccionar un item de cada subcategor�a");
				else {
					panelEficiencia.setVisible(false);
					panelMantenibilidad.setVisible(true);
				}
			}
		});
		btnSiguiente_2.setBounds(583, 455, 89, 23);
		panelEficiencia.add(btnSiguiente_2);
		
		JButton btnAtras_2 = new JButton("Atras");
		btnAtras_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				panelEficiencia.setVisible(false);
				panelFuncionalidad.setVisible(true);
				
			}
		});
		btnAtras_2.setBounds(484, 455, 89, 23);
		panelEficiencia.add(btnAtras_2);
		
		JLabel lblEficiencia = new JLabel("EFICIENCIA");
		lblEficiencia.setHorizontalAlignment(SwingConstants.CENTER);
		lblEficiencia.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEficiencia.setBounds(210, 11, 240, 14);
		panelEficiencia.add(lblEficiencia);
		
		JButton btnSalir_2 = new JButton("Salir");
		btnSalir_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				alertaSalir();
				
			}
		});
		btnSalir_2.setBounds(385, 455, 89, 23);
		panelEficiencia.add(btnSalir_2);
		
		JTextArea txtrAUtilizacionDel = new JTextArea();
		txtrAUtilizacionDel.setEditable(false);
		txtrAUtilizacionDel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrAUtilizacionDel.setText("a) Utilizaci\u00F3n del procesador:  Se evaluara la eficiencia de acuerdo con el porcentaje de uso del procesador\r\n \t\t     (NOTA: Debe ser evaluado en un procesador de la seri Intel I3, I5, o I7\r\n\t\t      de cualquier generaci\u00F3n)");
		txtrAUtilizacionDel.setBounds(64, 46, 525, 46);
		panelEficiencia.add(txtrAUtilizacionDel);
		
		JRadioButton rdbtnEficA3 = new JRadioButton("Se utiliza menos del 10%");
		rdbtnEficA3.setActionCommand("3");
		rdbtnEficA3.setBounds(210, 89, 365, 23);
		panelEficiencia.add(rdbtnEficA3);
		
		JRadioButton rdbtnEficA2 = new JRadioButton("Se utiliza entre 10% y 40%");
		rdbtnEficA2.setActionCommand("2");
		rdbtnEficA2.setBounds(210, 115, 365, 23);
		panelEficiencia.add(rdbtnEficA2);
		
		JRadioButton rdbtnEficA1 = new JRadioButton("Se utiliza m\u00E1s del 40%");
		rdbtnEficA1.setActionCommand("1");
		rdbtnEficA1.setBounds(210, 141, 365, 23);
		panelEficiencia.add(rdbtnEficA1);
		
		bgEficienciaA = new ButtonGroup();
		bgEficienciaA.add(rdbtnEficA3);
		bgEficienciaA.add(rdbtnEficA2);
		bgEficienciaA.add(rdbtnEficA1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(87, 171, 460, 2);
		panelEficiencia.add(separator);
		
		JTextArea txtrBUtilizacinDel = new JTextArea();
		txtrBUtilizacinDel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrBUtilizacinDel.setText("b) Utilizaci\u00F3n del disco r\u00EDgido: Se evaluar\u00E1 de acuerdo al porcentaje de uso del disco rigido. Debera ser\r\n\t\t    evaluado con un disco de 7200 rpm o m\u00E1s, o con un disco de estado solido de\r\n\t\t    cualquier generacion. El espacio del disco no puede ser inferior a 240GB.");
		txtrBUtilizacinDel.setEditable(false);
		txtrBUtilizacinDel.setBounds(64, 181, 525, 46);
		panelEficiencia.add(txtrBUtilizacinDel);
		
		JRadioButton rdbtnEficB3 = new JRadioButton("Se utiliza menos del 30%");
		rdbtnEficB3.setActionCommand("3");
		rdbtnEficB3.setBounds(210, 234, 337, 23);
		panelEficiencia.add(rdbtnEficB3);
		
		JRadioButton rdbtnEficB2 = new JRadioButton("Se utiliza entre el 30% y 60%");
		rdbtnEficB2.setActionCommand("2");
		rdbtnEficB2.setBounds(210, 260, 337, 23);
		panelEficiencia.add(rdbtnEficB2);
		
		JRadioButton rdbtnEficB1 = new JRadioButton("Se utiliza mas del 60%");
		rdbtnEficB1.setActionCommand("1");
		rdbtnEficB1.setBounds(210, 286, 337, 23);
		panelEficiencia.add(rdbtnEficB1);
		
		bgEficienciaB = new ButtonGroup();
		bgEficienciaB.add(rdbtnEficB3);
		bgEficienciaB.add(rdbtnEficB2);
		bgEficienciaB.add(rdbtnEficB1);
		
		JTextArea txtrCUtilizacinDe = new JTextArea();
		txtrCUtilizacinDe.setEditable(false);
		txtrCUtilizacinDe.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrCUtilizacinDe.setText("c) Utilizaci\u00F3n de memoria RAM: Se evaluar\u00E1 de acuerdo al porcentaje de uso de la memoria RAM. Deber\u00E1 ser\r\n\t\t       evaluado en un entorno del que se disponga de mas de 4GB de RAM libres.");
		txtrCUtilizacinDe.setBounds(64, 330, 525, 36);
		panelEficiencia.add(txtrCUtilizacinDe);
		
		JRadioButton rdbtnEficC3 = new JRadioButton("Utiliza menos de 100MB");
		rdbtnEficC3.setActionCommand("3");
		rdbtnEficC3.setBounds(210, 373, 347, 23);
		panelEficiencia.add(rdbtnEficC3);
		
		JRadioButton rdbtnEficC2 = new JRadioButton("Utiliza entre 100MB y 500MB");
		rdbtnEficC2.setActionCommand("2");
		rdbtnEficC2.setBounds(210, 399, 359, 23);
		panelEficiencia.add(rdbtnEficC2);
		
		JRadioButton rdbtnEficC1 = new JRadioButton("Utiliza mas de 500MB");
		rdbtnEficC1.setActionCommand("1");
		rdbtnEficC1.setBounds(210, 425, 359, 23);
		panelEficiencia.add(rdbtnEficC1);
		
		bgEficienciaC = new ButtonGroup();
		bgEficienciaC.add(rdbtnEficC3);
		bgEficienciaC.add(rdbtnEficC2);
		bgEficienciaC.add(rdbtnEficC1);
		
		JSeparator separator___ = new JSeparator();
		separator___.setBounds(64, 317, 483, 2);
		panelEficiencia.add(separator___);
		
		JSeparator separator_____ = new JSeparator();
		separator_____.setBounds(64, 33, 483, 2);
		panelEficiencia.add(separator_____);
		
		panelMantenibilidad = new JPanel();
		panelMantenibilidad.setBounds(0, 0, 682, 489);
		contentPane.add(panelMantenibilidad);
		panelMantenibilidad.setLayout(null);
		panelMantenibilidad.setVisible(false);
		
		JButton btnSiguiente_3 = new JButton("Siguiente");
		btnSiguiente_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(bgMantenibilidadA.getSelection() == null || bgMantenibilidadB.getSelection() == null || bgMantenibilidadC == null)
					JOptionPane.showMessageDialog(null, "Para avanzar debe seleccionar un item de cada subcategor�a");
				else {
					panelMantenibilidad.setVisible(false);
					panelUsabilidad.setVisible(true);
				}
			}
		});
		btnSiguiente_3.setBounds(583, 455, 89, 23);
		panelMantenibilidad.add(btnSiguiente_3);
		
		JButton btnAtras_3 = new JButton("Atras");
		btnAtras_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				panelMantenibilidad.setVisible(false);
				panelEficiencia.setVisible(true);
				
			}
		});
		btnAtras_3.setBounds(484, 455, 89, 23);
		panelMantenibilidad.add(btnAtras_3);
		
		JButton btnSalir_3 = new JButton("Salir");
		btnSalir_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				alertaSalir();
				
			}
		});
		btnSalir_3.setBounds(385, 455, 89, 23);
		panelMantenibilidad.add(btnSalir_3);
		
		JLabel lblM = new JLabel("MANTENIBILIDAD");
		lblM.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblM.setHorizontalAlignment(SwingConstants.CENTER);
		lblM.setBounds(215, 11, 233, 14);
		panelMantenibilidad.add(lblM);
		
		JTextArea txtrACapacidadDel = new JTextArea();
		txtrACapacidadDel.setEditable(false);
		txtrACapacidadDel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrACapacidadDel.setText("a) Capacidad del codigo de ser analizado: Para evaluar la capacidad que tiene el c\u00F3digo de ser analizado se tendr\u00E1\r\n\t\t        \t    en cuenta el porcentaje de comentarios que posee el c\u00F3digo por cada\r\n\t\t\t    m\u00E9todo.");
		txtrACapacidadDel.setToolTipText("");
		txtrACapacidadDel.setBounds(60, 55, 552, 46);
		panelMantenibilidad.add(txtrACapacidadDel);
		
		JRadioButton rdbtnMantA3 = new JRadioButton("C\u00F3digo comentado mayor a 30%");
		rdbtnMantA3.setActionCommand("3");
		rdbtnMantA3.setBounds(175, 105, 398, 23);
		panelMantenibilidad.add(rdbtnMantA3);
		
		JRadioButton rdbtnMantA2 = new JRadioButton("C\u00F3digo comentado entre 30% y 10%");
		rdbtnMantA2.setActionCommand("2");
		rdbtnMantA2.setBounds(175, 131, 398, 23);
		panelMantenibilidad.add(rdbtnMantA2);
		
		JRadioButton rdbtnMantA1 = new JRadioButton("C\u00F3digo comentado inferior a 30%");
		rdbtnMantA1.setActionCommand("1");
		rdbtnMantA1.setBounds(175, 157, 398, 23);
		panelMantenibilidad.add(rdbtnMantA1);
		
		bgMantenibilidadA = new ButtonGroup();
		bgMantenibilidadA.add(rdbtnMantA3);
		bgMantenibilidadA.add(rdbtnMantA2);
		bgMantenibilidadA.add(rdbtnMantA1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(86, 187, 487, 2);
		panelMantenibilidad.add(separator_2);
		
		JTextArea txtrBCapacidadDel = new JTextArea();
		txtrBCapacidadDel.setEditable(false);
		txtrBCapacidadDel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrBCapacidadDel.setText("b) Capacidad del c\u00F3digo de ser cambiado: Se tomar\u00E1 en cuenta la complejidad ciclom\u00E1ticadel metodo alta del\r\n\t\t   \t    producto.");
		txtrBCapacidadDel.setBounds(60, 200, 552, 32);
		panelMantenibilidad.add(txtrBCapacidadDel);
		
		JRadioButton rdbtnMantB3 = new JRadioButton("La complejidad ciclom\u00E1tica es inferior a 11");
		rdbtnMantB3.setActionCommand("3");
		rdbtnMantB3.setBounds(175, 239, 398, 23);
		panelMantenibilidad.add(rdbtnMantB3);
		
		JRadioButton rdbtnMantB2 = new JRadioButton("La complejidad ciclom\u00E1tica est\u00E1 entre 11 y 21");
		rdbtnMantB2.setActionCommand("2");
		rdbtnMantB2.setBounds(175, 265, 398, 23);
		panelMantenibilidad.add(rdbtnMantB2);
		
		JRadioButton rdbtnMantB1 = new JRadioButton("La complejidad ciclom\u00E1tica supera los 21");
		rdbtnMantB1.setActionCommand("1");
		rdbtnMantB1.setBounds(175, 291, 398, 23);
		panelMantenibilidad.add(rdbtnMantB1);
		
		bgMantenibilidadB = new ButtonGroup();
		bgMantenibilidadB.add(rdbtnMantB3);
		bgMantenibilidadB.add(rdbtnMantB2);
		bgMantenibilidadB.add(rdbtnMantB1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(86, 321, 487, 2);
		panelMantenibilidad.add(separator_3);
		
		JTextArea txtrCEstabilidadPara = new JTextArea();
		txtrCEstabilidadPara.setEditable(false);
		txtrCEstabilidadPara.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrCEstabilidadPara.setText("c) Estabilidad: Para determinar la estabilidad del software se eval\u00FAa la cantidad de fallas que presenta el producto\r\n\t durante el per\u00EDodo de prueba de estabilidad.");
		txtrCEstabilidadPara.setBounds(60, 334, 552, 32);
		panelMantenibilidad.add(txtrCEstabilidadPara);
		
		JRadioButton rdbtnMantC3 = new JRadioButton("La cantidad de fallas es mayor a 7");
		rdbtnMantC3.setActionCommand("3");
		rdbtnMantC3.setBounds(175, 373, 398, 23);
		panelMantenibilidad.add(rdbtnMantC3);
		
		JRadioButton rdbtnMantC2 = new JRadioButton("La cantidad de fallas est\u00E1 entre 7 y 4");
		rdbtnMantC2.setActionCommand("2");
		rdbtnMantC2.setBounds(175, 399, 398, 23);
		panelMantenibilidad.add(rdbtnMantC2);
		
		JRadioButton rdbtnMantC1 = new JRadioButton("La cantidad de fallas es inferior a 4");
		rdbtnMantC1.setActionCommand("1");
		rdbtnMantC1.setBounds(175, 425, 398, 23);
		panelMantenibilidad.add(rdbtnMantC1);
		
		bgMantenibilidadC = new ButtonGroup();
		bgMantenibilidadC.add(rdbtnMantC3);
		bgMantenibilidadC.add(rdbtnMantC2);
		bgMantenibilidadC.add(rdbtnMantC1);
		
		JSeparator separator__ = new JSeparator();
		separator__.setBounds(86, 40, 487, 2);
		panelMantenibilidad.add(separator__);
		
		
		panelUsabilidad = new JPanel();
		panelUsabilidad.setBounds(0, 0, 682, 489);
		contentPane.add(panelUsabilidad);
		panelUsabilidad.setLayout(null);
		
		JLabel lblUsabilidad = new JLabel("USABILIDAD");
		lblUsabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsabilidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsabilidad.setBounds(228, 11, 214, 14);
		panelUsabilidad.add(lblUsabilidad);
		
		JButton btnSiguiente_4 = new JButton("Siguiente");
		btnSiguiente_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(bgUsabilidadA.getSelection() == null || bgUsabilidadB.getSelection() == null || bgUsabilidadC.getSelection() == null)
					JOptionPane.showMessageDialog(null, "Para avanzar debe seleccionar un item de cada subcategor�a");
				else {
					panelUsabilidad.setVisible(false);
					panelPortabilidad.setVisible(true);
				}
			}
		});
		btnSiguiente_4.setBounds(583, 455, 89, 23);
		panelUsabilidad.add(btnSiguiente_4);
		
		JButton btnAtras_4 = new JButton("Atras");
		btnAtras_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				panelUsabilidad.setVisible(false);
				panelMantenibilidad.setVisible(true);
				
			}
		});
		btnAtras_4.setBounds(484, 455, 89, 23);
		panelUsabilidad.add(btnAtras_4);
		
		JButton btnSalir_4 = new JButton("Salir");
		btnSalir_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				alertaSalir();
				
			}
		});
		btnSalir_4.setBounds(385, 455, 89, 23);
		panelUsabilidad.add(btnSalir_4);
		
		JTextArea txtrAinstalabilidadElSoftware = new JTextArea();
		txtrAinstalabilidadElSoftware.setEditable(false);
		txtrAinstalabilidadElSoftware.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrAinstalabilidadElSoftware.setText("a) Capacidad de ser entendido: Capacidad que posee el software de ayudar a los usuarios ante una\r\n\t\t        determinada situaci\u00F3n donde se necesite asistencia.");
		txtrAinstalabilidadElSoftware.setBounds(70, 49, 533, 34);
		panelUsabilidad.add(txtrAinstalabilidadElSoftware);
		
		JRadioButton rdbtnUsabA3 = new JRadioButton("Posee ayuda contextual sobre botones de acci\u00F3n Y manual de usuario incorporado");
		rdbtnUsabA3.setActionCommand("3");
		rdbtnUsabA3.setBounds(70, 90, 533, 23);
		panelUsabilidad.add(rdbtnUsabA3);
		
		JRadioButton rdbtnUsabA2 = new JRadioButton("Posee ayuda contextual sobre botones de acci\u00F3n O manual de usuario incorporado");
		rdbtnUsabA2.setActionCommand("2");
		rdbtnUsabA2.setBounds(70, 116, 533, 23);
		panelUsabilidad.add(rdbtnUsabA2);
		
		JRadioButton rdbtnUsabA1 = new JRadioButton("No posee ayuda ningun tipo de ayuda");
		rdbtnUsabA1.setActionCommand("1");
		rdbtnUsabA1.setBounds(70, 142, 533, 23);
		panelUsabilidad.add(rdbtnUsabA1);
		
		bgUsabilidadA = new ButtonGroup();
		bgUsabilidadA.add(rdbtnUsabA3);
		bgUsabilidadA.add(rdbtnUsabA2);
		bgUsabilidadA.add(rdbtnUsabA1);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(74, 172, 529, 2);
		panelUsabilidad.add(separator_4);
		
		JTextArea txtrBCapacidadDe = new JTextArea();
		txtrBCapacidadDe.setEditable(false);
		txtrBCapacidadDe.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrBCapacidadDe.setText("b) Capacidad de ser operado: Es la capacidad del producto de ser utilizado sin asistencia adicional. Se eval\u00FAa\r\n\t\t     que requiere el usuario para operar correctamente el producto.");
		txtrBCapacidadDe.setBounds(70, 185, 533, 34);
		panelUsabilidad.add(txtrBCapacidadDe);
		
		JRadioButton rdbtnUsabB3 = new JRadioButton("El usuario puede operar el producto sin necesidad de recurrir a asistencia externa\r\n\t a la que puede encontrar dentro del producto");
		rdbtnUsabB3.setActionCommand("3");
		rdbtnUsabB3.setBounds(6, 226, 639, 23);
		panelUsabilidad.add(rdbtnUsabB3);
		
		JRadioButton rdbtnUsabB2 = new JRadioButton("El usuario requiere consultar el manual de uso impreso para poder operar el producto");
		rdbtnUsabB2.setActionCommand("2");
		rdbtnUsabB2.setBounds(6, 252, 597, 23);
		panelUsabilidad.add(rdbtnUsabB2);
		
		JRadioButton rdbtnUsabB1 = new JRadioButton("El usuario requiere consultar a personal especializado m\u00E1s de 5 veces en un per\u00EDodo de tiempo para operar el producto software");
		rdbtnUsabB1.setActionCommand("1");
		rdbtnUsabB1.setBounds(6, 278, 666, 23);
		panelUsabilidad.add(rdbtnUsabB1);
		
		bgUsabilidadB = new ButtonGroup();
		bgUsabilidadB.add(rdbtnUsabB3);
		bgUsabilidadB.add(rdbtnUsabB2);
		bgUsabilidadB.add(rdbtnUsabB1);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(70, 308, 533, 2);
		panelUsabilidad.add(separator_5);
		
		JTextArea txtrCCapacidadDe = new JTextArea();
		txtrCCapacidadDe.setEditable(false);
		txtrCCapacidadDe.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrCCapacidadDe.setText("c) Capacidad de ser atractivo para el usuario: Es la agrupaci\u00F3n correcta de funcionalidad de l producto software\r\n\t\t\t     en su interf\u00E1z gr\u00E1fica, desde su agrupacion l\u00F3gica hasta el n\u00FAmero\r\n\t\t\t     promedio  de pasos  para alcanzar una funci\u00F3n o contenido espec\u00EDfico.");
		txtrCCapacidadDe.setBounds(70, 321, 544, 45);
		panelUsabilidad.add(txtrCCapacidadDe);
		
		JRadioButton rdbtnUsabC3 = new JRadioButton("La cantidad de pasos es inferior a 4");
		rdbtnUsabC3.setActionCommand("3");
		rdbtnUsabC3.setBounds(113, 373, 407, 23);
		panelUsabilidad.add(rdbtnUsabC3);
		
		JRadioButton rdbtnUsabC2 = new JRadioButton("La cantidad de pasos est\u00E1 entre 5 y 7");
		rdbtnUsabC2.setActionCommand("2");
		rdbtnUsabC2.setBounds(113, 399, 460, 23);
		panelUsabilidad.add(rdbtnUsabC2);
		
		JRadioButton rdbtnUsabC1 = new JRadioButton("la cantidad de pasos es superior a 7");
		rdbtnUsabC1.setActionCommand("1");
		rdbtnUsabC1.setBounds(113, 425, 460, 23);
		panelUsabilidad.add(rdbtnUsabC1);
		
		bgUsabilidadC = new ButtonGroup();
		bgUsabilidadC.add(rdbtnUsabC3);
		bgUsabilidadC.add(rdbtnUsabC2);
		bgUsabilidadC.add(rdbtnUsabC1);
		
		JSeparator separator_ = new JSeparator();
		separator_.setBounds(74, 36, 529, 2);
		panelUsabilidad.add(separator_);
		
		panelPortabilidad = new JPanel();
		panelPortabilidad.setBounds(0, 0, 682, 489);
		contentPane.add(panelPortabilidad);
		panelPortabilidad.setLayout(null);
		
		JButton btnEvaluar_5 = new JButton("Evaluar");
		btnEvaluar_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(bgPortabilidadA.getSelection() == null || bgPortabilidadB.getSelection() == null)
					JOptionPane.showMessageDialog(null, "Para avanzar debe seleccionar un item de cada subcategor�a");
				else
				{
					///Calcular resultados - Evaluar
					textFunA.setText(resSubCat[Integer.parseInt(bgFuncionalidadA.getSelection().getActionCommand())]);
					textFunB.setText(resSubCat[Integer.parseInt(bgFuncionalidadB.getSelection().getActionCommand())]);
					textEficA.setText(resSubCat[Integer.parseInt(bgEficienciaA.getSelection().getActionCommand())]);
					textEficB.setText(resSubCat[Integer.parseInt(bgEficienciaB.getSelection().getActionCommand())]);
					textEficC.setText(resSubCat[Integer.parseInt(bgEficienciaC.getSelection().getActionCommand())]);
					textMantA.setText(resSubCat[Integer.parseInt(bgMantenibilidadA.getSelection().getActionCommand())]);
					textMantB.setText(resSubCat[Integer.parseInt(bgMantenibilidadB.getSelection().getActionCommand())]);
					textMantC.setText(resSubCat[Integer.parseInt(bgMantenibilidadC.getSelection().getActionCommand())]);
					textUsabA.setText(resSubCat[Integer.parseInt(bgUsabilidadA.getSelection().getActionCommand())]);
					textUsabB.setText(resSubCat[Integer.parseInt(bgUsabilidadB.getSelection().getActionCommand())]);
					textUsabC.setText(resSubCat[Integer.parseInt(bgUsabilidadC.getSelection().getActionCommand())]);
					textUsabA.setText(resSubCat[Integer.parseInt(bgUsabilidadA.getSelection().getActionCommand())]);
					textFPortA.setText(resSubCat[Integer.parseInt(bgPortabilidadA.getSelection().getActionCommand())]);
					textFPortB.setText(resSubCat[Integer.parseInt(bgPortabilidadB.getSelection().getActionCommand())]);
					
					panelPortabilidad.setVisible(false);
					panelResultados.setVisible(true);
				}
				
			}
		});
		btnEvaluar_5.setBounds(583, 455, 89, 23);
		panelPortabilidad.add(btnEvaluar_5);
		
		JButton btnAtras_5 = new JButton("Atras");
		btnAtras_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				panelPortabilidad.setVisible(false);
				panelUsabilidad.setVisible(true);
			}
		});
		btnAtras_5.setBounds(484, 455, 89, 23);
		panelPortabilidad.add(btnAtras_5);
		
		JButton btnSalir_5 = new JButton("Salir");
		btnSalir_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				alertaSalir();
				
			}
		});
		btnSalir_5.setBounds(385, 455, 89, 23);
		panelPortabilidad.add(btnSalir_5);
		
		JLabel lblPortabilidad = new JLabel("PORTABILIDAD");
		lblPortabilidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPortabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblPortabilidad.setBounds(245, 11, 173, 23);
		panelPortabilidad.add(lblPortabilidad);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(147, 32, 363, 2);
		panelPortabilidad.add(separator_6);
		
		JTextArea txtrAInstalabilidadEl = new JTextArea();
		txtrAInstalabilidadEl.setEditable(false);
		txtrAInstalabilidadEl.setText("a) Instalabilidad: El software debe poder ser instalado en una cantidad minima de pasos.");
		txtrAInstalabilidadEl.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrAInstalabilidadEl.setBounds(56, 44, 576, 35);
		panelPortabilidad.add(txtrAInstalabilidadEl);
		
		JRadioButton rdbtnPortA3 = new JRadioButton("El producto se ejecuta de manera portable, sin instalar");
		rdbtnPortA3.setActionCommand("3");
		rdbtnPortA3.setBounds(175, 86, 371, 23);
		panelPortabilidad.add(rdbtnPortA3);
		
		JRadioButton rdbtnPortA2 = new JRadioButton("El producto se instala en menos de 3 pasos");
		rdbtnPortA2.setActionCommand("2");
		rdbtnPortA2.setBounds(175, 119, 371, 23);
		panelPortabilidad.add(rdbtnPortA2);
		
		JRadioButton rdbtnPortA1 = new JRadioButton("El producto se instala en 3 pasos o m\u00E1s");
		rdbtnPortA1.setActionCommand("1");
		rdbtnPortA1.setBounds(175, 150, 371, 23);
		panelPortabilidad.add(rdbtnPortA1);
		
		bgPortabilidadA = new ButtonGroup();
		bgPortabilidadA.add(rdbtnPortA3);
		bgPortabilidadA.add(rdbtnPortA2);
		bgPortabilidadA.add(rdbtnPortA1);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(147, 180, 363, 2);
		panelPortabilidad.add(separator_7);
		
		JTextArea txtrBAdaptabilidadEl = new JTextArea();
		txtrBAdaptabilidadEl.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrBAdaptabilidadEl.setEditable(false);
		txtrBAdaptabilidadEl.setText("b) Adaptabilidad: El producto software puede utilizarse en diferentes sistemas operativos sin ser modificado.");
		txtrBAdaptabilidadEl.setBounds(56, 195, 576, 35);
		panelPortabilidad.add(txtrBAdaptabilidadEl);
		
		JRadioButton rdbtnPortB3 = new JRadioButton("El producto es compatible con 3 o m\u00E1s sistemas operativos");
		rdbtnPortB3.setActionCommand("3");
		rdbtnPortB3.setBounds(175, 237, 371, 23);
		panelPortabilidad.add(rdbtnPortB3);
		
		JRadioButton rdbtnPortB2 = new JRadioButton("El producto es compatible con 2 sistemas operativos");
		rdbtnPortB2.setActionCommand("2");
		rdbtnPortB2.setBounds(175, 263, 398, 23);
		panelPortabilidad.add(rdbtnPortB2);
		
		JRadioButton rdbtnPortB1 = new JRadioButton("El producto es compatible con un sistema operativo");
		rdbtnPortB1.setActionCommand("1");
		rdbtnPortB1.setBounds(175, 289, 398, 23);
		panelPortabilidad.add(rdbtnPortB1);
		
		bgPortabilidadB = new ButtonGroup();
		bgPortabilidadB.add(rdbtnPortB3);
		bgPortabilidadB.add(rdbtnPortB2);
		bgPortabilidadB.add(rdbtnPortB1);
		
		
		panelPortabilidad.setVisible(false);
		panelUsabilidad.setVisible(false);
		
		panelResultados = new JPanel();
		panelResultados.setBounds(0, 0, 682, 489);
		contentPane.add(panelResultados);
		panelResultados.setLayout(null);
		
		JLabel lblResultadosDeLa = new JLabel("RESULTADOS DE LA EVALUACI\u00D3N");
		lblResultadosDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultadosDeLa.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblResultadosDeLa.setBounds(196, 11, 291, 29);
		panelResultados.add(lblResultadosDeLa);
		
		JSeparator separator11 = new JSeparator();
		separator11.setBounds(82, 38, 496, 2);
		panelResultados.add(separator11);
		
		JLabel lblFuncionalidad = new JLabel("FUNCIONALIDAD");
		lblFuncionalidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFuncionalidad.setBounds(41, 88, 123, 16);
		panelResultados.add(lblFuncionalidad);
		
		JLabel lblCaracteristicas = new JLabel("CARACTER\u00CDSTICAS");
		lblCaracteristicas.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCaracteristicas.setBounds(41, 51, 157, 14);
		panelResultados.add(lblCaracteristicas);
		
		JLabel lblSubcaracteristicas = new JLabel("SUBCARACTER\u00CDSTICAS");
		lblSubcaracteristicas.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSubcaracteristicas.setBounds(206, 51, 157, 14);
		panelResultados.add(lblSubcaracteristicas);
		
		JLabel lblResultados = new JLabel("RESULTADOS");
		lblResultados.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblResultados.setBounds(546, 51, 114, 14);
		panelResultados.add(lblResultados);
		
		JLabel lblSeguridadDeAcceso = new JLabel("SEGURIDAD DE ACCESO");
		lblSeguridadDeAcceso.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSeguridadDeAcceso.setBounds(204, 76, 174, 14);
		panelResultados.add(lblSeguridadDeAcceso);
		
		JLabel lblNewLabel = new JLabel("EX\u00C1CTITUD DE LOS RESULTADOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(206, 101, 208, 14);
		panelResultados.add(lblNewLabel);
		
		JLabel lblEficiencia1 = new JLabel("EFICIENCIA");
		lblEficiencia1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEficiencia1.setBounds(41, 151, 123, 14);
		panelResultados.add(lblEficiencia1);
		
		JLabel lblUtilizacinDelProcesador = new JLabel("UTILIZACI\u00D3N DEL PROCESADOR");
		lblUtilizacinDelProcesador.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUtilizacinDelProcesador.setBounds(206, 126, 208, 14);
		panelResultados.add(lblUtilizacinDelProcesador);
		
		JLabel lblNewLabel_1 = new JLabel("UTILIZACI\u00D3N DEL DISCO R\u00CDGIDO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(206, 151, 208, 14);
		panelResultados.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("UTILIZACI\u00D3N DE MEMORIA RAM");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(206, 176, 208, 14);
		panelResultados.add(lblNewLabel_2);
		
		JLabel lblMantenibilidad = new JLabel("MANTENIBILIDAD");
		lblMantenibilidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMantenibilidad.setBounds(41, 226, 123, 14);
		panelResultados.add(lblMantenibilidad);
		
		JLabel lblACapacidadDel = new JLabel("CAPACIDAD DEL C\u00D3DIGO DE SER ANALIZADO");
		lblACapacidadDel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblACapacidadDel.setBounds(206, 201, 285, 14);
		panelResultados.add(lblACapacidadDel);
		
		JLabel lblCapacidadDelCdigo = new JLabel("CAPACIDAD DEL C\u00D3DIGO DE SER CAMBIADO");
		lblCapacidadDelCdigo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCapacidadDelCdigo.setBounds(206, 226, 285, 14);
		panelResultados.add(lblCapacidadDelCdigo);
		
		JLabel lblEstabilidad = new JLabel("ESTABILIDAD");
		lblEstabilidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEstabilidad.setBounds(206, 251, 285, 14);
		panelResultados.add(lblEstabilidad);
		
		JLabel lblCapacidadDeSer = new JLabel("CAPACIDAD DE SER ENTENDIDO");
		lblCapacidadDeSer.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCapacidadDeSer.setBounds(206, 276, 264, 14);
		panelResultados.add(lblCapacidadDeSer);
		
		JLabel lblCapacidadDeSer_1 = new JLabel("CAPACIDAD DE SER ENTENDIDO");
		lblCapacidadDeSer_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCapacidadDeSer_1.setBounds(206, 301, 285, 14);
		panelResultados.add(lblCapacidadDeSer_1);
		
		JLabel lblCapacidadDeSer_2 = new JLabel("CAPACIDAD DE SER ATRACTIVO PARA EL USUARIO");
		lblCapacidadDeSer_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCapacidadDeSer_2.setBounds(206, 326, 314, 14);
		panelResultados.add(lblCapacidadDeSer_2);
		
		JLabel lblPortabilidad11 = new JLabel("PORTABILIDAD");
		lblPortabilidad11.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPortabilidad11.setBounds(41, 362, 114, 14);
		panelResultados.add(lblPortabilidad11);
		
		JLabel lblInstalabilidad = new JLabel("INSTALABILIDAD");
		lblInstalabilidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblInstalabilidad.setBounds(206, 351, 264, 14);
		panelResultados.add(lblInstalabilidad);
		
		JLabel lblAdaptabilidad = new JLabel("ADAPTABILIDAD");
		lblAdaptabilidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAdaptabilidad.setBounds(206, 376, 264, 14);
		panelResultados.add(lblAdaptabilidad);
		
		JLabel lblUsabilidad11 = new JLabel("USABILIDAD");
		lblUsabilidad11.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUsabilidad11.setBounds(41, 301, 114, 14);
		panelResultados.add(lblUsabilidad11);
		
		JLabel lblResultadoFinal = new JLabel("RESULTADO FINAL");
		lblResultadoFinal.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblResultadoFinal.setBounds(43, 437, 174, 19);
		panelResultados.add(lblResultadoFinal);
		
		textResultado = new JTextField();
		textResultado.setEditable(false);
		textResultado.setBounds(243, 438, 277, 20);
		panelResultados.add(textResultado);
		textResultado.setColumns(10);
		
		textFunA = new JTextField();
		textFunA.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textFunA.setEditable(false);
		textFunA.setBounds(530, 74, 130, 20);
		panelResultados.add(textFunA);
		textFunA.setColumns(10);
		
		textFunB = new JTextField();
		textFunB.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textFunB.setEditable(false);
		textFunB.setBounds(530, 99, 130, 20);
		panelResultados.add(textFunB);
		textFunB.setColumns(10);
		
		textEficA = new JTextField();
		textEficA.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textEficA.setEditable(false);
		textEficA.setBounds(530, 124, 130, 20);
		panelResultados.add(textEficA);
		textEficA.setColumns(10);
		
		textEficB = new JTextField();
		textEficB.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textEficB.setEditable(false);
		textEficB.setBounds(530, 149, 130, 20);
		panelResultados.add(textEficB);
		textEficB.setColumns(10);
		
		textEficC = new JTextField();
		textEficC.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textEficC.setEditable(false);
		textEficC.setBounds(530, 174, 130, 20);
		panelResultados.add(textEficC);
		textEficC.setColumns(10);
		
		textMantA = new JTextField();
		textMantA.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textMantA.setEditable(false);
		textMantA.setBounds(530, 199, 130, 20);
		panelResultados.add(textMantA);
		textMantA.setColumns(10);
		
		textMantB = new JTextField();
		textMantB.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textMantB.setEditable(false);
		textMantB.setBounds(530, 224, 130, 20);
		panelResultados.add(textMantB);
		textMantB.setColumns(10);
		
		textMantC = new JTextField();
		textMantC.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textMantC.setEditable(false);
		textMantC.setBounds(530, 249, 130, 20);
		panelResultados.add(textMantC);
		textMantC.setColumns(10);
		
		textUsabA = new JTextField();
		textUsabA.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textUsabA.setEditable(false);
		textUsabA.setBounds(530, 274, 130, 20);
		panelResultados.add(textUsabA);
		textUsabA.setColumns(10);
		
		textUsabB = new JTextField();
		textUsabB.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textUsabB.setEditable(false);
		textUsabB.setBounds(530, 299, 130, 20);
		panelResultados.add(textUsabB);
		textUsabB.setColumns(10);
		
		textUsabC = new JTextField();
		textUsabC.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textUsabC.setEditable(false);
		textUsabC.setBounds(530, 324, 130, 20);
		panelResultados.add(textUsabC);
		textUsabC.setColumns(10);
		
		textFPortA = new JTextField();
		textFPortA.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textFPortA.setEditable(false);
		textFPortA.setBounds(530, 349, 130, 20);
		panelResultados.add(textFPortA);
		textFPortA.setColumns(10);
		
		textFPortB = new JTextField();
		textFPortB.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textFPortB.setEditable(false);
		textFPortB.setBounds(530, 374, 130, 20);
		panelResultados.add(textFPortB);
		textFPortB.setColumns(10);
		
	}
	
	private void alertaSalir() {
		
		int opcion;
		opcion = JOptionPane.showConfirmDialog(null, "Desea salir? (Perdera el progreso de la evaluaci�n)",
				"Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(opcion == 0)
			System.exit(0);
		
	}
	
	private void calcularResultados() {
		
		//if(bgFuncionalidadA.get)
		
	}
}