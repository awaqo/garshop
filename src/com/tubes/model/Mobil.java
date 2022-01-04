package com.tubes.model;

public class Mobil {
    private String merk;
    private int tahun;
    private int harga;

    public Mobil(String merk, int tahun, int harga) {
        this.merk = merk;
        this.tahun = tahun;
        this.harga = harga;
    }

    public Mobil() {
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
