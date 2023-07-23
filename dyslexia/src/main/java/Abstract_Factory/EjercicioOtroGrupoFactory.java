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
// Fábrica concreta para crear ejercicios interactivos y recursos adicionales para otro grupo de edad
public class EjercicioOtroGrupoFactory implements EjercicioFactory{
  @Override
    public EjercicioInteractivo crearEjercicioInteractivo() {
        return new EjercicioOtroGrupo();
    }

    @Override
    public RecursoAdicional crearRecursoAdicional() {
        return new RecursoActividadesImprimibles();
    }
}
