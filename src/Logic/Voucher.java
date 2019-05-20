package Logic;


import Data_Storage.Parser;

import java.util.ArrayList;
import java.util.Date;

public class Voucher {

    private Qr qr;
    private Date date;
    private String customerName;
    private String businessName;
    private String businessAdress;
    private String businessRuc;
    private String series;
    private int correlativeNumber;
    private ArrayList<Object> items;
    private float totalCost;
    private Parser userData;

    public Voucher(){

    }

    public Qr getQr() {
        return qr;
    }

    public void setQr(Qr qr) {
        this.qr = qr;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return customerName;
    }

    public void setName(String customerName) {
        this.customerName = customerName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessAdress() {
        return businessAdress;
    }

    public void setBusinessAdress(String businessAdress) {
        this.businessAdress = businessAdress;
    }

    public String getBusinessRuc() {
        return businessRuc;
    }

    public void setBusinessRuc(String businessRuc) {
        this.businessRuc = businessRuc;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getCorrelativeNumber() {
        return correlativeNumber;
    }

    public void setCorrelativeNumber(int correlativeNumber) {
        this.correlativeNumber = correlativeNumber;
    }

    public ArrayList<Object> getItems() {
        return items;
    }

    public void setItems(ArrayList<Object> items) {
        this.items = items;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }



}
