/*TEMA: VARAIBLES EN JAVA
* NOMBRE: MARIA DEL CARMEN LIMA GARCIA
* CAPACITADOR: VICTOR SAUCEDO CASTILLO
*
* DEFINICIÓN: Son aquellas que almacenan un valor o dato, y pueden
cambiar durante la ejecución.
*/

/*Nuestra clase lleva por nombre Variables,
clase pública*/
public class Variables {

/*El método public static void main(String[] args)
en Java es el punto de entrada de cualquier programa Java.
*/
    public static void main(String[] args) {
        //Creación de variables ejemplos:
        // Definimos las siguientes variables
        // Sintaxis: Tipo_nombre_variable_valor

        int edad = 31;
        double precio = 300.40;
        boolean disponible = true; // El valor varia True/False
        char genero;
        //A la variable genero se le asigna un valor:
        genero = 'F'; // M-Maculino //F-Femenino

       // Accedemos a las variables ó bien mandamos a imprimir las variables:
        //Escribimos la palabra sout y presionamos la tecla tabulador

        System.out.println(edad);
        System.out.println(precio);
    }
}
