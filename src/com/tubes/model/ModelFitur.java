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
    public void jual(Toyota toyota, String kondisi) {
        try {
            st = cn.createStatement();
            String query = "INSERT INTO mobil VALUES (" +
                    "'"+ toyota.getPlat() +"', " +
                    "'"+ toyota.getMerk() +"', " +
                    "'Toyota', " +
                    "'"+ toyota.getTahun() +"', " +
                    "'"+ toyota.getHarga() +"', " +
                    "'"+ toyota.getCc() +"', " +
                    "'"+ kondisi +"', " +
                    "'"+ toyota.getJenis() +"'" +
                    ")";
            st.execute(query);
            System.out.println("Data Berhasil Ditambahkan");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void jual(Mitsubishi mitsubishi) {
        try {
            st = cn.createStatement();
            String query = "INSERT INTO mobil VALUES (" +
                    "'"+ mitsubishi.getPlat() +"', " +
                    "'"+ mitsubishi.getMerk() +"', " +
                    "'Mitsubishi', " +
                    "'"+ mitsubishi.getTahun() +"', " +
                    "'"+ mitsubishi.getHarga() +"', " +
                    "'"+ mitsubishi.getCc() +"', " +
                    "'', " +
                    "'"+ mitsubishi.getJenis() +"'" +
                    ")";
            st.execute(query);
            System.out.println("Berhasil Menambahkan");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String[][] beli(Toyota toyota, int jumlah) {
        String[][] data1 = new String[0][0];

        try {
            st = cn.createStatement();
            String sql = "SELECT * FROM mobil WHERE tipe = 'Toyota'";
            rs = st.executeQuery(sql);

            int i = 0;
            String[][] data = new String[jumlah][7];

            while (rs.next()) {
                data[i][0] = rs.getString("no_plat");
                data[i][1] = rs.getString("merk");
                data[i][2] = rs.getString("tahun");
                data[i][3] = rs.getString("harga");
                data[i][4] = rs.getString("cc");
                data[i][5] = rs.getString("kondisi");
                data[i][6] = rs.getString("jenis");
                i++;
            }
            return data;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data1;
    }

    @Override
    public String[][] beli(Mitsubishi mitsubishi, int jumlah) {
        String[][] data1 = new String[0][0];

        try {
            st = cn.createStatement();
            String sql = "SELECT * FROM mobil  WHERE tipe = 'Mitsubishi'";
            rs = st.executeQuery(sql);

            int i = 0;
            String[][] data = new String[jumlah][7];

            while (rs.next()) {
                data[i][0] = rs.getString("no_plat");
                data[i][1] = rs.getString("merk");
                data[i][2] = rs.getString("tahun");
                data[i][3] = rs.getString("harga");
                data[i][4] = rs.getString("cc");
                data[i][5] = rs.getString("kondisi");
                data[i][6] = rs.getString("jenis");
                i++;
            }
            return data;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data1;
    }
}
