package DAO;

import Modelos.Cliente;

public class ClienteDAO extends AbstractJpaDAO<Cliente>{
    public ClienteDAO(){
        setClazz(Cliente.class);
    }
}
