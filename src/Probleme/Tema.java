package Probleme;

import java.util.Scanner;

public class Tema {


    //todo:Realizati un program care permite stergerea tuturor aparitiilor primei litere in cadrul cuvantului respectiv.
    // folosesc FUNCTIA : replace()
    // expl: pt cuvantul MAMAIE se va afisa AAIE


    public static void ex2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cuvantul: ");
        String cuvant = scanner.next();
        char primaLitera = cuvant.charAt(0);
        System.out.println("Litera care se elimina din cuvant este: " + primaLitera);
        String cuvantNou = cuvant.replace(Character.toString(primaLitera), "");
        System.out.println("Noul cuvant este: " + cuvantNou);

    }

    //todo:Sa se scrie un program care afiseaza cuvintele obtinute din cuvantul esemtial prin eliminarea succesiva a primului si al ultimului caracter.
    // expl: pt cum DEOSEBIT ->EOSEBI->OSEB->SE

    public static void ex3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cuvantul: ");
        String cuvant = scanner.next();

        String cuvantNou = cuvant.substring(1, cuvant.length() - 1);

        while (cuvantNou.length() > 0) {
            System.out.println(cuvantNou);
            cuvantNou = cuvantNou.substring(1, cuvantNou.length() - 1);
        }
    }


    //todo:Se considera o matrice de tipul nxm cu elemente de tip sir de caractere.
    // Creati un program care afiseaza sirul de caractere de lungime maximan de pe fiecare linie a matricei

    public static void ex4() {

        String[][] matrice = {{"ana", "are", "mere"}, {"ana", "are", "banane"}, {"ana", "are", "portocale"}};

        for (String[] linie : matrice) {
            String celMaiMareCuv = "";
            for (String s : linie) {
                if (s.length() > celMaiMareCuv.length()) {
                    celMaiMareCuv = s;
                }
            }
            System.out.println(celMaiMareCuv);
        }

    }


    //todo:Sa se creeze un program care transforma literele mici ale unui cuvant in litere mari si literele mari in litere mici.
    // pt cuv:    MiorItIC    se va afisa :    mIORiTic

    public static void ex5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cuvantul: ");
        String cuvant = scanner.next();
        String rezultat = " ";

        for (int i = 0; i < cuvant.length(); i++) {
            char caracter = cuvant.charAt(i);
            if (Character.isUpperCase(caracter)) {
                caracter = Character.toLowerCase(caracter);
            } else {
                caracter = Character.toUpperCase(caracter);
            }
            rezultat += caracter;
        }
        System.out.println("Cuvantul nou este : " + rezultat);
    }


    //todo: Se considera un sir de n cuviinte.
    // Sa se determine cuvantul de lungime maxima care se poate forma prin concatenarea a doua dintre cuvintele citite.
    // exemplu: pentru n=5 si sirul de cuvinte "mama", "arc", "conduce", "paine","vine" se va afisa conducepaine sai paineconduce

    public static void ex6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cate cuvinte vrei sa introduce? \n Raspuns: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti cuvintele: ");
        String[] listaCuvinte = new String[n];
        for (int i = 0; i < n; i++) {
            listaCuvinte[i] = scanner.nextLine();
        }
        String cuvantMaxim = " ";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    String cuvantConcatenare = listaCuvinte[i] + listaCuvinte[j];
                    if (cuvantConcatenare.length() > cuvantMaxim.length()) {
                        cuvantMaxim = cuvantConcatenare;
                    }
                }
            }
        }
        System.out.println("Cuvantul nou este : " + cuvantMaxim);
    }


    //todo: Se considera un sir de n cuvinte.
    // Sa se determine cuvantul cel mai mic in ordine lexicografica obtinut prin concatenarea a doua dintre cuvintele citite.
    // exemplu: pentru n=5 si sirul "mama", "arc", "conduce", "paine", "vine" se va afida : arcconduce


    public static void ex7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cate cuvinte vrei sa introduci? \n Raspuns: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti cuvintele: ");
        String[] listaCuvinte = new String[n];
        for (int i = 0; i < n; i++) {
            listaCuvinte[i] = scanner.nextLine();
        }
        String cuvantMinim = " ";
        for (int i = 0; i < listaCuvinte.length; i++) {
            for (int j = 0; j < listaCuvinte.length; j++) {
                if (i != j) {
                    String cuvantConcatenare = listaCuvinte[i] + listaCuvinte[j];
                    if (cuvantConcatenare.length()<cuvantMinim.length()) {
                        cuvantMinim = cuvantConcatenare;
                    }
                }
            }
        }
        System.out.println("cuvantul cel mai mic in ordine lexicografica obtinut prin concatenarea a doua dintre cuvintele citite este: " + cuvantMinim);
    }
}
