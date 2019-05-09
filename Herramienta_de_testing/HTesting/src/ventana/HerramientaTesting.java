package ventana;

import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;

import javax.swing.JSeparator;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;

public class HerramientaTesting {

	protected static final int FILES_ONLY = 0;
	private JFrame frame;
	String ruta;
	private List listMetodos = new List();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HerramientaTesting window = new HerramientaTesting();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HerramientaTesting() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 994, 804);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnArchivo = new JButton("Archivo");
		btnArchivo.setBounds(0, 0, 153, 29);
		btnArchivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					elegirArchivo();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			
		});
		btnArchivo.addMouseListener(new MouseAdapter() {
			
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnArchivo);
		
		
		listMetodos.setBounds(10, 70, 200, 209);
		listMetodos.setMultipleSelections(false);
		frame.getContentPane().add(listMetodos);
		
		JLabel lblMetodos = new JLabel("Metodos:");
		lblMetodos.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblMetodos.setBounds(15, 44, 105, 21);
		frame.getContentPane().add(lblMetodos);
	}
	private void elegirArchivo() throws FileNotFoundException {
		Scanner entrada = null;
		// muestra el cuadro de diálogo de archivos, para que el usuario pueda elegir el archivo a abrir
		JFileChooser selectorArchivos = new JFileChooser();
	
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos Java", "java");
		selectorArchivos.setFileFilter(filtro);
		selectorArchivos.showOpenDialog(selectorArchivos);

            ruta = selectorArchivos.getSelectedFile().getAbsolutePath();
            File f = new File(ruta);
            entrada = new Scanner(f);
            buscarMetodos(entrada);
        
	}

	private void buscarMetodos(Scanner entrada) {
		ArrayList<String> metodos = new ArrayList<String>();
		String linea=null;
		int nroLineainicio=1;
		int nroLineaFin;
		boolean esMetodo = false;
		int i=0;
		String nombreDelMetodo = null;
		
		while (entrada.hasNext()) {
			
			linea=entrada.nextLine().trim();
			i++;
			/**	String[] x = linea.split("(",1);
			if(x[2].contains(")") && x[2].contains("}")){
				//INSERTE AQUI COMO DETECTAR SI ES LA DECLARACION UN METODO Y SU NOMBRE
				x = x[1].split(" ");
	 			nombreDelMetodo = x[x.length];
				esMetodo = true; 
				nroLineainicio= i;
			}**/
			
			
			while (esMetodo && entrada.hasNext()) {
				linea=entrada.nextLine().trim();
				i++;
				if(linea.contains("}"))
					esMetodo=false;
			}
			nroLineaFin = i;
			metodos.add("nombreMetodo"/**+nombreDelMetodo**/+","+nroLineainicio+","+ nroLineaFin);
			
			esMetodo = false;
         }
		for (int j = 0; j < metodos.size(); j++) {
			listMetodos.add(metodos.get(j));
		}
		
	}
}
