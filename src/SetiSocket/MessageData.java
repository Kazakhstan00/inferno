package SetiSocket;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MessageData implements Serializable {
    String userName;
    String messageText;
    Date sentDate;

    public MessageData(){
    }

    public MessageData(String userName,String messageText){
        this.userName = userName;
        this.messageText = messageText;
        this.sentDate = new Date();
    }

    public String getDate(){
        String pattern = "EEE MMM dd kk:mm:ss z yyyy";
        DateFormat df = new SimpleDateFormat(pattern, Locale.ENGLISH);
        String todayAsString = df.format(sentDate);
        return todayAsString;
    }

    @Override
    public String toString() {
        return "'"+messageText+"'"+" from "+userName+" at "+getDate();
    }

    public Date getSentDate() {
        return sentDate;
    }

    public String getMessageText() {
        return messageText;
    }

    public String getUserName() {
        return userName;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public void setSentDate(Date sentDate) {
        this.sentDate = sentDate;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}