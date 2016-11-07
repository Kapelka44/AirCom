package Avia;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

import static Avia.Sozdanie.all;

public class Runner {
    public static void main(String[] args) throws IOException {
        Sozdanie sd;

        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));

        for (int a = 1; a < 3; a++) ;
        {

            sd = new Sozdanie();
            all.add(sd);
        }
        for (Sozdanie a : all) {
            System.out.println(a + " ");
        }

        System.out.println("Enter 1 for refueling aircraft ");
        System.out.println("Enter 2 to drain the fuel ");

        int a = Integer.parseInt(reader.readLine());
        if (a == 1) {
            System.out.println("Enter the aircraft's number ");
            int c = Integer.parseInt(reader.readLine());
            Sozdanie.settings(1, c);
        }

        if (a == 2) {
            System.out.println("Enter the aircraft's number ");
            int c = Integer.parseInt(reader.readLine());
            Sozdanie.settingss(2, c);
        }


        for (Sozdanie aaa : all) {
            System.out.println("refresh list " + aaa + " ");
        }
    }
}
