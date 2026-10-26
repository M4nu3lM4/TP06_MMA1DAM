package org.iesalandalus.programacion.baloncesto;

import org.iesalandalus.programacion.baloncesto.modelo.Equipo;
import org.iesalandalus.programacion.baloncesto.modelo.Partido;
import org.iesalandalus.programacion.baloncesto.modelo.canastas.Canasta;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.iesalandalus.programacion.baloncesto.modelo.Equipo.LOCAL;
import static org.iesalandalus.programacion.baloncesto.modelo.Equipo.VISITANTE;

public class Main {
    public static void main(String[] args){

        //Crear un partido
        Partido partido = new Partido();
        partido.jugar();
        List<Canasta> resultado = partido.getCanastas();
        System.out.println("Canastas anotadas");
        System.out.println("-----------------");
        System.out.print("[");
        for(int i=0; i<resultado.size()-1;i++){
            System.out.print(resultado.get(i).getEquipo() + " -> " +resultado.get(i).getPuntos()+",");
        }
        System.out.println(resultado.get(resultado.size()-1).getEquipo() + " -> " +resultado.get(resultado.size()-1).getPuntos()+"]");


        System.out.println("Resultado final");
        System.out.println("---------------");
        int puntosLocal = 0;
        int puntosVisitante = 0;


        for (int i = 0; i < resultado.size(); i++) {
            if (resultado.get(i).getEquipo() == Equipo.LOCAL){
                puntosLocal += resultado.get(i).getPuntos();
            }else {
                puntosVisitante += resultado.get(i).getPuntos();
            }
        }
        System.out.println("{L="+puntosLocal+ ", V="+puntosVisitante+"}");


        System.out.println("Resultado final");
        System.out.println("---------------");
        Map<Equipo,Integer> resultados = partido.getResultado();
        int puntosLocal2 =resultados.get(LOCAL);
        int puntosVisitante2 = resultados.get(VISITANTE);





    }
}
