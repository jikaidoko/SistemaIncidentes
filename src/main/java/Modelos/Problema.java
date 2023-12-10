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
@Table(name="problema")
@Getter @Setter @NoArgsConstructor
public class Problema implements Serializable {
   @Id
   @Column(name="id_problema")
   @GeneratedValue(strategy=SEQUENCE, generator="ID_SEQ")
   private String idProblema;

   @ManyToOne
   @JoinColumn(name="tipo_problema_id", referencedColumnName = "id_tipo_problema")
   private TipoDeProblema tipoDeProblema;

   @Column(name = "descripcion")
   private String descripcion;

   @Column(name="fecha_est_resolucion")
   private Date fechaEstimadaDeResolucion;




public boolean esComplejo(){
   return false;
}

   public void asignarTecnico() {
   }
}

