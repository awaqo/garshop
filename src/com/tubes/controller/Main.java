package com.tubes.controller;

import com.tubes.view.Fitur;
import com.tubes.view.MenuUtama;

import java.util.Scanner;

public class Main {
    static Scanner Sint = new Scanner(System.in);

    public static void main(String[] args) {
        MenuUtama menu = new MenuUtama();
        Fitur fitur = new Fitur();

        menu.Menu();
        int pilih_menu = Sint.nextInt();
        System.out.println();

        do {
            switch (pilih_menu) {
                case 1:
                    fitur.FiturJual();
                    menu.Menu();
                    pilih_menu = Sint.nextInt();
                    System.out.println();
                    break;
                case 2:
                    fitur.FiturBeli();
                    menu.Menu();
                    pilih_menu = Sint.nextInt();
                    System.out.println();
                    break;
            }
        } while (pilih_menu != 3);
    }
}
