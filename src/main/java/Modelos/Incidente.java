package Modelos;
import Modelos.Estados.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name="incidente")
@Getter @Setter @NoArgsConstructor
public class Incidente implements Serializable {
    @Id
    @Column(name="id_incidente")
    @GeneratedValue(strategy=SEQUENCE, generator="ID_SEQ")
    private int id;

    @ManyToOne
    @JoinColumn(name="cliente_id", referencedColumnName="id_cliente")
    private Cliente cliente;

    @OneToMany
    @JoinColumn(name="problema_id", referencedColumnName="id_incidente")
    private List <Problema> problemas;

    @ManyToMany
    private List<Tecnico> tecnicos;

    @Column(name="max_tiempo")
    private Time tiempoMaximoResolucion;

    @Column(name="fecha_inicio")
    private Timestamp fechaInicio;

    @Transient
    private Estado estado;

    public void cambiarEstado (Estado estado) {
        this.estado = estado;
    }
    public Estado setState() {
        final EstadoIniciado estadoIniciado = new EstadoIniciado(this);
        return estadoIniciado;
    }
}
