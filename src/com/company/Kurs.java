package com.company;

import java.util.Arrays;

public class Kurs {
    public String nameofKurs;
    public int numberOfkurs;
    public String mugalimdinAty;
    public Gruppa[] masivOfGroup;

    public Kurs() {
    }


    public Kurs(String nameofKurs, int numberOfkurs, String mugalimdinAty, Gruppa[] masivOfGroup) {
        this.nameofKurs = nameofKurs;
        this.numberOfkurs = numberOfkurs;
        this.mugalimdinAty = mugalimdinAty;
        this.masivOfGroup = masivOfGroup;
    }

    public String getNameofKurs() {
        return nameofKurs;
    }

    public void setNameofKurs(String nameofKurs) {
        this.nameofKurs = nameofKurs;
    }

    public int getNumberOfkurs() {
        return numberOfkurs;
    }

    public void setNumberOfkurs(int numberOfkurs) {
        this.numberOfkurs = numberOfkurs;
    }

    public String getMugalimdinAty() {
        return mugalimdinAty;
    }

    public void setMugalimdinAty(String mugalimdinAty) {
        this.mugalimdinAty = mugalimdinAty;
    }

    public Gruppa[] getMasivOfGroup() {
        return masivOfGroup;
    }

    public void setMasivOfGroup(Gruppa[] masivOfGroup) {
        this.masivOfGroup = masivOfGroup;
    }

    @Override
    public String toString(){
        return "Name of course: "+nameofKurs+" Number of course: "+numberOfkurs+
                " Name of Teacher "+
                mugalimdinAty +" Groups are: "+Arrays.toString(masivOfGroup);
    }
}
