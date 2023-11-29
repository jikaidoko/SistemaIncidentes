package Services;

import DAO.TecnicoDAO;
import Modelos.Tecnico;

import java.util.List;

public class TecnicoService {

    private TecnicoDAO dao = new TecnicoDAO();

    public void create(Tecnico entity){
        dao.create(entity);
    }

    public Tecnico findOne(int id) {
        return dao.findOne(id);
    }

    public List<Tecnico> findAll() {
        return dao.findAll();
    }
}
