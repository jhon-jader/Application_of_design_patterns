/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract_Factory;

/**
 *
 * @author JHON JADER
 */
public class Cliente {

  private EjercicioFactory factory;

  public Cliente(EjercicioFactory factory) {
    this.factory = factory;
  }

  public void crearEjercicioYRecurso() {
    EjercicioInteractivo ejercicio = factory.crearEjercicioInteractivo();
    RecursoAdicional recurso = factory.crearRecursoAdicional();

    ejercicio.realizarEjercicio();
    recurso.mostrarRecurso();
  }
}
