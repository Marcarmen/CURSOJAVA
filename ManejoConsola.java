/*TEMA: ENTRADA DE DATOS POR CONSOLA:
 * NOMBRE: MARIA DEL CARMEN LIMA GARCIA
 * CAPACITADOR: VICTOR SAUCEDO CASTILLO
 *
 * DEFINICIÓN:Entrada de Datos por Consola
 * in-put Entrada de datos
 */

//Importamos paqueteria Scanner
import java.util.Scanner;

public class ManejoConsola {
    /*MÉTODO PRINCIPAL MAIN*/

    public static void main(String[] args) {

        //Introdución de valores por consola
        //Definimos variable
        var consola = new Scanner(System.in); // in-put Entrada de datos
        System.out.println("Escribe tu nombre");

        //Definimos la variable, leyendo una linea completa de la consola:
        var nombre = consola.nextLine();

        //Imprimimos la variable nombre:
        System.out.println("nombre = " + nombre);

    }
}
