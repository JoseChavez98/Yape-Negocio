package Logic;

import java.util.Timer;

public class Qr extends Voucher {
    private String link;
    private Timer expireTime;
    private static int count;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Qr.count = count;
    }

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
