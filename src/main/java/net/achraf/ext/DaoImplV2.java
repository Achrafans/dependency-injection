package net.achraf.ext;

import net.achraf.dao.IDao;

public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version capteurs");
        double t =12;
        return t;
    }
}
