package Modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name="Servicio")
@Getter @Setter @NoArgsConstructor
public class Servicios implements Serializable {

    @Id
    @Column(name="idServicio")
    @GeneratedValue(strategy=SEQUENCE, generator="ID_SEQ")
    private int idServicio;

    @Column(name="nombreServicio")
    private String nombreServicio;

    @ManyToOne
    @JoinColumn(name="idCliente", referencedColumnName="idServicio")
    private Cliente cliente;
    public boolean servicioContratado(Cliente cliente){
        return true;
    }
}
