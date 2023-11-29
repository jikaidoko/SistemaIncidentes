package DAO;

import Modelos.Tecnico;

public class TecnicoDAO extends AbstractJpaDAO<Tecnico>{
    public TecnicoDAO(){
        setClazz(Tecnico.class);
    }
}
