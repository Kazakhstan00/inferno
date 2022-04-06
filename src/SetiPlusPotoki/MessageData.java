package SetiPlusPotoki;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class MessageData implements Serializable {
    String text;
    Date date;

    public MessageData(String text){
        this.text = text;
        this.date = new Date();
    }

    public String getDate(){
        String pattern = "EEE MMM dd kk:mm:ss z yyyy";
        DateFormat df = new SimpleDateFormat(pattern, Locale.ENGLISH);
        String todayAsString = df.format(date);
        return todayAsString;
    }

    public String toString() {
        return "'"+text+"'"+" at "+getDate();
    }
}