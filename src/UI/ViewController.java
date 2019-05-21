package UI;

import UI.colaborator.MainPageColaborator;
import UI.owner.MainPageOwner;

public class ViewController {
    private MainPageOwner mainPageOwner;
    private MainPageColaborator mainPageColaborator;
    private Login login;
    private MakeInvoice makeInvoice;
    private MakeTicket makeTicket;
    private Register register;

    public ViewController(){

    }

    public MainPageOwner getMainPageOwner() {
        return mainPageOwner;
    }

    public void setMainPageOwner(MainPageOwner mainPageOwner) {
        this.mainPageOwner = mainPageOwner;
    }

    public MainPageColaborator getMainPageColaborator() {
        return mainPageColaborator;
    }

    public void setMainPageColaborator(MainPageColaborator mainPageColaborator) {
        this.mainPageColaborator = mainPageColaborator;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public MakeInvoice getMakeInvoice() {
        return makeInvoice;
    }

    public void setMakeInvoice(MakeInvoice makeInvoice) {
        this.makeInvoice = makeInvoice;
    }

    public MakeTicket getMakeTicket() {
        return makeTicket;
    }

    public void setMakeTicket(MakeTicket makeTicket) {
        this.makeTicket = makeTicket;
    }

    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }
}
