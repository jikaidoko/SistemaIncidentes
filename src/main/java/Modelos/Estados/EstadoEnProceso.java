package Modelos.Estados;
import Modelos.*;

public class EstadoEnProceso extends Estado{
    Incidente incidente;
    public void asignarTiempoExtra (){
    }

    public void enviar() {
        public Estado setEstado (Incidente incidente) {
            final EstadoResuelto estadoResuelto = new EstadoResuelto (Incidente incidente);
            return estadoResuelto;
        }
    }
}
