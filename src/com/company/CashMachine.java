package com.company;


import java.util.Scanner;

public class CashMachine {


    private static int innaTransakcja;
    private static float stan = 0;
    private static Scanner Skanerek = new Scanner(System.in);

    public static void main(String[] args) {
        transakcja();

    }

    private static void transakcja() {

        int wybor;
        System.out.println("Wybierz co chcesz zrobić\n 1. Wybierz kase\n 2.Deponuj\n 3.Stan konta ");

        wybor = Skanerek.nextInt();

        switch (wybor) {

            case 1:
                float kwota;
                System.out.println("Ile chcesz wyplacic?");
                kwota = Skanerek.nextFloat();
                if (kwota > stan || stan == 0) {
                    System.out.println("Stan konta nie pozwala na wyplacenie gotówy\n");
                    inna_transakcja();
                } else {

                    stan -= kwota;
                    System.out.println("Wybrales: " + kwota + "Stan konta to: " + stan + "\n");
                    inna_transakcja();
                }
                break;
            case 2:
                float kwota_dep;
                System.out.println("Ile chcesz zdeponować?");
                kwota_dep = Skanerek.nextFloat();
                stan += kwota_dep;
                System.out.println("Zdeponowales" + kwota_dep);
                inna_transakcja();
                break;
            case 3:
                System.out.println("Stan Twojego konta wynosi: " + stan);
                inna_transakcja();
                break;
        }
    }


    private static void inna_transakcja() {

        System.out.println("Inny krok?\nWcisnij 1");

        innaTransakcja = Skanerek.nextInt();
        if (innaTransakcja == 1) {
            transakcja();
        } else if (innaTransakcja == 2) {
            System.out.println("Dobry wybór");
        } else {
            System.out.println("Niedozwolony wybor\n");
            inna_transakcja();
        }

    }


}
