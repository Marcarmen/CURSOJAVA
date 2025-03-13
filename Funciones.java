/*TEMA: ARREGLOS
 * NOMBRE: MARIA DEL CARMEN LIMA GARCIA
 * CAPACITADOR: VICTOR SAUCEDO CASTILLO
 *
 * DEFINICIÓN:Una función es un bloque de código reutilizable,
 * Que realiza una operación en particular.
 *Puede tener parámetros de entrada y también puede devolver un valor de salida.
 */
// NOTA: DE MANERA TECNICA CUANDO MANDAMOS A LLAMAR UNA FUNCIÓN, LA INFORMACIÓN
//QUE VAMOS A PASAR SE CONOCE COMO ELEMENTO.

// Y CUANDO ESTAMOS DEFINIENDO NUESTRA FUNCIÓN LA VARIABLE QUE SE DEFINE
// SE CONOCE COMO PARAMETRO.
public class Funciones {
//DEFINIMOS NUESTRA FUNCIÓN
    static void  saludar(String mensaje){
        System.out.println("Mensaje:"+ mensaje);
    }
// PRINCIPALMENTE MANDAMOS A LLAMAR, DESDE LA FUNCIÓN PRINCIPAL MAIN
// LA FUNCIÓN QUE SE DEFINIO ANTERIORMENTE
    public static void main(String[] args) {
saludar("Hola Maria desde Java");
saludar("Hasta pronto Maria");
    }
}
