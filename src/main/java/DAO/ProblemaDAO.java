package DAO;

import Modelos.Problema;

public class ProblemaDAO extends AbstractJpaDAO<Problema>{
    public ProblemaDAO(){
        setClazz(Problema.class);
    }
}
