package Modelos.Estados;
import Modelos.*;

public class EstadoIniciado extends Estado{

    public EstadoIniciado(Incidente incidente){
        super(incidente);
    }
    @Override
    public Estado enviar() {
        return(setEstado(super.getIncidente()));
    }

    public Estado setEstado (Incidente incidente) {
        final EstadoEnProceso estadoEnProceso = new EstadoEnProceso();
        return estadoEnProceso;
    }


}
