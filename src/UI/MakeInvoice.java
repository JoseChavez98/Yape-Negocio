package UI;

import java.util.ArrayList;

public class MakeInvoice {
    private Object labelTitle;
    private ArrayList<Object> texItems;
    private Object buttonCharge;
    private Object labelTotal;

    public MakeInvoice(){

    }

    public Object getLabelTitle() {
        return labelTitle;
    }

    public void setLabelTitle(Object labelTitle) {
        this.labelTitle = labelTitle;
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

    public Object getLabelTotal() {
        return labelTotal;
    }

    public void setLabelTotal(Object labelTotal) {
        this.labelTotal = labelTotal;
    }
}
