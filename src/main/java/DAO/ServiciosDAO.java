package DAO;

import Modelos.Servicio;

public class ServiciosDAO extends AbstractJpaDAO<Servicio> {
    public ServiciosDAO(){
        setClazz(Servicio.class);
    }
}
