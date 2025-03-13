/*TEMA: ARREGLOS
 * NOMBRE: MARIA DEL CARMEN LIMA GARCIA
 * CAPACITADOR: VICTOR SAUCEDO CASTILLO
 *
 * DEFINICIÓN:Una matriz es una estructura de datos,
 * que permite almacenar varios valores del mismo tipo en una sola variable.

 */

public class Matrices {
    /*El método main() es el punto en el que comienza la ejecución,
    de una aplicación Java*/
    public static void main(String[] args) {
        //DEFINIMOS UNA MATRIZ
        // LA MATRIZ CONTENDRA 2 RENGLONES
        // POR 3 COLUMNAS
        //UTILIZANDO LA SINTAXIS DE TIPO EXPLICITO DE TIPO INT.

        //int [][] matriz = new int[2][3]// 2 RENGLONES, 3 COLUMNAS
        var matriz = new int [2][3];
        //MODIFICAMOS LOS VALORES DE LA MATRIZ
        matriz [0][0]=100;
        matriz [0][1]=200;
        matriz [0][2]=300;
        matriz [1][0]=400;
        matriz [1][1]=500;
        matriz [1][2]=600;
        //ACCEDEMOS A LOS VALORES:
        System.out.println("VALOR 1 [0][0] = " + matriz [0][0]);

    }

}
