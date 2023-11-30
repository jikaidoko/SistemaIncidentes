package Modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name="tecnico")
@Getter @Setter @NoArgsConstructor
public class Tecnico implements Serializable {
    @Id
    @Column(name="id_tecnico")
    @GeneratedValue(strategy=SEQUENCE, generator="ID_SEQ")
    private int idTec;

    @Column(name="nombre")
    private String nombre;

    @OneToMany
    @JoinColumn(name="id_especialidad", referencedColumnName="id_tecnico")
    private List <Especialidad> especialidades;

    @ManyToMany
    @JoinTable(name ="tecnico_incidente",
            joinColumns = @JoinColumn(name = "tecnico_id"),
            inverseJoinColumns = @JoinColumn(name = "incidente_id"))
    private List <Incidente> incidentes;
    public boolean tecnicoIdoneo(){
        return true;
    }

    public void asignarTecnico(Tecnico tecnico) {

    }
}
