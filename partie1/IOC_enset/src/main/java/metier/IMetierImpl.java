package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class IMetierImpl implements IMetier {
    //Le couplage faible, c'est-à-dire la class métier dépend directement de l'interface idao

    //declaration d'un objet de type IDao
    @Autowired
    private IDao deo;//couplage faible
    // À noter le couplage fort, c'est le fait d'appeler une classe directement avec new
    @Override
    public double calcul() {
        double data= deo.getData();
        double res= data*11.4;
        return res;
    }

    /**
     * Injecter dans la variable dae un objet d'une class qui implimente l'intrface IDao
     * ce setter permet de faire l'injection de dépendance
     * @param deo
     */
    public void setDao(IDao deo) {
        this.deo = deo;
    }
}
