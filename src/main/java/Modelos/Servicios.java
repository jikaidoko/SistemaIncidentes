package Modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name="servicio")
@Getter @Setter @NoArgsConstructor
public class Servicios implements Serializable {

    @Id
    @Column(name="id_servicio")
    @GeneratedValue(strategy=SEQUENCE, generator="ID_SEQ")
    private int idServicio;

    @Column(name="nombre_servicio")
    private String nombreServicio;

    @ManyToOne
    @JoinColumn(name="cliente_id", referencedColumnName="id_cliente")
    private Cliente cliente;
    public boolean servicioContratado(Cliente cliente){
        return true;
    }
}
