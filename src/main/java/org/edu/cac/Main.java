package org.edu.cac;

import org.edu.cac.enums.Club;
import org.edu.cac.enums.Posicion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> posiciones = new HashMap<>();
        posiciones.put("LFP", 2);
        posiciones.put("Copa Sudamericana", 1);
        posiciones.put("Copa Libertadores", 3);
        Equipo equipo1 = new Equipo(Club.BOCA, posiciones);

        Jugador jugador1 = new Jugador("Federico", 1, equipo1, Posicion.ARQUERO);
        Jugador jugador2 = new Jugador("Juan", 2, equipo1, Posicion.DEFENSOR);
        Jugador jugador3 = new Jugador("Carlos", 7, equipo1, Posicion.MEDIOCAMPISTA);
        Jugador jugador4 = new Jugador("Roberto", 11, equipo1, Posicion.DELANTERO);

        equipo1.agregarJugador(jugador1);
        equipo1.agregarJugador(jugador2);
        equipo1.agregarJugador(jugador3);
        equipo1.agregarJugador(jugador4);

        System.out.println("Los jugadores del equipo " + equipo1.getNombre() + ", fueron: ");

        Iterator it = equipo1.getJugadores().keySet().iterator();

        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " ->Valor: " + equipo1.getJugadores().get(key));
        }

        // INTERFACES Y CLASES ABSTRACTAS

        // INTERFAZ: Contrato en donde se especifican
        // los comportamientos que deben de tener las clases que las implementen

        // Para definir una interfaz debemos comprender cuál o cuáles comportamientos serán compartidos
        // objetos de distinto tipo (distintas clases).

        // Definimos una interfaz "Comunicable"


        // CLASE ABSTRACTA (Herencia)

        // Es una clase que no puede ser instanciada
        // Para poder ser una clase abstracta, al menos uno de sus métodos tienes que ser abstracto
        // es decir, que no tenga cuerpo (solo la firma)
        // Puede tener métodos no abstractos (comunes)
    }
}