package Services;


import DAO.ProblemaDAO;
import Modelos.Problema;

import java.util.List;

public class ProblemaService {

    private ProblemaDAO dao = new ProblemaDAO();

    public void create(Problema entity){
        dao.create(entity);
    }

    public Problema findOne(int id) {
        return dao.findOne(id);
    }

    public List<Problema> findAll() {
        return dao.findAll();
    }
}
