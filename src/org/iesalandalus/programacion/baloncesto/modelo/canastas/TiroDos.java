package org.iesalandalus.programacion.baloncesto.modelo.canastas;

import org.iesalandalus.programacion.baloncesto.modelo.Equipo;

public class TiroDos extends Canasta {

    public TiroDos(Equipo equipo){
        super(equipo);

    }

    @Override
    public int getPuntos() {
        return 2;
    }
}
