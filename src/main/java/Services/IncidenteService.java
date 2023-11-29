package Services;

import DAO.IncidenteDAO;
import Modelos.Incidente;

import java.util.List;

public class IncidenteService {

    private IncidenteDAO dao = new IncidenteDAO();

    public void create(Incidente entity){
        dao.create(entity);
    }

    public Incidente findOne(int id) {
        return dao.findOne(id);
    }

    public List<Incidente> findAll() {
        return dao.findAll();
    }
}
