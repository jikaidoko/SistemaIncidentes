package Modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name="Tipo_de_problema")
@Getter @Setter @NoArgsConstructor
public class TipoDeProblema {
    @Id
    @Column(name="id_tipo_problema")
    @GeneratedValue(strategy=SEQUENCE, generator="ID_SEQ")
    private int idTipoDeProblema;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "tiempo_max_resolucion")
    private LocalDateTime tiempoMaxResolucion;

    @ManyToMany(mappedBy = "tipoDeProblemas")
    private List<Especialidad> especialidades;

    @ManyToMany(mappedBy = "tipoDeProblemas")
    private List<Servicio> servicios;

    @OneToMany(mappedBy = "tipoDeProblema")
    private List<Problema> problemas;

}
