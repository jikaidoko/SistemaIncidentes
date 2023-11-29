package Services;

import DAO.ServiciosDAO;
import Modelos.Servicios;

import java.util.List;

public class ServiciosService {
    private ServiciosDAO dao = new ServiciosDAO();

    public void create(Servicios entity){
        dao.create(entity);
    }

    public Servicios findOne(int id) {
        return dao.findOne(id);
    }

    public List<Servicios> findAll() {
        return dao.findAll();
    }
}
