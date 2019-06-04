package graficos;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import proyecto.Clase;
import proyecto.Proyecto;

import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldMostrarPath;
	private JLabel lblClases;
	private JList<String> listClases;
	private JList<String> listMetodos;
	private JButton btnAbrirDirectorio;
	private JScrollPane scrollPane;
	private JLabel lblMetoddos;
	private Proyecto proyecto;
	ArrayList<Clase > clases;

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
		setTitle("Herramienta de Testing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 851, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnAbrirDirectorio = new JButton("Abrir Directorio");
		btnAbrirDirectorio.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAbrirDirectorio.addActionListener(buscarProyecto);
		btnAbrirDirectorio.setBounds(10, 11, 135, 23);
		contentPane.add(btnAbrirDirectorio);
		
		textFieldMostrarPath = new JTextField();
		textFieldMostrarPath.setBounds(160, 12, 591, 23);
		contentPane.add(textFieldMostrarPath);
		textFieldMostrarPath.setColumns(10);
		
		lblClases = new JLabel("Clases", SwingConstants.CENTER);
		lblClases.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblClases.setBounds(42, 45, 117, 23);
		contentPane.add(lblClases);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 79, 182, 207);
		contentPane.add(scrollPane);
		
		listClases = new JList<String>();
		listClases.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				/*  Desplegar los metodos de la clase elegida */
			}
		});
		scrollPane.setViewportView(listClases);
		
		lblMetoddos = new JLabel("Métodos", SwingConstants.CENTER);
		lblMetoddos.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMetoddos.setBounds(299, 45, 83, 23);
		contentPane.add(lblMetoddos);
		
		listMetodos = new JList<String>();
		listMetodos.setBounds(239, 79, 189, 207);
		contentPane.add(listMetodos);
		
	}
	
	ActionListener buscarProyecto = new ActionListener() {
		
		
			public void actionPerformed(ActionEvent arg0) {
				
				JFileChooser buscador = new JFileChooser();
				buscador.setDialogTitle("Abrir proyecto a testear");
				buscador.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				if(buscador.showOpenDialog(buscador) == JFileChooser.APPROVE_OPTION) {
					File pathProyecto = buscador.getSelectedFile();
					textFieldMostrarPath.setText(pathProyecto.getAbsolutePath());
					proyecto = new Proyecto(pathProyecto);
					
					clases = proyecto.getPathClases();
					
					DefaultListModel<String> modelo = new DefaultListModel<String>();
					for(int i = 0; i < clases.size(); i ++) {
						modelo.addElement(clases.get(i).getNombreClase());
					}
					listClases.setModel(modelo);
				}
			}
	};
}
