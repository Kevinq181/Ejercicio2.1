package clase03_proavanzada;

import java.util.ArrayList;

public class RegistroAcademico {

    ArrayList<Personas> listPersonas = new ArrayList<Personas>();
    ArrayList<ComponenteEducativo> listComponente = new ArrayList<ComponenteEducativo>();

    public void agregarPersona(Personas objp) {
        listPersonas.add(objp);
    }

    public void agregarComponente(ComponenteEducativo objc) {
        listComponente.add(objc);
    }

    public void mostrarPersona() {
        for (int i = 0; i < listPersonas.size(); i++) {
            System.out.println(listPersonas.get(i).toString());

        }
    }

    public void mostrarComponente() {

        for (int i = 0; i < listPersonas.size(); i++) {
            System.out.println(listPersonas.get(i).toString() + listComponente.get(i).toString());
            
        }

    }

}
