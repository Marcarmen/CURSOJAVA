/*TEMA: CICLOS
 * NOMBRE: MARIA DEL CARMEN LIMA GARCIA
 * CAPACITADOR: VICTOR SAUCEDO CASTILLO
 *
 * DEFINICIÓN DO WHILE: Permite ejecutar un bloque de código al menos 1 vez
 * y luego repetir la ejecución del bloque mientras la ejecución a evaluar sea verdadera.
 */
public class DoWhile {
    public static void main(String[] args) {
        /*MANDAMOS EL SIGUIENTE MENSAJE*/
        System.out.println(" CICLO DO WHILE ");

        /*DEFINIMOS NUESTRA VARIABLE*/
        /*INICIALIZAMOS NUESTRA CON EL VALOR DE 1*/
        var contador = 1;

        /*POSTERIORMENTE USAMOS NUESTRO CICLO*/
        do {
            System.out.println(contador++); /*MANDA A IMPRIMIR DIRECTAMENTE LA VARIABLE CONTADOR*/
        }while (contador <=3); /*ESTE PROGRAMA VA A IMPRIMIR LOS VALORES DEL 1 AL 3 */
    }
}
