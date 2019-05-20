package Logic;

import Data_Storage.Model;

public class Authenticator {

    Object baseDatos;
    Model model;
    //

    boolean validarUser(Object user) {
        return true;
    }

    public Object getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(Object baseDatos) {
        this.baseDatos = baseDatos;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
