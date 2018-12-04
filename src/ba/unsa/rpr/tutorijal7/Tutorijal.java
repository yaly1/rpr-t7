package ba.unsa.rpr.tutorijal7;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Tutorijal {

    private static ArrayList<Grad> ucitajGradove() {
        Scanner ulaz;
        ArrayList<Grad> gradovi = new ArrayList<>();
        try {
            ulaz = new Scanner(new FileReader("mjerenja.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Datoteka mjerenja.txt ne postoji ili se ne može otvoriti.");
            System.out.println("Greška: " + e);
            return null;
        }

        try {
            double[] temperature;
            while (ulaz.hasNext()) {
                String s = ulaz.nextLine();
                int i = 0;
                int vel = 0;
                String nazivGrada = "";
                temperature = new double[1000];
                while (Character.isLetter(s.charAt(i)) || s.charAt(i) == ' ') {
                    nazivGrada += s.charAt(i);
                    i++;
                }
                while ( i < s.length() && (s.charAt(i) == ',' && vel < 1000)) {
                    String temperatura = "";
                    i++;
                    boolean a = false;
                    while (i < s.length() && (Character.isDigit(s.charAt(i)) || s.charAt(i) == '.' || s.charAt(i) == '-')) {
                        temperatura += s.charAt(i);
                        i++;
                        a = true;
                        System.out.println(temperatura);
                    }
                    if (a) temperature[vel++] = Double.parseDouble(temperatura);
                    System.out.println("jedan");
                }
                gradovi.add(new Grad(nazivGrada, 0, temperature));
            }

        } catch (Exception e) {
            System.out.println("Problem pri čitanju podataka.");
            System.out.println("Greška: " + e);

        } finally {
            ulaz.close();
        }
        return gradovi;
    }

    public static void main(String[] args) {
        ArrayList<Grad> gradovi = ucitajGradove();
        for (Grad d : gradovi) System.out.println(d);
    }
}
