package com.example.cav.saleoffhunter.Entity;

/**
 * Created by Asus on 31-01-2018.
 */

public class Country {

    String paisNombre;
    int paisId;

    public Country() {
    }

    public Country(String paisNombre, int paisId) {
        this.paisNombre = paisNombre;
        this.paisId = paisId;
    }

    public String getPaisNombre() {
        return paisNombre;
    }

    public void setPaisNombre(String paisNombre) {
        this.paisNombre = paisNombre;
    }

    public int getPaisId() {
        return paisId;
    }

    public void setPaisId(int paisId) {
        this.paisId = paisId;
    }
}
