package DAO;

import Modelos.Incidente;

public class IncidenteDAO extends AbstractJpaDAO<Incidente>{
    public IncidenteDAO(){
        setClazz(Incidente.class);
    }
}
