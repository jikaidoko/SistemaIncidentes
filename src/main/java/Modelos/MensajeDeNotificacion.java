package Modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.Date;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name="Mensaje_de_Notificacion")
@Getter @Setter @NoArgsConstructor
public class MensajeDeNotificacion {
    @Id
    @Column(name="id_Notificacion")
    @GeneratedValue(strategy=SEQUENCE, generator="ID_SEQ")
    private int idNotificacion;

    @Column(name="fecha_de_creacion")
    private Date fechaDeCreacion;

    @Column(name="titulo")
    private String titulo;

    @Column(name="texto")
    private String texto;

    @ManyToOne
    @JoinColumn(name="incidente_id", referencedColumnName="id_incidente")
    Incidente incidente;
    public boolean enviado (){
        return true;
    }
public void mensajeDeNotificacion (){
}

}
