package Probleme;

import java.util.Scanner;

public class Tema2 {

    //EX1
    //todo:SE CITESTE UN SIR DE CARACTERE DE MAXIM 200 DE CARACTERE, CUVINTE SEPARATE PRIN UNUL SAU MAI MULTE SPATII
    // todo:    a) sa se elimine spatiile multiple dintre cuvinte
    public static void exA() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cate cuvinte vrei sa introduce? \n Raspuns: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti cuvintele: ");
        String[] listaCuvinte = new String[n];
        for (int i = 0; i < n; i++) {
            listaCuvinte[i] = scanner.nextLine();
        }

        for (int i = 0; i < n; i++) {
            listaCuvinte[i] = listaCuvinte[i].replaceAll("\\s+", " ");
        }

        // Afiseaza cuvintele procesate
        for (String cuvant : listaCuvinte) {
            System.out.println(cuvant);
        }

    }
    //todo:     b) sa se transforme prima litera din fiecare cuvant in litera mare si sa se inlocuiasca ultima litera din fiecare cuvant cu urmatoarea de dupa ea din alfabet

    public static char urmLitera(char c) {
        if (c == 'z') {
            return 'a';
        } else if (c == 'Z') {
            return 'A';
        } else {
            return (char) (c + 1);
        }
    }

    public static void exB() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti cuvintele: ");
        String aux = scanner.nextLine();

        String[] cuvinte = aux.split(" ");

        for (int i = 0; i < cuvinte.length; i++) {
            String cuvant = cuvinte[i];
            String primaLitera = cuvant.substring(0, 1);
            String restulCuv = cuvant.substring(1);

            cuvinte[i] = primaLitera.toUpperCase() + restulCuv.substring(0, restulCuv.length() - 1)
                    + urmLitera(restulCuv.charAt(restulCuv.length() - 1));
        }

        String rezultatFinal = String.join(" ", cuvinte);
        System.out.println("Noul sir de caract: " + rezultatFinal);
    }


    //todo:     c) dublati toate vocalele mari si stergeti toate vocalele mici
    public static void exC() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti cuvintele: ");
        String cuv = scanner.nextLine();

        String rezultat = "";
        for (int i = 0; i < cuv.length(); i++) {
            char c = cuv.charAt(i);
            if ("AEIOU".indexOf(c) != -1) {
                rezultat += c + "" + c;
            } else if ("aeiou".indexOf(c) == -1) {
                rezultat += c;
            }
        }

        System.out.println("Noul sir de caract: " + rezultat);
    }


    //todo:     d) realizati suma tuturor cifrelor sin sir

    public static void exD() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti cuvintele: ");
        String cuv = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < cuv.length(); i++) {
            char c = cuv.charAt(i);
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }

        System.out.println("Suma cifrelor : " + sum);
    }


    //todo:     e) sa se verifice de cate ori apare ultimul cuvant in tot sirul

    public static void exE() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cuvintele: ");
        String cuv = scanner.nextLine();

        System.out.println("Sa se introduca ultimul cuvant: ");
        String ultCuvant = scanner.nextLine();

        String[] cuvinte = cuv.split("\\s+");
        int ct = 0;

        for (int i = 0; i < cuvinte.length; i++) {
            if (cuvinte[i].equals(ultCuvant)) {
                ct++;
            }
        }
        System.out.println("Ultimul cuvant " + ultCuvant + "apare de: " + ct);

    }

    //todo:     f) interschimbati elementele sirului in oglinda fata de mijloc

    public static void exF() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cuvintele: ");
        String cuv = scanner.nextLine();

        char[] sirCuvinte = cuv.toCharArray();
        int lungime = sirCuvinte.length;

        for (int i = 0; i < lungime / 2; i++) {
            char aux = sirCuvinte[i];
            sirCuvinte[i] = sirCuvinte[lungime - i - 1];
            sirCuvinte[lungime - i - 1] = aux;
        }

        String listaFinalaCuvinte = new String(sirCuvinte);
        System.out.println("Sirul in oglinda este: " + listaFinalaCuvinte);
    }


    //todo:     g) cate litere mici avem? sunt toate literele consoane?

    public static void exG() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cuvintele: ");
        String cuvinte = scanner.nextLine();

        int nrLitereMici = 0;
        boolean suntToateConsoane = true;

        for (char c : cuvinte.toCharArray()) {
            if (Character.isLowerCase(c)) {
                nrLitereMici++;

            }


            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':

                    suntToateConsoane = false;
                    break;

                default:
                    break;
            }
        }
        System.out.println("Numarul de litere mici este : " + nrLitereMici);
        if (suntToateConsoane) {
            System.out.println("toate literele din sir sunt consoane");
        } else {
            System.out.println("Sirul contine si vocale");
        }

    }


    //EX 2
    //todo:     SE CITESTE UN SIR DE CARACTERE DE MAXIM 200 DE CARACTERE, CUVINTE SEPARATE PRIN SEPARATORII " .!?;:  "
    //todo:     a) realizati un nou sir cu toate cuvintele palindroame


    public static boolean estePalindrom(String cuv) {
        int i = 0;
        int j = cuv.length() - 1;

        while (i < j) {
            if (cuv.charAt(i) != cuv.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void ex2A() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cuvintele: ");
        String cuv = scanner.nextLine();


        String[] cuvinte = cuv.split("");
        String cuvintePalindroame = "";
        for (String aux : cuvinte) {
            if (estePalindrom(aux)) {
                cuvintePalindroame += aux + " ";
            }
        }

        System.out.println(" cuvintele palindroame sunt: " + cuvintePalindroame);

    }
    //todo:     b) afisati cuvantul ce are cele mai multe vocale


    public static int contorVocale(String cuv) {
        int ct = 0;

        for (int i = 0; i < cuv.length(); i++) {
            char aux = cuv.charAt(i);
            if (aux == 'a' || aux == 'e' || aux == 'i' || aux == 'o' || aux == 'u') {
                ct++;
            }
        }
        return ct;

    }


    public static void ex2B() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cuvintele: ");
        String cuv = scanner.nextLine();

        String[] cuvinte = cuv.split("");
        int maximVocale = 0;
        String cuvinteCuMaxDeVocale = null;

        for (String aux : cuvinte) {
            int nrVocale = contorVocale(aux);

            if (nrVocale > maximVocale) {
                maximVocale = nrVocale;
                cuvinteCuMaxDeVocale = aux;
            }
            System.out.println("cuvantul cu cele mai multe vocale este : " + cuvinteCuMaxDeVocale);
        }


    }
    //todo:     c) modificati sirul citit astfel incat sa stergeti toate cuvintele ce au mai putin de 4 caractere

    public static void ex2C() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cuvintele: ");
        String cuv = scanner.nextLine();
        String[] splitCuvinte = cuv.split("");
        String rezultat = "";

        for (String aux : splitCuvinte) {
            if (aux.length() >= 4) {
                rezultat += aux;
            }
        }
        String textFinal = rezultat;
        System.out.println(textFinal);

    }


    //todo:     d) care este al treilea cuvant citit?
    // Daca sirul nu are cel putin 3 cuvinte se va afisa un mesaj.
    public static void ex2D() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cuvintele: ");
        String cuv = scanner.nextLine();
        String[] splitCuvinte = cuv.split("");

        if (splitCuvinte.length < 3) {
            System.out.println("introduceti cel putin 3 cuvinte ");
            return;
        }
        System.out.println("al treilea cuvant din sir este : " + splitCuvinte[2]);

    }


    //EX3
    //todo: SE CITESTE UN SIR DE MAXIM 100 DE CUVINTE DE LA TASTATURA, SEPARATE PRIN UNUL SAU MAI MULTE SPATII

    //todo:     a) sa se stearga toate spatiile multiple
    public static void ex3A() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cuvintele: ");
        String cuv = scanner.nextLine();
        String aux = cuv.replaceAll("\\s+", " ");
        System.out.println("sirul final este :" + aux);

    }


    //todo:     b) sa se faca prima litera din fiecare cuvant mare si sa se inlocuiasca ultima litera cu urmatoarea din alfabet
    public static void ex3B() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cuvintele: ");
        String sirIntrodus = scanner.nextLine();
        String[] cuvinte = sirIntrodus.split(" ");
        StringBuilder aux = new StringBuilder();
        for (String cuv : cuvinte) {
            char[] litere = cuv.toCharArray();
            litere[0] = Character.toUpperCase(litere[0]);
            int lastIndex = litere.length - 1;
            if (Character.isLowerCase(litere[lastIndex])) {
                char newLastLetter = (char) (litere[lastIndex] + 1);
                litere[lastIndex] = Character.toUpperCase(newLastLetter);
            }
            aux.append(new String(litere)).append(" ");
            System.out.println("sirul final este: " + aux.toString().trim());

        }
    }


        //todo:     c)stergeti toate C si dublati toate literele D
        // (C si D - un caracter citit de la tastaura)
        public static void ex3C() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduceti sirul de caractere: ");
            String sirCuv = scanner.nextLine();

            sirCuv = sirCuv.replace("C", "");

            StringBuilder rez = new StringBuilder();
            for (char c : sirCuv.toCharArray()) {
                if (c == 'D') {
                    rez.append("DD");
                } else {
                    rez.append(c);
                }
            }

            System.out.println("Rezultat: " + rez);
        }



    }