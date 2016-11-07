package Avia;

public class Samolet extends Abstract implements outBak {


    String Avia[] = {"Boing", "Aero Boero AB-150", "Yak-36", "Ty-154", "ANT-14", "An-225"};

    @Override
    String name() {
        String name = Avia[(int) (Math.random() * Avia.length - 1)];
        return name;
    }

    @Override
    int id() {
        int id = (1 + (int) (Math.random() * 10));
        return id;
    }

    @Override
    int weight() {
        int weight = (400 + (int) (Math.random() * 2000));
        return weight;
    }


    @Override
    int seats() {
        int seats = (3000 + (int) (Math.random() * 1000));
        return seats;
    }


    @Override
    int fuel() {
        int fuel = (1000 + (int) (Math.random() * 10));
        return fuel;
    }

    @Override
    int speed() {
        int speed = (1000 + (int) (Math.random() * 200));
        return speed;
    }


    @Override
    public int outBakFuel() {
        int outBakFuel = 10;
        return outBakFuel;
    }


}
