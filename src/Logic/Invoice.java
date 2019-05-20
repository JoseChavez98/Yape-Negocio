package Logic;

public class Invoice extends Voucher{
    private String customerRuc;
    private String customerAdress;

    public Invoice(){

    }

    public String getCustomerRuc() {
        return customerRuc;
    }

    public void setCustomerRuc(String customerRuc) {
        this.customerRuc = customerRuc;
    }

    public String getCustomerAdress() {
        return customerAdress;
    }

    public void setCustomerAdress(String customerAdress) {
        this.customerAdress = customerAdress;
    }


}
