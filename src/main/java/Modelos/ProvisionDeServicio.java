package Modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

import static javax.persistence.GenerationType.SEQUENCE;
@Entity
@Table(name="Provision_de_Servicio")
@Getter @Setter @NoArgsConstructor
public class ProvisionDeServicio {
    @Id
    @Column(name="id_prov_servicio")
    @GeneratedValue(strategy=SEQUENCE, generator="ID_SEQ")
    private int idProvServicio;
    @ManyToOne
    @JoinColumn(name="servicio_id", referencedColumnName="id_servicio")
    private Servicio servicio;
    @ManyToOne
    @JoinColumn(name="cliente_id", referencedColumnName="id_cliente")
    private Cliente cliente;
    private Timestamp fechaDeAlta;
    private double pagoMensual;
}
