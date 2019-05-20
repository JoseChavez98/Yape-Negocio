package Logic;

import java.util.Timer;

public class Qr extends Voucher {
    private String link;
    private Timer expireTime;

    public Qr(){

    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Timer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Timer expireTime) {
        this.expireTime = expireTime;
    }
}
