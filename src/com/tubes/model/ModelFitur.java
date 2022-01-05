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
            String sql = "SELECT * FROM mobil WHERE tipe = 'Mitsubishi'";
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
    public int countToyota() {
        int count = 0;
        try {
            st = cn.createStatement();
            String query = "SELECT count(*) FROM mobil WHERE tipe = 'Toyota'";
            rs = st.executeQuery(query);
            while (rs.next()) {
                count = rs.getInt("count(*)");
            }
            return count;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public int countMitsubishi() {
        int count = 0;
        try {
            st = cn.createStatement();
            String query = "SELECT count(*) FROM mobil WHERE tipe = 'Mitsubishi'";
            rs = st.executeQuery(query);
            count = 0;
            while (rs.next()) {
                count = rs.getInt("count(*)");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public int cariToyota(int pilih, String[][] dataToyota) {
        int harga = 0;
        try {
            st = cn.createStatement();
            String sql = "SELECT harga FROM mobil WHERE no_plat = '"+ dataToyota[pilih][0] +"'";
            rs = st.executeQuery(sql);

            while (rs.next()) {
                harga = Integer.parseInt(rs.getString("harga"));
            }
            return harga;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return harga;
    }

    @Override
    public int cariMitsubishi(int pilih, String[][] dataMitsubishi) {
        int harga = 0;
        try {
            st = cn.createStatement();
            String sql = "SELECT harga FROM mobil WHERE no_plat = '"+ dataMitsubishi[pilih][0] +"'";
            rs = st.executeQuery(sql);

            while (rs.next()) {
                harga = Integer.parseInt(rs.getString("harga"));
            }
            return harga;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return harga;
    }

    @Override
    public void beliToyota(int pilih, String[][] dataToyota) {
        try {
            st = cn.createStatement();
            String query = "DELETE FROM mobil WHERE no_plat = '"+ dataToyota[pilih][0] +"'";
            st.execute(query);
            System.out.println("\tSelamat, Anda Berhasil Membeli Mobil Tersebut.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void beliMitsubishi(int pilih, String[][] dataMitsubishi) {
        try {
            st = cn.createStatement();
            String query = "DELETE FROM mobil WHERE no_plat = '"+ dataMitsubishi[pilih][0] +"'";
            st.execute(query);
            System.out.println("\tSelamat, Anda Berhasil Membeli Mobil Tersebut.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
