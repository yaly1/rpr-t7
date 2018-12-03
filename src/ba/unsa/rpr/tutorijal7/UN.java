package ba.unsa.rpr.tutorijal7;

import java.util.ArrayList;

class UN {
    private ArrayList<Drzava> NizDrzava;

    public UN(ArrayList<Drzava> nizDrzava) {
        NizDrzava = nizDrzava;
    }

    public void setNizDrzava(ArrayList<Drzava> nizDrzava) {
        NizDrzava = nizDrzava;
    }

    public ArrayList<Drzava> getNizDrzava() {
        return NizDrzava;
    }
}
