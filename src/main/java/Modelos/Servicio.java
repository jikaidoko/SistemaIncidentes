package Modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name="Servicio")
@Getter @Setter @NoArgsConstructor
public class Servicio implements Serializable {

    @Id
    @Column(name="id_servicio")
    @GeneratedValue(strategy=SEQUENCE, generator="ID_SEQ")
    private int idServicio;

    @Column(name="nombre_servicio")
    private String nombreServicio;

    @Column(name="descripcion")
    private String descripcion;

    @OneToMany (mappedBy = "cliente")
    List<ProvisionDeServicio> servicioContratado;

    @ManyToMany
    @JoinTable(name = "Tipo_problema_x_servicios",
            joinColumns = @JoinColumn(name = "servicios_id"),
            inverseJoinColumns = @JoinColumn(name = "tipo_problema_id"))
    private List<TipoDeProblema> tipoDeProblemas;

    public boolean servicioContratado(Cliente cliente){
        return true;
    }
}
