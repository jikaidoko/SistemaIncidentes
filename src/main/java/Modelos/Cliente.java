package Modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name="Cliente")
@Getter @Setter @NoArgsConstructor
public class Cliente implements Serializable {
    @Id
    @Column(name="id_cliente")
    @GeneratedValue(strategy=SEQUENCE, generator="ID_SEQ")
    private int idCliente;

    @Column(name="cuit", unique=true)
    private String cuit;

    @Column(name="razonSocial")
    private String razonSocial;

    @OneToMany (mappedBy = "cliente")
    List <ProvisionDeServicio> servicioContratado;

    @OneToMany (mappedBy = "cliente")
    List <Incidente> incidentes;

    public boolean recibeServicioTecnico() {
          return true;
        }
    }






