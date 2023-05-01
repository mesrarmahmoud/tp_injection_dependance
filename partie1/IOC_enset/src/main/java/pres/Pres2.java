package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(new File("config.txt"));
        //Dao
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.getConstructor().newInstance();//sous castingue

        //Metier
        String MetierClassName = scanner.nextLine();
        Class cMetier = Class.forName(MetierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor().newInstance();

        //injection des dependances
        Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
        setDao.invoke(metier,dao);//injection des depenances

        System.out.println("result "+ metier.calcul());
    }
}
