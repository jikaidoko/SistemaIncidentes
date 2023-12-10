package Modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name="Tecnico")
@Getter @Setter @NoArgsConstructor
public class Tecnico implements Serializable {
    @Id
    @Column(name="id_tecnico")
    @GeneratedValue(strategy=SEQUENCE, generator="ID_SEQ")
    private int idTec;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @Column(name="fecha_de_nacimiento")
    private Date fechaDeNacimiento;

    @Column(name="telefono")
    private String telefono;

    @Column(name="e_mail")
    private String email;

    @ManyToMany (mappedBy = "tecnicos")
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
