/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chain_of_Responsibility;

/**
 *
 * @author Jhon Jader Rojas Rangel
 */
// Interfaz que representa un manejador para procesar solicitudes
public interface EjercicioHandler {

  void manejarEjercicio(Ejercicio ejercicio);

  public void setSiguienteHandler(EjercicioHandler otroGrupoHandler);
}
