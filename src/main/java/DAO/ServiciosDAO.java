package DAO;

import Modelos.Servicios;

public class ServiciosDAO extends AbstractJpaDAO<Servicios> {
    public ServiciosDAO(){
        setClazz(Servicios.class);
    }
}
