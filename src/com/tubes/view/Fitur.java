package com.tubes.view;

import com.tubes.db.koneksi;
import com.tubes.model.Mitsubishi;
import com.tubes.model.Mobil;
import com.tubes.model.ModelFitur;
import com.tubes.model.Toyota;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Fitur {
    MenuUtama menu = new MenuUtama();
    ModelFitur model = new ModelFitur();

    static Scanner Sint = new Scanner(System.in);
    static Scanner Sstring = new Scanner(System.in);

    public static Statement st;
    public static ResultSet rs;
    static Connection cn = koneksi.koneksi();

    public static void instance1(Mobil mobil) {
        ModelFitur model = new ModelFitur();

        if (mobil instanceof Toyota) {
            Toyota toyota = (Toyota) mobil;
            try {
                st = cn.createStatement();
                String query = "SELECT count(*) FROM mobil WHERE tipe = 'Toyota'";
                rs = st.executeQuery(query);
                int d = 0;
                while (rs.next()) {
                    d = rs.getInt("count(*)");
                }
                String[][] data = model.beli(toyota, d);
//                System.out.println(data[0][1]);

                for (int i = 0; i < data.length; i++) {
                    System.out.print("\n" + i + ".");
                    System.out.println("\tNo Plat: " + data[i][0]);
                    System.out.println("\tMerk: " + data[i][1]);
                    System.out.println("\tTahun: " + data[i][2]);
                    System.out.println("\tHarga: " + data[i][3]);
                    System.out.println("\tCC: " + data[i][4]);
                    System.out.println("\tKondisi: " + data[i][5]);
                    System.out.println("\tJenis: " + data[i][6]);
                    System.out.println();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else if (mobil instanceof Mitsubishi) {
            Mitsubishi mitsubishi = (Mitsubishi) mobil;
            try {
                st = cn.createStatement();
                String query = "SELECT count(*) FROM mobil WHERE tipe = 'Mitsubishi'";
                rs = st.executeQuery(query);
                int d = 0;
                while (rs.next()) {
                    d = rs.getInt("count(*)");
                }
                String[][] data = model.beli(mitsubishi, d);

                for (int i = 0; i < data.length; i++) {
                    System.out.print("\n" + i + ".");
                    System.out.println("\tNo Plat: " + data[i][0]);
                    System.out.println("\tMerk: " + data[i][1]);
                    System.out.println("\tTahun: " + data[i][2]);
                    System.out.println("\tHarga: " + data[i][3]);
                    System.out.println("\tCC: " + data[i][4]);
                    System.out.println("\tKondisi: " + data[i][5]);
                    System.out.println("\tJenis: " + data[i][6]);
                    System.out.println();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void FiturJual() {
        menu.PilihMerk();
        int pilih_merk = Sint.nextInt();

        switch (pilih_merk) {
            case 1:
                System.out.print("Masukkan No Plat: ");
                String no_plat = Sstring.nextLine();
                System.out.print("Masukkan Nama Mobil: ");
                String nama = Sstring.nextLine();
                System.out.print("Masukkan Tahun: ");
                int tahun = Sint.nextInt();
                System.out.print("Masukkan harga: ");
                int harga = Sint.nextInt();
                System.out.print("Masukkan CC:");
                int cc = Sint.nextInt();

                System.out.println(">\tJenis");
                System.out.println("\t1. Baru");
                System.out.println("\t2. Bekas");
                System.out.print("\tPilih Menu: ");
                int jenis = Sint.nextInt();

                String jenis1 = "";
                switch (jenis) {
                    case 1:
                        jenis1 = "Baru";
                        break;
                    case 2:
                        jenis1 = "Bekas";
                }

                System.out.print("Masukkan Kondisi: ");
                String kondisi = Sstring.nextLine();

                Toyota toyota = new Toyota(no_plat, nama, tahun, harga, cc, jenis1);
                model.jual(toyota, kondisi);
                break;
            case 2:
                System.out.print("Masukkan No Plat: ");
                String no_plat1 = Sstring.nextLine();
                System.out.print("Masukkan Nama Mobil: ");
                String nama1 = Sstring.nextLine();
                System.out.print("Masukkan Tahun: ");
                int tahun1 = Sint.nextInt();
                System.out.print("Masukkan harga: ");
                int harga1 = Sint.nextInt();
                System.out.print("Masukkan CC:");
                int cc1 = Sint.nextInt();

                System.out.println(">\tJenis");
                System.out.println("\t1. Baru");
                System.out.println("\t2. Bekas");
                System.out.print("\tPilih Menu: ");
                int jenis3 = Sint.nextInt();

                String jenis2 = "";
                switch (jenis3) {
                    case 1:
                        jenis2 = "Baru";
                        break;
                    case 2:
                        jenis2 = "Bekas";
                        break;
                }

                Mitsubishi mitsubishi = new Mitsubishi(no_plat1, nama1, tahun1, harga1, cc1, jenis2);
                model.jual(mitsubishi);
                break;
        }
    }

    public void FiturBeli() {
        menu.PilihMerk();
        int pilihmerk = Sint.nextInt();

        switch (pilihmerk) {
            case 1:
                Toyota toyota = new Toyota();
                instance1(toyota);
                break;
            case 2:
                Mitsubishi mitsubishi = new Mitsubishi();
                instance1(mitsubishi);
                break;
        }
    }

}
