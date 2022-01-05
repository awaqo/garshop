package com.tubes.controller;

import com.tubes.model.Mitsubishi;
import com.tubes.model.Toyota;

public interface InterfaceMain{
    void jual(Toyota toyota, String kondisi);
    void jual(Mitsubishi mitsubishi);
    String[][] beli(Toyota toyota, int jumlah);
    String[][] beli(Mitsubishi mitsubishi, int jumlah);
    int countToyota();
    int countMitsubishi();
    int cariToyota(int pilih, String[][] dataToyota);
    int cariMitsubishi(int pilih, String[][] dataMitsubishi);
    void beliToyota(int pilih, String[][] dataToyota);
    void beliMitsubishi(int pilih, String[][] dataMitsubishi);
}
