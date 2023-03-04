package Probleme;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Hangman {

    //todo: "Ana are mere"=>"--- --- ---"
    //todo:functie ce primeste ca parametru  textul cautat si literele gasite si returneaza noul text

    //"Ana are mere" si "ar"=> "A-a ar- --r-"

    public static String verificare(String text, String litereGasite) {

        String solutie = "";

        for (int i = 0; i < text.length(); i++) {

            if (litereGasite.contains(text.charAt(i) + "")) {

                solutie += text.charAt(i);
            } else if (text.charAt(i) == ' ') {

                solutie += " ";

            } else {
                solutie += "-";
            }
        }

        return solutie;
    }


    public static void playHangman() {
        Scanner scanner = new Scanner(System.in);
        String[] cuvinte = {"bunica", "mancare", "calculator", " bloc"};
        String alegere = cuvinte[(int) (Math.random() * cuvinte.length)];
        int numarIncercari = 0;
        int numarMaximIncercari = 10;
        String litereGasite = " ";
        while (numarIncercari < numarMaximIncercari) {
            System.out.println("Introduceti o litera: ");
            String litera = scanner.nextLine();
            litereGasite += litera;
            String solutie = verificare(alegere, litereGasite);
            System.out.println(solutie);
            if (!solutie.contains("-")) {
                System.out.println("Ai castigat!");
                break;
            }
            numarIncercari++;
        }
        if (numarIncercari == numarMaximIncercari) {
            System.out.println("Ai pierdut. Cuvantul este: " + alegere);
        }


    }


}
