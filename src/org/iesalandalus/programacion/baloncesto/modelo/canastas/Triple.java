package org.iesalandalus.programacion.baloncesto.modelo.canastas;

import org.iesalandalus.programacion.baloncesto.modelo.Equipo;

public class Triple extends Canasta{

    public Triple(Equipo equipo){
        super(equipo);
    }

    @Override
    public int getPuntos() {
        return 3;
    }
}
