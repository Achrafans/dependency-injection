package net.achraf.pres;

import net.achraf.dao.DaoImpl;
import net.achraf.ext.DaoImplV2;
import net.achraf.metier.MetierImpl;

public class Main {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();  // Instanciation directe
        MetierImpl metier = new MetierImpl(dao); //injection avec constructeur
        System.out.println("Résultat : " + metier.calcul());
    }
}
