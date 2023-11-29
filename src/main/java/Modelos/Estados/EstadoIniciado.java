package Modelos.Estados;
import Modelos.*;

public class EstadoIniciado extends Estado{

    public EstadoIniciado(Incidente incidente){
        super(incidente);
    }
    @Override
    public Estado enviar() {
        //tecnico.asignarTecnico (new Tecnico());
        return(setEstado(super.getIncidente()));
    }

    public Estado setEstado (Incidente incidente) {
        final EstadoEnProceso estadoEnProceso = new EstadoEnProceso();
        return estadoEnProceso;
    }


}
