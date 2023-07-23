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
// Manejador concreto para ejercicios de otro grupo de edad
public class EjercicioOtroGrupoHandler implements EjercicioHandler {

  private EjercicioHandler siguienteHandler;

  @Override
  public void manejarEjercicio(Ejercicio ejercicio) {
    if (ejercicio.getTipo().equals("OtroGrupo")) {
      System.out.println("Procesando ejercicio para otro grupo de edad.");
      // Lógica para procesar el ejercicio para otro grupo de edad
    } else {
      pasarAlSiguienteHandler(ejercicio);
    }
  }

  @Override
  public void setSiguienteHandler(EjercicioHandler siguienteHandler) {
    this.siguienteHandler = siguienteHandler;
  }

  private void pasarAlSiguienteHandler(Ejercicio ejercicio) {
    if (siguienteHandler != null) {
      siguienteHandler.manejarEjercicio(ejercicio);
    } else {
      System.out.println("No se puede procesar el ejercicio. Tipo no compatible.");
    }
  }
}
