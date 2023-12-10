package Services;

import DAO.ServiciosDAO;
import Modelos.Servicio;

import java.util.List;

public class ServiciosService {
    private ServiciosDAO dao = new ServiciosDAO();

    public void create(Servicio entity){
        dao.create(entity);
    }

    public Servicio findOne(int id) {
        return dao.findOne(id);
    }

    public List<Servicio> findAll() {
        return dao.findAll();
    }
}
