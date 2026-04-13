package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       /*  EspacioCultural jb = new JardinBotanico();
        jb.mostrarHorario();
        System.out.println(jb.obtenerRequisitoEntrada());
        jb.realizarActividadPrincipal();

        EspacioCultural pq = new ParqueExplora();
        pq.mostrarHorario();
        System.out.println(pq.obtenerRequisitoEntrada());
        pq.realizarActividadPrincipal(); */

        ArrayList<EspacioCultural> lista = new ArrayList<>();
        lista.add(new JardinBotanico());
        lista.add(new ParqueExplora());
        lista.add(new MuseoDeAntioquia());

        for (EspacioCultural obj: lista) {
            System.out.println("Lugar: " + obj.getNombre());
            obj.mostrarHorario();
            System.out.println(obj.obtenerRequisitoEntrada());
            obj.realizarActividadPrincipal();
            System.out.println("----------------------");

            
        }
    }
}