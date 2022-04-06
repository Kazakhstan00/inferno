package Serializable;

import java.io.Serializable;

public class Players implements Serializable {
    private String nickName;
    private double rating;

    public Players(){}
    public Players(String nickName, double rating){
        this.nickName=nickName;
        this.rating=rating;
    }

    public String getNickName() {
        return nickName;
    }

    public double getRating() {
        return rating;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    public String getData(){
        return nickName+" "+rating;
    }
}
