package Modelos.Estados;

import Modelos.Incidente;

public class EstadoResuelto extends Estado{


    public EstadoResuelto(Incidente incidente) {
        super(incidente);
    }

    @Override
    public Estado enviar() {
        this.notificarAlCliente();
        return null;
    }

    public void notificarAlCliente (){
    }
}
