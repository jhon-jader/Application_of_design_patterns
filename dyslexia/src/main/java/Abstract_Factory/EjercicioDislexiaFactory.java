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
// Fábrica concreta para crear ejercicios interactivos para niños con dislexia
public class EjercicioDislexiaFactory implements EjercicioFactory{
      @Override
    public EjercicioInteractivo crearEjercicioInteractivo() {
        return new EjercicioDislexia();
    }

    @Override
    public RecursoAdicional crearRecursoAdicional() {
        return new RecursoAudiolibro();
    }
}
