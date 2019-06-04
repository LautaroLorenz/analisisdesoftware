package ventana;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

import Funcion.Funcion;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Action;

import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JScrollPane;
import java.awt.Font;

@SuppressWarnings("serial")
public class HerramientaDeTesting extends JFrame {
	
	/*
	 * PARECE QUE EL TIENE PROBLEMAS CON CODIGOS DE 100 LINEAS, VALIDAR PORQ
	 * esto pasa en la funcion
	 * private void jbnAceptarActionPerformed(java...)
	 * private void mostrarUsuario
	 * 
	 * estos metodos son de la clase main
	 */

	private JPanel contentPane;
	private JTextField textField;
	private ArrayList<Funcion> funciones = new ArrayList<Funcion>();
	private List listMetodos = new List();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private final Action action = new SwingAction();;
	String ruta;
	private List codigo = new List();
	ArrayList<int[]> matriz= new ArrayList<int[]>();
	private boolean resultados = false;
	
	
	String lim = "hola";
	
	Color colorfondodefault;
    Highlighter hilit;
    Highlighter.HighlightPainter painter;
    JTextArea textArea = new JTextArea();
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HerramientaDeTesting frame = new HerramientaDeTesting();
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
	public HerramientaDeTesting() {
		

		setTitle("EQUIPO 7*****Herramienta de Testing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 994, 704);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(122, 22, 846, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Metodos encontrados");
		lblNewLabel.setBounds(76, 102, 129, 34);
		
		contentPane.add(lblNewLabel);
		listMetodos.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent arg0) {
				textArea.removeAll();
				matriz.clear();
				
			}
			
			@Override
			public void focusGained(FocusEvent arg0) {
				mostrarMetodo();
			
			}

		});
		listMetodos.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				mostrarMetodo();
				
			}
			
		});
		listMetodos.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				mostrarMetodo();
				
			}
		});
		
		listMetodos.setBounds(20, 142, 399, 188);
		contentPane.add(listMetodos);
		
		hilit = new DefaultHighlighter();
        painter = new DefaultHighlighter.DefaultHighlightPainter(Color.GREEN);
        
       
	
		
		JLabel lblNewLabel_1 = new JLabel("Analisis del metodo");
		lblNewLabel_1.setBounds(731, 112, 163, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lineas de codigo");
		lblNewLabel_2.setBounds(638, 151, 100, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Lineas comentadas");
		lblNewLabel_3.setBounds(624, 176, 119, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Porcentaje de codigo comentado");
		lblNewLabel_4.setBounds(559, 201, 191, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Complejidad ciclomatica");
		lblNewLabel_5.setBounds(600, 226, 150, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(749, 148, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(749, 173, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(749, 198, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(749, 223, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		
		
		
		JButton btnNewButton = new JButton("Archivo");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setBounds(10, 21, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					elegirArchivo();
					textField.setText(ruta);
					
						
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			
		});
		contentPane.add(btnNewButton);
		
		JLabel lblCodigoFuente = new JLabel("Codigo fuente");
		lblCodigoFuente.setBounds(76, 336, 129, 34);
		contentPane.add(lblCodigoFuente);
		
		JButton btnNewButton_1 = new JButton("Correr An\u00E1lisis");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBackground(Color.ORANGE);
		//SABRI: ACA VALIDAR SI NO HAY NADA SELECCIONADO
		
		btnNewButton_1.setAction(action);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularValoresAnalisis();
			}
		});
		btnNewButton_1.setBounds(425, 253, 129, 76);
		contentPane.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 381, 536, 239);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setForeground(Color.BLACK);
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(749, 254, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(749, 285, 86, 20);
		contentPane.add(textField_6);
		
		JLabel lblFanIn = new JLabel("Fan in");
		lblFanIn.setBounds(679, 260, 48, 14);
		contentPane.add(lblFanIn);
		
		JLabel lblFanOut = new JLabel("Fan out");
		lblFanOut.setBounds(679, 285, 48, 14);
		contentPane.add(lblFanOut);
		
		JLabel lblLongitud = new JLabel("Longitud");
		lblLongitud.setBounds(676, 316, 67, 14);
		contentPane.add(lblLongitud);
		
		JLabel lblVolumen = new JLabel("Volumen");
		lblVolumen.setBounds(676, 346, 67, 14);
		contentPane.add(lblVolumen);
		
		JLabel lblEzfuerzo = new JLabel("Ezfuerzo");
		lblEzfuerzo.setBounds(676, 375, 67, 14);
		contentPane.add(lblEzfuerzo);
		
		textField_7 = new JTextField();
		textField_7.setBounds(749, 316, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(749, 343, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(749, 372, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblReporteDeAnalisis = new JLabel("Reporte de analisis");
		lblReporteDeAnalisis.setBounds(574, 417, 261, 14);
		contentPane.add(lblReporteDeAnalisis);

	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Correr Analisis");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private void mostrarMetodo(){ 
		//Si se corrio un analisis se limpian los campos al cambiar de metodo
		if(resultados)
			limpiarRegistro();
		
		String linea = "";
		String subLinea="";
		int indeX = 0;
		int indeY = 0;

		textArea.removeAll();
		matriz.clear();
		
		try {
		for(int i = 0; i< funciones.get(listMetodos.getSelectedIndex()).getCodigo().size();i++){
			indeX = linea.length();
			indeY = indeX+funciones.get(listMetodos.getSelectedIndex()).getCodigo().get(i).length();
			subLinea = funciones.get(listMetodos.getSelectedIndex()).getCodigo().get(i);
			linea = linea+"\n"+funciones.get(listMetodos.getSelectedIndex()).getCodigo().get(i);

			if(subLinea.contains("if(") || linea.contains("while(") || linea.contains("for(")){
				int a[] = {indeX,indeY};
				matriz.add(a);					
			}
		}
		} catch (ArrayIndexOutOfBoundsException e) {
			indeX= indeY = 0;
			textArea.removeAll();
			matriz.clear();
			textArea.requestFocus();
			return;
		}
		textArea.setText(linea);
		textArea.setHighlighter(hilit);
		for(int i = 0; i<matriz.size();i++){
			 try {
					hilit.addHighlight(matriz.get(i)[0], matriz.get(i)[1], painter);
					
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
		
		indeX= indeY = 0;
		textArea.requestFocus();
									
		
	}
	
	private void limpiarRegistro() {
		
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
		textField_4.setText("");
		textField_5.setText("");
		textField_6.setText("");
		textField_7.setText("");
		textField_8.setText("");
		textField_9.setText("");
		resultados=false;
	}
	
	/*
	 * LOGICA DE PANTALLA
	 */
	private void elegirArchivo() throws FileNotFoundException {
		//Scanner entrada = null;
		listMetodos.removeAll();
		textArea.setText("");

		JFileChooser selectorArchivos = new JFileChooser();
	
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos Java", "java");
		selectorArchivos.setFileFilter(filtro);
		selectorArchivos.showOpenDialog(selectorArchivos);
		
		ruta = selectorArchivos.getSelectedFile().getAbsolutePath();
		buscarMetodos(ruta);
	}
	
	private void buscarMetodos(String ruta) throws FileNotFoundException {
		
		funciones = Funcion.getFuncionesArchivo(ruta);
		
		for (int j = 0; j < funciones.size(); j++) {
			listMetodos.add(funciones.get(j).namefuncion);
		}
		
	}
	
	private void calcularValoresAnalisis(){
		try{
			int index = listMetodos.getSelectedIndex();
			int lineasCodigo = funciones.get(index).getLlaveCierreFun()-funciones.get(index).getNumLiniaIni()+1;
			double porcentajeCodigoComentado = (funciones.get(index).getCantlineaComentario()* 100)/lineasCodigo;
			resultados = true;
			textField_1.setText(lineasCodigo+"");
			textField_2.setText(funciones.get(index).getCantlineaComentario()+"");
			textField_3.setText(porcentajeCodigoComentado+"");
			textField_4.setText(funciones.get(index).getComplejidadCiclomatica()+"");
			textField_5.setText(funciones.get(index).getFanIn()+"");
			textField_6.setText(funciones.get(index).getFanOut()+"");
			textField_7.setText(funciones.get(index).getLongitud()+"");
			textField_8.setText(funciones.get(index).getVolumen()+"");
			textField_9.setText(funciones.get(index).getEsfuerzo()+"");
		}catch(Exception e) {
			//en caso de correr analisis sin seleccionar un metodo
			resultados = false;
			return;
		}
		
		

	}
}
