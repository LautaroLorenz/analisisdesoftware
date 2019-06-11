package busquedaFunciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Funcion {
	
	public static  int CANTLINEAARCHIVO = 0;
	private String namefuncion;
	private int numLiniaIni;
	private int numLineaFin;
	//private int cantParam;
	private int cantIf;
	private int cantFor;
	private int cantWhile;
	private int cantlineaComentario;
	private int llaveAperturaFun;
	private int llaveCierreFun;
	private int contadorLlaves;
	private ArrayList<String> codigo;
	
	public Funcion(){
		this.namefuncion = "";
		this.numLiniaIni = 0;
		//this.numLineaFin = 0;
		this.cantIf = 0;
		this.cantFor = 0;
		this.cantWhile = 0;
		this.cantlineaComentario = 0;
		this.llaveAperturaFun =0;
		this.llaveCierreFun = 0;
		this.contadorLlaves = 0;
		this.codigo = new ArrayList<String>();
	}
	
	public static ArrayList<Funcion> getFuncionesArvhivo(String archivo) throws FileNotFoundException{
		
		ArrayList<Funcion> listaFun = new ArrayList<Funcion>();
		Funcion fun = null;
		Scanner sc = new Scanner(new File(archivo));
		String linea;
		boolean cargandoFuncion = false;
		
		while(sc.hasNextLine()){
			CANTLINEAARCHIVO++;
			linea = sc.nextLine();
			linea = linea.trim();
			/*
			 * ME FALTA VER SI AGREGO UNA BANDEAR PARA CONTROLAR CUANDO ESTOY EN PROCESO
			 * DE CARGAR UNA FUNCION.
			 * TENGO QUE VER SI DICHO CASO ES VIABLE QUE SUCEDA.
			 * TEORICAMENTE NO PERO TODO DEPENDE DE COMOE STA EL CODIGO.
			 */
			if(esFuncion(linea)  ){
				fun = new Funcion();
				//System.out.println(linea);
				fun.codigo.add(linea);
				fun.namefuncion = linea;
				fun.namefuncion.replace("{", "");
				cargandoFuncion = true;
				fun.numLiniaIni = CANTLINEAARCHIVO;
				if(linea.contains("{")){
					fun.llaveAperturaFun = CANTLINEAARCHIVO;
				}
					
				
			}
			else{
				if(cargandoFuncion){// con esto salto los primero import
					fun.codigo.add(linea);
					if(linea.contains("if("))
						fun.cantIf++;
					if(linea.contains("for("))
						fun.cantFor++;
					if(linea.contains("while("))
						fun.cantWhile++;
					if(linea.contains("/*") || linea.contains("*") || linea.contains("//") )
						fun.cantlineaComentario++;
				}
					
			}
			
			if(linea.contains("{")&&cargandoFuncion){
				if(fun.contadorLlaves==0)
					fun.llaveAperturaFun = CANTLINEAARCHIVO;
				fun.contadorLlaves++;
				
			}
			if(linea.contains("}") && cargandoFuncion){
				fun.contadorLlaves--;
				if(cargandoFuncion && fun.contadorLlaves==0){
					cargandoFuncion = false;
					listaFun.add(fun);
					//System.out.println("se termino de cargar funcion");
					fun.llaveCierreFun = CANTLINEAARCHIVO;
				}
			}
			
				
			
		}
		
		return listaFun;
		
	}
	
	
	
	public static boolean esFuncion(String linea){
		
		String secciones[];
		if(linea.contains("package") || linea.contains("import") || linea.contains("class") ||
		   linea.contains("interface") || linea.contains("Enum") || linea.contains("/*") || 
		   linea.contains("*/") || linea.startsWith("*", 1) )
			// TODAVIA NO VALIDE EL TEMA DE LAS DELCARACION DE PARAMETROS CON LLAVE
		return false;
		if(linea.contains("(") && linea.contains(")") && 
		  (linea.contains("public")|| linea.contains("private")))
			return true;
		else return false;
		
		//secciones  = linea.split(" "); 
		//System.out.print(secciones.length);
		//if (secciones.length == 3)
			
			//return false;
		
	}
	
	public static void mostrarFuncion(Funcion fun){
		
		System.out.println("=====================================================");
		System.out.println("namefuncion: "+fun.namefuncion);
	    System.out.println("numLiniaIni: "+fun.numLiniaIni);
		//System.out.println("numLineaFin:"+fun.numLineaFin);
		System.out.println("cantIf: "+fun.cantIf);
		System.out.println("cantFor: "+fun.cantFor);
		System.out.println("cantWhile: "+fun.cantWhile);
		System.out.println("cantlineaComentario: "+fun.cantlineaComentario);
		System.out.println("llaveAperturaFun: "+fun.llaveAperturaFun);
		System.out.println("llaveCierreFun: "+fun.llaveCierreFun);
		System.out.println("contadorLlaves:"+fun.contadorLlaves);
		System.out.println("===============codigo==================================");
		for(int  i= 0; i < fun.codigo.size();i++)
			System.out.println(fun.codigo.get(i));

		
	}
}
