
package paquete1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArchivosDeTexto {
    
    File archivo;
    
    private void crearArchivo(){ //metodo para crear un archivo con ese nombre y su excepcion
        archivo = new File("prueba.txt");
        
        try {
            if(archivo.createNewFile()){
                System.out.println("El archivo se ha creado correctamente");
            }
        } catch (IOException ex) {
            System.err.println("No se pudo crear el archivo"+ex); //salta cuando se usa la ruta absoluta y no coincide.
        }
        
    }
    
    public void escribirTexto(){
        try {
            FileWriter escribir=new FileWriter(archivo);
            escribir.write("Carlos Josue Pariguana Angulo ha escrito sobre este archivo ctm");
            escribir.write("\r\nY lo hizo a través de java");//\r retorno de carro: Regresa a la primera letra y recién salta.
            escribir.write("\rcojinova");
            escribir.close(); //cerrar el objeto escribir, cerrar el archivo. Es la maneera correcta.
        } catch (IOException ex) {
            System.err.println("Error, no se pudo escribir sobre el archivo");
        }
    }
    
    private void añadirTexto(){
        try {
            FileWriter escribir=new FileWriter(archivo, true); //el true activa el metodo append, o sea, no va escribir, va añadir más texto.
            escribir.write("\rMucho más texto");
            escribir.write("\r\nMil Pilas");
            escribir.write("\ranchoveta");
            escribir.close();
        } catch (IOException ex) {
            System.err.println("Error, no se pudo escribir sobre el archivo");
        }
    }
    
 
        public static void main(String[] args){
            ArchivosDeTexto archivos=new ArchivosDeTexto();
            
            archivos.crearArchivo();
            archivos.escribirTexto();
            archivos.añadirTexto();
        }
    
}
