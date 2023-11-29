package Services;

import DAO.ClienteDAO;
import Modelos.Cliente;

import java.util.List;

public class ClienteService {

    private ClienteDAO dao = new ClienteDAO();

    public void create(Cliente entity){
        dao.create(entity);
    }

    public Cliente findOne(int id) {
        return dao.findOne(id);
    }

    public List<Cliente> findAll() {
        return dao.findAll();
    }
}
