package Avia;

import java.util.ArrayList;


public class Sozdanie extends Samolet implements goBak {

    public static ArrayList<Sozdanie> all = new ArrayList<>();
    String name;
    int id;
    int weight;
    int seats;
    int fuel;
    int speed;
    int bak;



    Sozdanie() {
        this.name = super.name();
        this.id = super.id();
        this.weight = super.weight();
        this.seats = super.seats();
        this.fuel = super.fuel();
        this.speed = super.speed();
        this.bak = super.outBakFuel();
    }

    public int getId() {
        return id;
    }

    public void outBak() {
        this.fuel -= super.outBakFuel();
    }

    public void inBakFuel() {
        this.fuel += 100 + inBak;

    }


    public String toString() {
        return "samolet name - " + this.name + "- " + this.id + " weight - " + this.weight + " seats - " + this.seats + " fuel tank - " + this.fuel + "speed - " + this.speed;
    }


    public static int settings(int i, int c) {
        if (i == 1)
            for (Sozdanie b : all) {
                if (b.getId() == c) {
                    b.inBakFuel();
                }
            }
        return i;
    }

    public static int settingss(int setting, int c) {
        if (setting == 2)
            for (Sozdanie b : all) {
                if (b.getId() == c) {
                    b.outBak();
                }
            }
        return setting;
    }
}
