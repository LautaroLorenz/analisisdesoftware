package proyecto;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

public class Proyecto {

	private String carpetaProyecto;
	private ArrayList<Clase> pathClases;
	
	public Proyecto(File pathProyecto) {
		this.carpetaProyecto = pathProyecto.getAbsolutePath();
		this.pathClases = new ArrayList<>();
		getClases(pathProyecto);
		/*for(String f : pathClases) {
			System.out.println(f);
		}*/
		
	}
	
	private void getClases(final File carpeta) {
		for(File clase : carpeta.listFiles(filtroJava)) {
			pathClases.add(new Clase(clase));
		}
		for(final File paths : carpeta.listFiles(filtropath)) {
				getClases(paths);
			}
	}
	
	private FileFilter filtropath = new FileFilter() {
		
		@Override
		public boolean accept(File file) {
			return file.isDirectory();
		}
	};
	private FileFilter filtroJava = new FileFilter() {
		
		@Override
		public boolean accept(File file) {
			return file.getName().endsWith(".java");
		}
	};
	
	public String getNombreProyecto() {
		return carpetaProyecto;
	}

	public ArrayList<Clase> getPathClases() {
		return pathClases;
	}
	
}
