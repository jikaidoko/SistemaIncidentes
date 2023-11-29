package Modelos.Estados;
import Modelos.*;

public class EstadoEnProceso extends Estado{
    Incidente incidente;

    public EstadoEnProceso() {
        super();
    }

    public void asignarTiempoExtra (){
    }

    public Estado enviar() {
        //public Estado setEstado (Incidente incidente) {
        //    final EstadoResuelto estadoResuelto = new EstadoResuelto (Incidente incidente);
        //    return estadoResuelto;
        //}
        final EstadoResuelto estadoResuelto = new EstadoResuelto (this.getIncidente());
        return estadoResuelto;
    }
}
