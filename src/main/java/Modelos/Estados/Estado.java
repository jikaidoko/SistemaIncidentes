package Modelos.Estados;
import Modelos.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Estado {
    Incidente incidente;

    public Estado (Incidente incidente){
        this.incidente=incidente;
    }
    public Estado(){
    }
public abstract Estado enviar();
}
