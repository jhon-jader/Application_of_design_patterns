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
// Decorador concreto para agregar música de fondo a los ejercicios
public class EjercicioConMusicaFondo extends EjercicioDecorator {

  public EjercicioConMusicaFondo(EjercicioInteractivo ejercicioInteractivo) {
    super(ejercicioInteractivo);
  }

  @Override
  public void realizarEjercicio() {
    super.realizarEjercicio();
    agregarMusicaFondo();
  }

  private void agregarMusicaFondo() {
    //agregar logica para seleccionar la cancion que sonara en el fondo 
  }
}
