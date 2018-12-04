package ba.unsa.rpr.tutorijal7;

import java.util.Arrays;

class Grad {
    private String naziv;
    private int brojStanovnika;
    private double[] temperature = new double[1000];

    @Override
    public String toString() {
        return "Grad{" +
                "naziv='" + naziv + '\'' +
                ", brojStanovnika=" + brojStanovnika +
                ", temperature=" + Arrays.toString(temperature) +
                '}';
    }

    Grad(String naziv, int brojStanovnika, double[] temperature) {
        this.naziv = naziv;
        this.brojStanovnika = brojStanovnika;
        this.temperature = temperature;
    }

    public Grad() {
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setBrojStanovnika(int brojStanovnika) {
        this.brojStanovnika = brojStanovnika;
    }

    public void setTemperature(double[] temperature) {
        this.temperature = temperature;
    }


    public String getNaziv() {
        return naziv;
    }

    public int getBrojStanovnika() {
        return brojStanovnika;
    }

    public double[] getTemperature() {
        return temperature;
    }
}
