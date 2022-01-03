package com.tubes.model;

import com.tubes.controller.InterfaceMain;
import com.tubes.db.koneksi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ModelFitur implements InterfaceMain {
    public Statement st;
    public ResultSet rs;
    Connection cn = koneksi.koneksi();

    @Override
    public void jual(Toyota toyota) {
        try {
            st = cn.createStatement();
            String query = "INSERT INTO mobil VALUES (" +
                    "'"+ toyota.getPlat() +"', " +
                    "'"+ toyota.getMerk() +"', " +
                    "'"+ toyota.getTahun() +"', " +
                    "'"+ toyota.getHarga() +"', " +
                    "'"+ toyota.getCc() +"', " +
                    "'"+ toyota.getKondisi() +"'" +
                    ")";
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void jual(Mitsubishi mitsubishi) {
        try {
            st = cn.createStatement();
//            String query = "INSERT INTO mobil VALUES (" +
//                    "'"+ mitsubishi.getPlat() +"', " +
//                    "'"+ toyota.getMerk() +"', " +
//                    "'"+ toyota.getTahun() +"', " +
//                    "'"+ toyota.getHarga() +"', " +
//                    "'"+ toyota.getCc() +"', " +
//                    "'"+ toyota.getKondisi() +"'" +
//                    ")";
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void beli(Toyota toyota) {

    }

    @Override
    public void beli(Mitsubishi mitsubishi) {

    }
}
