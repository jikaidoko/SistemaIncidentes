package Modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name="especialidad")
@Getter @Setter @NoArgsConstructor
public class Especialidad implements Serializable {
    @Id
    @Column(name="id_especialidad")
    @GeneratedValue(strategy=SEQUENCE, generator="ID_SEQ")
    private int idEspecialidad;

    @Column(name="nombre_especialidad")
    private String nombreEspecialidad;

    @ManyToMany
    @JoinTable(name = "problema_especialidad",
            joinColumns = @JoinColumn(name = "id_especialidad"),
            inverseJoinColumns = @JoinColumn(name = "id_problema"))
    private List<Problema> problemas;
}
