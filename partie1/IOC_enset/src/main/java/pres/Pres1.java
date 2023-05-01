package pres;

import dao.DaoImpl2;
import metier.IMetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        IMetierImpl metier = new IMetierImpl();
        DaoImpl2 dao= new DaoImpl2();
        metier.setDao(dao);// injection des dépendances;
        System.out.println("resultat : "+metier.calcul());
    }
}
