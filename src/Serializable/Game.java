package Serializable;

import java.io.Serializable;
import java.util.ArrayList;

public class Game implements Serializable {
    private String gameName;
    private String ipAddress;
    private int port;
    private ArrayList<Players> players = new ArrayList();

    public Game(){}
    public Game(String gameName, String ipAddress, int port){
        this.gameName=gameName;
        this.ipAddress=ipAddress;
        this.port=port;

    }

    public int getPort() {
        return port;
    }

    public String getGameName() {
        return gameName;
    }

    public String getIpAddress() {
        return ipAddress;
    }


    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }


    public void setPort(int port) {
        this.port = port;
    }
    public void addPlayer(Players player){
        players.add(player);
    }
    @Override
    public String toString() {
        return gameName+" "+ipAddress+" "+port;
    }
    public ArrayList<Players> getPlayers() {
        return players;
    }
}