/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package botiga;
import Utils.Utils;
//import com.Ostermiller.util.Base64;
import java.io.File;
import java.io.Serializable;


public class Productos implements Serializable {
 private String Nombre = "";
   private String Descripcion = "";
    private double Precio= 0;

    public Productos()
    {
        this.Nombre = "";
        this.Descripcion = "";
        this.Precio = 0;

    }


  public Productos(String nombre,String descripcion,double precio)
    {
        this.Nombre = nombre;
        this.Descripcion = descripcion;
        this.Precio = precio;


    }

   public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

  public void setPrecio(double precio2) {
        this.Precio = precio2;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public double getPrecio() {
        return this.Precio;
    }

    public String getDescripcion() {
       return this.Descripcion;
    }

    //funciones de gestion de ficheros nuevas
    public Productos[] cargarProductos(File fitxer2)
    {
        return Utils.llegirProductes(fitxer2);
    }

    public void guardarProductos(Productos[] array)
    {
        Utils.escriureFitxer2("src\\ficheros\\productos.dat", array);
    }
   
    
}
