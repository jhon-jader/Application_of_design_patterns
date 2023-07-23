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
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creamos la aplicación web
        Cliente aplicacion = new Cliente();

        // Creamos un ejercicio interactivo para niños con dislexia
        Ejercicio ejercicioDislexia = new Ejercicio("Dislexia");
        aplicacion.procesarEjercicio(ejercicioDislexia);

        // Creamos un ejercicio interactivo para otro grupo de edad
        Ejercicio ejercicioOtroGrupo = new Ejercicio("OtroGrupo");
        aplicacion.procesarEjercicio(ejercicioOtroGrupo);

        // Creamos un ejercicio interactivo con tipo no compatible
        Ejercicio ejercicioNoCompatible = new Ejercicio("AlgoNoCompatible");
        aplicacion.procesarEjercicio(ejercicioNoCompatible);
  }
  
}
