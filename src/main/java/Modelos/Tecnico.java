package Modelos;

import java.io.Serializable;
import java.util.List;

public class Tecnico implements Serializable {
    private String idTec;
    private String nombre;
    private List <Especialidad> especialidades;
    public boolean tecnicoIdoneo(){
        return true;
    }

    public void asignarTecnico(Tecnico tecnico) {

    }
}
