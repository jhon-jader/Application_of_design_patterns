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
public class Cliente {

  private EjercicioHandler primerHandler;

  public Cliente() {
    // Configurar la cadena de responsabilidad con los manejadores concretos
    primerHandler = new EjercicioDislexiaHandler();
    EjercicioHandler otroGrupoHandler = new EjercicioOtroGrupoHandler();

    primerHandler.setSiguienteHandler(otroGrupoHandler);
  }

  public void procesarEjercicio(Ejercicio ejercicio) {
    primerHandler.manejarEjercicio(ejercicio);
  }
}
