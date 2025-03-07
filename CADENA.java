/*TEMA: MANEJO DE CADENAS
* NOMBRE: MARIA DEL CARMEN LIMA GARCIA
* CAPACITADOR: VICTOR SAUCEDO CASTILLO
*
* DEFINICIÓN: Las cadenas son secuencias de caracteres que se utilizan para almacenar y manipular textos.
En java son objetos que instancias clases String.

*/

public class CADENA {
    //METODO PRINCIPAL MAIN

    public static void main(String[] args) {
        //IMPRIMIMOS EL SIGUIENTE MENSAJE:
        System.out.println( "Manejo de Cadenas en Java");

        //DEFINIMOS LA CADENA 1:
        var cadena1 = "Hola Maria";
        //IMPRIMIMOS LA CADENA 1:
        System.out.println("cadena1="  +cadena1);

        //DEFINIMOS LA CADENA 2:
        //SINTAXIS FORMAR PARA CREAR OBJETOS new  de tipo String
        var cadena2 = new String("Lima Garcia");
        //IMPRIMIMOS LA CADENA 2:
        System.out.println("cadena2 ="+ cadena2);

        //CONCATENACIÓN DE CADENAS:

        var cadena3 = cadena1 + " " + cadena2;
        //IMPRIMIMOS UNA TERCERA CADENA:
        System.out.println("cadena3 = " + cadena3);

    }
}
