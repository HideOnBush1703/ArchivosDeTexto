
package paquete2;

import java.io.File;

public class ArchivosDeTexto2 {
    
    File archivo;
    
     private void crearDirectorio(){
        archivo = new File("carpetaPrueba2");
        
        if(archivo.mkdir()){//directorio creado correctamente
            System.out.println("Se ha creado el directorio correctamente");
        }
        else{
            System.out.println("Error, no se ha podido crear el directorio");
        }
        
    }
     public static void main(String[] args) {
        ArchivosDeTexto2 archivos=new ArchivosDeTexto2();
        archivos.crearDirectorio();
    }
}
