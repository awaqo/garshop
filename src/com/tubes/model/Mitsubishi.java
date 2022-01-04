package com.tubes.model;

public class Mitsubishi extends Mobil {
    private int cc;
    private String plat;
    private String jenis;

    public Mitsubishi(String plat, String merk, int tahun, int harga, int cc,  String jenis) {
        super(merk, tahun, harga);
        this.cc = cc;
        this.plat = plat;
        this.jenis = jenis;
    }

    public Mitsubishi(String merk, int tahun, int harga, int cc, String plat) {
        super(merk, tahun, harga);
        this.cc = cc;
        this.plat = plat;
    }

    public Mitsubishi() {

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

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
