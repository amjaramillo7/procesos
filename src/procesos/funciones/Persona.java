package procesos.funciones;

import java.awt.Font;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author amjaramillo7
 */

public class Persona {
    /*
    * Creación e incialización de las variables
    */
    public static String Nombres="Amys Madalaine";
    public static String Apellidos="Jaramillo Rodriguez";
    public static String Sexo="Femenino";
    public static String NroTelefono="0997522391";
    public static String Cedula="1104437619";
    public static String Ciudad="Loja - Ecuador";
    public static String Direccion="Ciudadela Zamora";
    /*
    * Variable Path, ruta donde se guardará el archivo de texto
    */
    public static String Path="D:\\DATOS\\Desktop\\datosPersona.txt";
    public static void main(String[] args) throws IOException {
        int opc=0;
        Scanner lector = new Scanner(System.in);
        opc = Integer.parseInt(JOptionPane.showInputDialog("Ingresa una opción \n 1. Generar archivo \n 2. Leer archivo"));
        switch(opc) {
        case 1: 
            writeFile();
            break;
        case 2: 
            readFile();
            break;
        
        }
    }
    public static void writeFile() throws IOException{
        File file = new File(Path); // Instanciamos la Clase File
        if (!file.exists()) { //Solo si el archivo no existe se lo crea, caso contrario se presenta una alerta
            BufferedWriter bw = new BufferedWriter(new FileWriter(Path)); //Creamos el archivo
            /*
            * Escribimos el cuerpo del texto que tendrá el archivo persona.txt
            */
            bw.write("Nombres:" + Nombres + "\n");
            bw.write("Apellidos:" + Apellidos + "\n");
            bw.write("Sexo:" + Sexo + "\n");
            bw.write("NroTelefono:" + NroTelefono + "\n");
            bw.write("Cedula:" + Cedula + "\n");
            bw.write("Ciudad:" + Ciudad + "\n");
            bw.write("Direccion:" + Direccion + "\n");
            bw.close();
            JOptionPane.showMessageDialog(null, "El archivo se a creado correctamente ...");
        }else{
            JOptionPane.showMessageDialog(null, "ERROR, El archivo ya se encuentra creado ...");
        
        }
    }
    public static void readFile(){
        BufferedReader br = null;
		try {
			String Line;
			br = new BufferedReader(new FileReader(Path));
			while ((Line = br.readLine()) != null) { //recorremos y presentamos el contenido del archivo de texto
                            System.out.println(Line); // imprimimos cada linea del archivo
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
    }

}