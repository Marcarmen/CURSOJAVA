/*TEMA: CLASES Y OBJETOS
 * NOMBRE: MARIA DEL CARMEN LIMA GARCIA
 * CAPACITADOR: VICTOR SAUCEDO CASTILLO
 *
 * DEFINICIÓN:Una clase se compone de atributos y métodos.
 *Los atributos son las características de nuestros métodos.
 *Los métodos son las acciones que pueden realizar nuestros objetos,
 *En si estas acciones son funciones, pero cuando se asocian con una clase se les llama métodos.
 */

 class ClaseyObjetosPersona {
     public static void main(String[] args) {
         //IMPRIMIMOS EL SIGUIENTE MENSAJE
         System.out.println("Creación de Clase y Objetos Persona");
         //DEFINIMOS LA VARIABLE DE TIPO VAR, INDICA QUE SON VARIABLES DE TIPO OBJETO
         var objeto1 = new Persona();
         objeto1.nombre =  "Maria";
         objeto1.apellido= "Lima Garcia";
         objeto1.MostrarPersona();


     }
}
