package DAO;

import Modelos.Especialidad;

public class EspecialidadDAO extends AbstractJpaDAO<Especialidad>{
    public EspecialidadDAO(){
        setClazz(Especialidad.class);
    }
}
