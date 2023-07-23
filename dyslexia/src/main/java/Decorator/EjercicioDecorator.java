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
// Clase abstracta del decorador
public abstract class EjercicioDecorator implements EjercicioInteractivo {
  protected EjercicioInteractivo ejercicioInteractivo;

    public EjercicioDecorator(EjercicioInteractivo ejercicioInteractivo) {
        this.ejercicioInteractivo = ejercicioInteractivo;
    }

    @Override
    public void realizarEjercicio() {
        ejercicioInteractivo.realizarEjercicio();
    }
}
