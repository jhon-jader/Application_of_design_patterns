/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Abstract_Factory;

/**
 *
 * @author JHON JADER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Creamos la fábrica concreta para niños con dislexia
        EjercicioFactory dislexiaFactory = new EjercicioDislexiaFactory();

        // Utilizamos la fábrica para crear los ejercicios interactivos y recursos adicionales
        Cliente aplicacionDislexia = new Cliente(dislexiaFactory);
        aplicacionDislexia.crearEjercicioYRecurso();
    }
    
}
