/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract_Factory;

/**
 *
 * @author Jhon Jader Rojas Rangel
 */
// Clase concreta de EjercicioInteractivo para niños con dislexia
public class EjercicioDislexia implements EjercicioInteractivo{
      @Override
    public void realizarEjercicio() {
      System.out.println("Realizando ejercicio interactivo para niños con dislexia.");
        // Lógica para realizar el ejercicio interactivo para niños con dislexia
    }
}
