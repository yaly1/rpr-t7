package ba.unsa.rpr.tutorijal7;

class Grad {
    private String naziv;
    private int brojStanovnika;
    private double[] temperature = new double[1000];

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
