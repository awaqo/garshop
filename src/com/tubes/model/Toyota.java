package com.tubes.model;

public class Toyota extends Mobil {
    private int cc;
    private String plat;
    private String kondisi;

    public Toyota(String merk, int tahun, int harga, int cc, String plat, String kondisi) {
        super(merk, tahun, harga);
        this.cc = cc;
        this.plat = plat;
        this.kondisi = kondisi;
    }

    public Toyota(String merk, int tahun, int harga, int cc, String plat) {
        super(merk, tahun, harga);
        this.cc = cc;
        this.plat = plat;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }
}
