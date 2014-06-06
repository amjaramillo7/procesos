package procesos.funciones;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

/**
 * @author amjaramillo7
 */

public class Persona {
    /*
    * Creación e incialización de las variables
    */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);  //crear un objeto Scanner
        String Nombre_Completo;
        String Apellidos;
        String Cedula;
        String Ciudad;
        String Sexo;
        String Direccion;
        
        System.out.print("Nombre: ");
        Nombre_Completo = sc.nextLine();  //leer un String

        System.out.print("Apellido: ");
        Apellidos = sc.nextLine();  //leer un String

        System.out.print("Cedula: ");
        Cedula = sc.nextLine();  //leer un String
        
         System.out.print("Ciudad: ");
        Ciudad = sc.nextLine();  //leer un String
        
        System.out.print("Sexo: ");
        Sexo = sc.nextLine();  //leer un String
        
        System.out.print("Dirección: ");
        Direccion = sc.nextLine();  //leer un String
        
        String datos = "Hola " + Nombre_Completo + " "+"este es el registro de tus datos ingresados:"+ "\r\n"+
                       "Nombres Completos: "+Nombre_Completo+"\r\n"+
                       "Apellidos: "+Apellidos+"\r\n"+
                       "Cedula de ciudadania: "+Cedula+"\r\n"+
                       "Ciudad de Origen: "+Ciudad+"\r\n"+
                       "Sexo: "+Sexo+"\r\n"+Direccion+"\r\n";
        writeFile(datos);
        
    }
    public static String Path = "D:\\DATOS\\Desktop\\DatosPersona.txt";
    
    public static void writeFile(String valor) throws IOException {
        File file = new File(Path); // Instanciamos la Clase File
        if (!file.exists()) { //Solo si el archivo no existe se lo crea, caso contrario se presenta una alerta]
            file.createNewFile();
        }
        BufferedWriter buffer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "utf-8"));
        buffer.write(valor);
        buffer.close();
    }
   
    

}