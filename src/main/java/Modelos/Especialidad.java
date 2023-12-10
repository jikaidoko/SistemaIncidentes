package Modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name="Especialidad")
@Getter @Setter @NoArgsConstructor
public class Especialidad implements Serializable {
    @Id
    @Column(name="id_especialidad")
    @GeneratedValue(strategy=SEQUENCE, generator="ID_SEQ")
    private int idEspecialidad;

    @Column(name="nombre_especialidad")
    private String nombreEspecialidad;

    @ManyToMany
    @JoinTable(name = "tipo_problema_especialidad",
            joinColumns = @JoinColumn(name = "especialidad_id"),
            inverseJoinColumns = @JoinColumn(name = "tipo_problema_id"))
    private List<TipoDeProblema> tipoDeProblemas;

    @ManyToMany
    @JoinTable(name = "tecnico_especialidad",
            joinColumns = @JoinColumn(name = "especialidad_id"),
            inverseJoinColumns = @JoinColumn(name = "tecnico_id"))
    private List<Tecnico> tecnicos;
}
