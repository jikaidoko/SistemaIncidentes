package Modelos;
import Modelos.Estados.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;
@Getter @Setter
public class Incidente {
private String id;
private Cliente cliente;
private List <Problema> problemaReportado;
private List<Tecnico> tecnicos;
private Time tiempoMaximoResolucion;
private Timestamp fechaInicio;
private Estado estado;

    public void cambiarEstado (Estado estado) {
        this.estado = estado;
    }
    public Estado setState() {
        final EstadoIniciado estadoIniciado = new EstadoIniciado(Incidente incidente);
        return estadoIniciado;
    }
}
