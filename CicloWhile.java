/*TEMA: CICLOS
 * NOMBRE: MARIA DEL CARMEN LIMA GARCIA
 * CAPACITADOR: VICTOR SAUCEDO CASTILLO
 *
 * DEFINICIÓN: Los ciclos o bien (bucles) se utilizan para ejecutar,
 * de manera repetitiva un bloque de código mientras la condición
 * a evaluar sea verdadera.
 */

public class CicloWhile {
    /*METODO PRINCIPAL MAIN*/

    public static void main(String[] args) {
        /*MANDAMOS EL SIGUIENTE MENSAJE*/
        System.out.println(" CICLO WHILE ");

        /*DEFINIMOS NUESTRA VARIABLE*/
        /*INICIALIZAMOS NUESTRA CON EL VALOR DE 1*/
        var contador = 1;

        /*POSTERIORMENTE USAMOS NUESTRO CICLO*/
        while (contador  <= 5){ /*MANDAMOS A IMPRIMIR LOS NUMERO DEL 1 AL 5*/
            System.out.println(contador);
        contador ++; /*INCREMENTAMOS EL VALOR DE LA VARIABLE CONTADOR*/
        }

    }
}
