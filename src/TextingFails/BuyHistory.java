package TextingFails;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class BuyHistory {
    private String goodName;
    private int goodPrice;
    private Date buyTime;

    public BuyHistory(){}

    public BuyHistory(String goodName, int goodPrice){
        this.goodName=goodName;
        this.goodPrice=goodPrice;
        this.buyTime=new Date();
    }

    public String getGoodName() {
        return goodName;
    }

    public int getGoodPrice() {
        return goodPrice;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public String getDate(){
        String pattern = "MM/dd/yyyy HH:mm:ss";
        DateFormat df = new SimpleDateFormat(pattern);
        String todayAsString = df.format(buyTime);
        return todayAsString;
    }
    public String toString(){
        return goodName+" "+goodPrice+" "+buyTime;
    }
}