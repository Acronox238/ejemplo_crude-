/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.prueba;

import uni.sistemas.beans.Jugador;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author user
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciar objeto de la coleccion Map
        Map<String, Jugador> jugadores = new HashMap<>();
        // agregar elemento en la coleccion map
        jugadores.put("Stegen", new Jugador(1, "Stegen", "Portero"));
        jugadores.put("Rakitic", new Jugador(4, "Rakitic", "Centro Campista"));
        jugadores.put("Pique", new Jugador(3, "Pique", "Central"));
        jugadores.put("Sergio", new Jugador(22, "Sergio Roberto", "Lateral Izquierdo"));
        jugadores.put("Mascherano", new Jugador(14, "Mascherano", "Central"));
        jugadores.put("Rafhina", new Jugador(8, "Rafhina ", "Medio Campista"));
        jugadores.put("Busquets", new Jugador(6, "Busquets", "Medio Centro"));
        jugadores.put("Neymar", new Jugador(11, "Neymar", "Interior Izquierdo"));
        jugadores.put("Suarez", new Jugador(9, "Suarez", "Delatero"));
        jugadores.put("Iniesta", new Jugador(6, "Iniesta", "Interior Derecho"));
        jugadores.put("Messi", new Jugador(10, "Leo messi", "Delantero"));
         //listar los elementodel map      
         
        for (Entry<String, Jugador> jugador : jugadores.entrySet()) {
            String clave = jugador.getKey();
            Jugador valor = jugador.getValue();
            System.out.println(clave + " ---->  " + valor.toString());
        }
        //estadistica
        System.out.println("Total de Jugadores :" + jugadores.size());
        System.out.println("no hay Jugadores :" + jugadores.isEmpty());
        System.out.println("datos del Jugador :" + jugadores.get("Messi"));
        System.out.println("Existe el Jugador :" + jugadores.containsKey("Messi"));
        System.out.println("Lista de Jugadores :" + jugadores.values());
        // adicionar nuevo elemento
        Jugador bartra = new Jugador(22, "Bartra", "Central");
        jugadores.put("Bartra", bartra);

        System.out.println("Esta el jugador : " + jugadores.containsValue(bartra));

        for (Entry<String, Jugador> jugador : jugadores.entrySet()) {
            String clave = jugador.getKey();
            Jugador valor = jugador.getValue();
            System.out.println(clave + "  ->  " + valor.toString());
        }

    }

}
