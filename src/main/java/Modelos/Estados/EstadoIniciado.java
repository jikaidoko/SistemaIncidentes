package Modelos.Estados;
import Modelos.*;

public class EstadoIniciado extends Estado{

    EstadoIniciado (Incidente incidente){
        super(incidente);
    }
    @Override
    public Estado enviar() {
        tecnico.asignarTecnico (new Tecnico());
        public Estado setEstado (Incidente incidente) {
            final EstadoEnProceso estadoEnProceso = new EstadoEnProceso(Incidente incidente);
            return estadoEnProceso;
        }
    }



}
