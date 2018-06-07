import java.util.Collection;

import java.util.Iterator;

public class Matricula {

    public final Estudiant estudiant = new Estudiant();

    public Matricula(){}

    public Matricula(long id, String nom, String cognoms, String dni, int curs, Collection assignatures) {
        this.estudiant.setId(id);
        this.estudiant.setNom(nom);
        this.estudiant.setCognoms(cognoms);
        this.estudiant.setDni(dni);
        this.estudiant.setCurs(curs);
        this.estudiant.setAssignatures(assignatures);
    }

    public float costMatricula(){

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