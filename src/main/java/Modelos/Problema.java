package Modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.io.Serializable;
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

   @Column(name = "descripcion")
   private String descripcion;

   @ManyToMany(mappedBy = "problemas")
   private List<Especialidad> especialidades;


   SistemaOperativo os;

public boolean esComplejo(){
   return false;
}
}
