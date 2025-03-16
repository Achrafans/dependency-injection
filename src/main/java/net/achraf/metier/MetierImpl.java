package net.achraf.metier;

import net.achraf.dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao; // couplage faible

    public MetierImpl(IDao dao) { // Injection par constructeur
        this.dao = dao;
    }
    public MetierImpl(){

    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 12 * Math.PI / 2 /Math.cos(t);
        return res;
    }

    /**
     * Pour injecter par setter
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
