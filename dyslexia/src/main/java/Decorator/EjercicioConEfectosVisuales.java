/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import Abstract_Factory.EjercicioInteractivo;

/**
 *
 * @author Jhon Jader Rojas Rangel
 */
// Decorador concreto para agregar efectos visuales a los ejercicios
public class EjercicioConEfectosVisuales extends EjercicioDecorator {
  public EjercicioConEfectosVisuales(EjercicioInteractivo ejercicioInteractivo) {
        super(ejercicioInteractivo);
    }

    @Override
    public void realizarEjercicio() {
        super.realizarEjercicio();
        agregarEfectosVisuales();
    }

    private void agregarEfectosVisuales() {
        System.out.println("Agregando efectos visuales al ejercicio.");
        // Lógica para agregar efectos visuales al ejercicio
    }
}
