/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03;

import java.util.Objects;

/**
 *
 * @author Om
 */
public class Player {
    String name;
    String positionPlayed;
    int jerseyNumber;
    
    public Player(String x, String y, int z){
        name = x;
        positionPlayed = y;
        jerseyNumber = z;
    }

    @Override
    public String toString() {
        return "Player: [" + "name=" + name + ", positionPlayed=" + positionPlayed + ", jerseyNumber=" + jerseyNumber + ']';
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.positionPlayed, other.positionPlayed)) {
            return false;
        }
        if (this.jerseyNumber != other.jerseyNumber) {
            return false;
        }
        return true;
    }

    public void setPositionPlayed(String positionPlayed) {
        this.positionPlayed = positionPlayed;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() {
        return name;
    }

    public String getPositionPlayed() {
        return positionPlayed;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }
    
}
