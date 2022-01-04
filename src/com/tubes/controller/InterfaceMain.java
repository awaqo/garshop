package com.tubes.controller;

import com.tubes.model.Mitsubishi;
import com.tubes.model.Toyota;

public interface InterfaceMain{
    public void jual(Toyota toyota, String kondisi);
    public void jual(Mitsubishi mitsubishi);
    public String[][] beli(Toyota toyota, int jumlah);
    public String[][] beli(Mitsubishi mitsubishi, int jumlah);
}
