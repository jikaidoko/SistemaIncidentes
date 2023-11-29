package Services;

import DAO.EspecialidadDAO;
import Modelos.Especialidad;

import java.util.List;

public class EspecialidadService {

    private EspecialidadDAO dao = new EspecialidadDAO();

    public void create(Especialidad entity){
        dao.create(entity);
    }

    public Especialidad findOne(int id) {
        return dao.findOne(id);
    }

    public List<Especialidad> findAll() {
        return dao.findAll();
    }
}
