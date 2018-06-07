/**
 * @author  Pau Palou
 * @version 1.0
 */

import java.util.Collection;
import java.util.Iterator;

public class Matricula {

    public final Estudiant estudiant = new Estudiant();

    public Matricula(){}

    public Matricula(long id, String nom, String cognoms, String dni, int curs, Collection assignatures) {
        /**
         * @see Fa referència a Estudiant
         */

        this.estudiant.setId(id);
        this.estudiant.setNom(nom);
        this.estudiant.setCognoms(cognoms);
        this.estudiant.setDni(dni);
        this.estudiant.setCurs(curs);
        this.estudiant.setAssignatures(assignatures);
    }

    public float costMatricula(){


        /**
         * @return Retorna el cost depenent dels credits
         * @param cost
         * @param credits
         */
        float cost = 0;
        int credits = 0;

        for (Iterator iter = estudiant.getAssignatures().iterator(); iter.hasNext();) {
            Assignatura element = (Assignatura) iter.next();
            credits = credits + element.credits;
        }

        cost = credits * 15;
        return cost;
    }

}