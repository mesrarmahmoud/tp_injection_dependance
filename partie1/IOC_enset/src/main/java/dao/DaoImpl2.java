package dao;

import dao.IDao;
import org.springframework.stereotype.Component;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version web service");
        double data=44;
        return data;
    }
}
