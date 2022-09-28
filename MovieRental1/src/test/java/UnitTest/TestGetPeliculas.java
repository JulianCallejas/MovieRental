/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UnitTest;

import controller.PeliculaController;
import java.io.PrintWriter;

public class TestGetPeliculas {

    public static void main(String[] args) {

        PeliculaController pelicula = new PeliculaController();

        boolean ordenar = true;
        String orden = "ASC";

        String peliculaStr = pelicula.listar(ordenar, orden);
        
        System.out.println(peliculaStr);

    }

}
