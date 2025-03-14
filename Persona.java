/*TEMA: CLASES Y OBJETOS
 * NOMBRE: MARIA DEL CARMEN LIMA GARCIA
 * CAPACITADOR: VICTOR SAUCEDO CASTILLO
 *
* DEFINICIÓN:Una clase se compone de atributos y métodos.
*Los atributos son las características de nuestros métodos.
*Los métodos son las acciones que pueden realizar nuestros objetos,
*En si estas acciones son funciones, pero cuando se asocian con una clase se les llama métodos.
 */

 class Persona {
  //AGREGAMOS 2 ATRIBUTOS

  String nombre;
  String apellido;

  //AGREGAMOS EL SIGUIENTE MÉTODO LLAMADO PERSONA:
  //ESTE MÉTODO SE ENCARGA DE MANDAR UNICAMENTE IMPRIMIR,
  //LA INFORMACIÓN DE LOS ATRIBUTOS DE NOMBRE,APELLIDO
  void MostrarPersona (){
   //MANDAMOS A IMPRIMIR LA INFORMACIÓN DE NOMBRE Y APELLIDO
   System.out.println("Nombre:" + nombre);
   System.out.println("Apellido:" + apellido);

  }
}
