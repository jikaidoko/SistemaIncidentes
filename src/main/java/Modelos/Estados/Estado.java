package Modelos.Estados;
import Modelos.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Estado {
    Incidente incidente;

    Estado (Incidente incidente){
        this.incidente=incidente;
}
public abstract void enviar();
}
