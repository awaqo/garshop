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
    static MenuUtama menu = new MenuUtama();
    static ModelFitur model = new ModelFitur();

    static Scanner Sint = new Scanner(System.in);
    static Scanner Sstring = new Scanner(System.in);

    public static Statement st;
    public static ResultSet rs;
    static Connection cn = koneksi.koneksi();

    static String[][] dataToyota;
    static String[][] dataMitsubishi;

    public static boolean bayar(int bayar, int harga) {
        if ( bayar == harga ) {
            return false;
        }
        return true;
    }

    public static void instance(Mobil mobil) {
        if (mobil instanceof Toyota) {
            Toyota toyota = (Toyota) mobil;

            int count = model.countToyota();
            dataToyota = model.beli(toyota, count);
//                System.out.println(data[0][1]);

            for (int i = 0; i < dataToyota.length; i++) {
                System.out.print("\n" + i + ".");
                System.out.println("\tNo Plat: " + dataToyota[i][0]);
                System.out.println("\tMerk: " + dataToyota[i][1]);
                System.out.println("\tTahun: " + dataToyota[i][2]);
                System.out.println("\tHarga: " + dataToyota[i][3]);
                System.out.println("\tCC: " + dataToyota[i][4]);
                System.out.println("\tKondisi: " + dataToyota[i][5]);
                System.out.println("\tJenis: " + dataToyota[i][6]);
            }
        } else if (mobil instanceof Mitsubishi) {
            Mitsubishi mitsubishi = (Mitsubishi) mobil;

            int count = model.countMitsubishi();
            dataMitsubishi = model.beli(mitsubishi, count);

            for (int i = 0; i < dataMitsubishi.length; i++) {
                System.out.print("\n" + i + ".");
                System.out.println("\tNo Plat: " + dataMitsubishi[i][0]);
                System.out.println("\tMerk: " + dataMitsubishi[i][1]);
                System.out.println("\tTahun: " + dataMitsubishi[i][2]);
                System.out.println("\tHarga: " + dataMitsubishi[i][3]);
                System.out.println("\tCC: " + dataMitsubishi[i][4]);
                System.out.println("\tKondisi: " + dataMitsubishi[i][5]);
                System.out.println("\tJenis: " + dataMitsubishi[i][6]);
            }
        }
    }

    public void FiturJual() {
        menu.PilihMerk();
        int pilih_merk = Sint.nextInt();
        System.out.println();

        switch (pilih_merk) {
            case 1:
                System.out.println();
                System.out.print("\tMasukkan No Plat: ");
                String no_plat = Sstring.nextLine();
                System.out.print("\tMasukkan Nama Mobil: ");
                String nama = Sstring.nextLine();
                System.out.print("\tMasukkan Tahun: ");
                int tahun = Sint.nextInt();
                System.out.print("\tMasukkan harga: ");
                int harga = Sint.nextInt();
                System.out.print("\tMasukkan CC: ");
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

                System.out.print("\tMasukkan Kondisi: ");
                String kondisi = Sstring.nextLine();

                Toyota toyota = new Toyota(no_plat, nama, tahun, harga, cc, jenis1);
                model.jual(toyota, kondisi);
                break;
            case 2:
                System.out.println();
                System.out.print("\tMasukkan No Plat: ");
                String no_plat1 = Sstring.nextLine();
                System.out.print("\tMasukkan Nama Mobil: ");
                String nama1 = Sstring.nextLine();
                System.out.print("\tMasukkan Tahun: ");
                int tahun1 = Sint.nextInt();
                System.out.print("\tMasukkan harga: ");
                int harga1 = Sint.nextInt();
                System.out.print("\tMasukkan CC: ");
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
        System.out.println();

        switch (pilihmerk) {
            case 1:
                Mobil toyota = new Toyota();
                instance(toyota);

                System.out.println();
                System.out.print("\tPilih Mobil: ");
                int pilih = Sint.nextInt();
                int harga = model.cariToyota(pilih, dataToyota);
                System.out.println("\tHarga: " + harga);

                boolean hasil = true;
                do {
                    System.out.print("\tBayar: ");
                    int bayar = Sint.nextInt();

                    hasil = bayar(bayar, harga);
                } while (hasil);
                model.beliToyota(pilih, dataToyota);
                System.out.println();
                break;
            case 2:
                Mobil mitsubishi = new Mitsubishi();
                instance(mitsubishi);

                System.out.println();
                System.out.print("\tPilih Mobil: ");
                int pilih1 = Sint.nextInt();
                int harga1 = model.cariToyota(pilih1, dataMitsubishi);
                System.out.println("\tHarga: " + harga1);

                boolean hasil1 = true;
                do {
                    System.out.print("\tBayar: ");
                    int bayar = Sint.nextInt();

                    hasil1 = bayar(bayar, harga1);
                } while (hasil1);
                model.beliMitsubishi(pilih1, dataMitsubishi);
                System.out.println();
                break;
        }
    }

}
