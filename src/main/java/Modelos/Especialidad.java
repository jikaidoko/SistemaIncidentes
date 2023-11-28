package Modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name="Especialidad")
@Getter @Setter @NoArgsConstructor
public class Especialidad {
    @Id
    @Column(name="idEspecialidad")
    @GeneratedValue(strategy=SEQUENCE, generator="ID_SEQ")
    private int idEspecialidad;

    @Column(name="nombreEspecialidad")
    private String nombreEspecialidad;

    @ManyToMany
    @JoinTable(name = "problema_especialidad",
            joinColumns = @JoinColumn(name = "idEspecialidad"),
            inverseJoinColumns = @JoinColumn(name = "idProblema"))
    private List<Problema> problemas;
}
