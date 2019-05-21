package UI.colaborator;

import java.util.ArrayList;

public class MainPageColaborator {
    private Object labelTitle;
    private Object buttonInvoice;
    private Object buttonTicket;
    private ArrayList<Object> texItems;
    private Object buttonCharge;

    public MainPageColaborator(){

    }

    public Object getLabelTitle() {
        return labelTitle;
    }

    public void setLabelTitle(Object labelTitle) {
        this.labelTitle = labelTitle;
    }

    public Object getButtonInvoice() {
        return buttonInvoice;
    }

    public void setButtonInvoice(Object buttonInvoice) {
        this.buttonInvoice = buttonInvoice;
    }

    public Object getButtonTicket() {
        return buttonTicket;
    }

    public void setButtonTicket(Object buttonTicket) {
        this.buttonTicket = buttonTicket;
    }

    public ArrayList<Object> getTexItems() {
        return texItems;
    }

    public void setTexItems(ArrayList<Object> texItems) {
        this.texItems = texItems;
    }

    public Object getButtonCharge() {
        return buttonCharge;
    }

    public void setButtonCharge(Object buttonCharge) {
        this.buttonCharge = buttonCharge;
    }
}
