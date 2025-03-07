/*TEMA: ENTRADA DE DATOS POR CONSOLA:
* NOMBRE: MARIA DEL CARMEN LIMA GARCIA
* CAPACITADOR: VICTOR SAUCEDO CASTILLO
*
* DEFINICIÓN: Podemos hacer uso de la clase Scanner,
* La cual pertenece al pequete java.util
*/

/*IMPORTAMOS LA PAQUETERIA*/
import java.util.Scanner;

public class LeerTiposDatos {
    //METODO PRINCIPAL
    public static void main(String[] args) {

        // Un ejemplo de la creación del objeto Scanner es:
        var consola = new Scanner(System.in);

        //IMPRIMIMOS MENSAJE
        System.out.println("INGRESA TU EDAD");
        var edad  = consola.nextLine(); // LEEMOS EL VALOR DE LA EDAD

        System.out.println("Edad =" + edad); // IMPRIMIMOS LA EDAD
        // LEER UN DOUBLE:
        System.out.println("INGRESA TU ESTATURA"); // MANDAMOS EL SIGUIENTE MENSAJE
        var estatura = consola.nextLine();
        System.out.println("Estatura ="+ estatura);
    }
}
